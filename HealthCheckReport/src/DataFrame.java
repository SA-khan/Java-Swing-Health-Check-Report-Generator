/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saad.ahmed
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DataFrame extends javax.swing.JFrame implements Runnable {

    
    public static String ip_address;
    public static String user;
    public static String password;
    public static String database_name;
    public static String database_type;
    //public static String product2;
    public static int Ambit;
    public static int Ambit_Corporate;
    public static int Mobile;
    public static int Nimbus;
    public static int Novus;
    public static int ODS;
    public static int RDV;
    public static int Vision;
    public static int Unison;
    public static int Others;
    public static int remember_me;
    //public static String[] query_selected = new String[50];
    
    //System Internal Variables
    public static String windows_release;
    public static String windows_service_pack_level;
    public static int windows_sku;
    public static int os_language_version;
    public static String os_language_preferance;
    public static String operating_system;
    public static int processor_cores;
    public static long free_memory;
    public static long max_memory;
    public static long total_memory_available_to_JVM;
    public static String[] drive;
    public static long[] drive_total_space;
    public static long[] drive_free_space;
    public static long[] drive_usable_space;
    
    
    public static String DatabaseVersion;
    public static String DatabaseID;
    public static String DBOwner;
    public static String DBLocation;
    public static int DbMDF;
    public static int DbLDF;
    public static String DbCreated;
    public static String DbCompatibility;
    
    
    public static String CurrentDate;
    
    /**
     * 
     */
    //Unison Variables
    public static JCheckBox chkTotalUser;
    public static int flagTotalUser;
    public static int Unison_TotalUsers;
    //public static int Unison_TotalUsers;
    public static JCheckBox chkInactiveUser;
    public static int flagInactiveUsers;
    public static int Unison_InactiveUsers;
    public static JCheckBox chkTotalUsersLoginPerDay;
    public static int flagTotalUsersLoginPerDay;
    public static int Unison_TotalUsersLoginPerDay;
    public static JCheckBox chkSessionEntryPerDay;
    public static int flagSessionEntryPerDay;
    public static int Unison_SessionEntryPerDay;
    public static JCheckBox chkBranchesQuerterwise;
    public static int flagBranchesQuerterwise;
    public static int Unison_BranchesQuerterwise;
    public static JCheckBox chkEformLogged;
    public static int flagEformLogged;
    public static int Unison_EformLogged;
    public static JCheckBox chkComplaintLogged;
    public static int flagComplaintLogged;
    public static int Unison_ComplaintLogged;
    public static JCheckBox chkQuertzPerDay;
    public static int flagQuertzPerDay;
    public static int Unison_QuertzPerDay;
    public static JCheckBox chkAverageSessionTimePerDay;
    public static int flagAverageSessionTimePerDay;
    public static String Unison_AverageSessionTimePerDay;
    
    Component[] componentClear;
    Component[] componentSelect;
    
    
    /**
     * Creates new form DataFrame
     */
    public DataFrame() {
        initComponents();
        System.out.println("Initiated DataFrame Form..");
        
        //Hiding Progress Bar and Label
        //pgsFetching.setVisible(false);
        lblFetching.setVisible(false);
        
        BeginForm form = new BeginForm();
        ip_address = form.ip_address;
        user = form.user;
        password = form.password;
        database_name = form.database_name;
        database_type = form.database_type;
        //product2 = form.product;
        remember_me = form.remember_me;
        //System.out.println(product2);
        Ambit = form.Ambit;
        Ambit_Corporate = form.Ambit_Corporate;
        Mobile = form.Mobile;
        Nimbus = form.Nimbus;
        Novus = form.Novus;
        ODS = form.ODS;
        RDV = form.RDV;
        Vision = form.Vision;
        Unison = form.Unison;
        Others = form.Others;
        System.out.println("Server: " + ip_address);
        System.out.println("User: " + user);
        System.out.println("Password: " + password);
        System.out.println("Database Name: " + database_name);
        System.out.println("Database Type: " + database_type);
        System.out.println("Ambit Check: " + Ambit);
        System.out.println("Ambit Corporate Check: " + Ambit_Corporate);
        System.out.println("Mobile App Check: " + Mobile);
        System.out.println("Novus Check: " + Novus);
        System.out.println("Nimbus Check: " + Nimbus);
        System.out.println("ODS Check: " + ODS);
        System.out.println("RDV Check: " + RDV);
        System.out.println("Vision Check: " + Vision);
        System.out.println("Unison Check: " + Unison);
        System.out.println("Thers Check: " + Others);
        System.out.println("Remember Me: " + remember_me);
        
        //
        // Check Box Login 1 - Implementing Checkboxes on Selection Mode
        //
        
        /**
         *  Others Block Start Here
         */
        
        if(Others == 1) {
        
        System.out.println("You Selected Others..");
        
        try {
           String myUrl = "jdbc:sqlserver://"+ip_address;
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection conn = DriverManager.getConnection(myUrl, user, password);
           String query = "USE "+database_name+";SELECT getdate() As [Current Date]";
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery(query);
           while (rs.next()) {
              String date = rs.getString("Current Date");
              System.out.println("Current Date:" + date);
              CurrentDate = String.valueOf(date);
           }
           st.close();
        }
        catch (Exception e) {
           System.err.println("Got an exception! ");
           System.err.println(e.getMessage());
        } 
            
        }
        
        /**
         *  Others Block End Here
         */
        
        /**
         * Ambit Block Start Here
         */
        
        if(Ambit == 1) {
            
            System.out.println("You Selected Ambit..");
            
            try {
                
                String myUrl = "jdbc:sqlserver://"+ip_address;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection(myUrl, user, password);
                String query = "USE "+database_name+";SELECT getdate() As [Current Date]";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    
                    String date = rs.getString("Current Date");
                    System.out.println("Current Date:" + date);
                    CurrentDate = String.valueOf(date);
                }
                st.close();
            }
            catch (Exception e) {
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }
            
            JCheckBox checkBox = new JCheckBox("Check me!");
            JCheckBox checkBox2 = new JCheckBox("Hello World!");
            //System.out.println(getFrames().toString());  
            this.add(checkBox);
            this.add(checkBox2);
            this.revalidate();
            this.repaint();
            
        }
        
        /**
         * Ambit Block End Here
         */
        
        /**
         * ======================================================================================================
         **/
        
        /**
         * Unison Block Start Here
         */
        
        //
        // IF Only Unison is selected.
        //
        if(Unison == 1) {
            
            System.out.println("You Selected Unison..");
        
            //JScrollPane jScrollPane1 = new JScrollPane(pnlQueries);
        
            chkTotalUser = new JCheckBox("Total Users", false);
            chkTotalUser.setName("TotalUser");
            chkTotalUser.setBounds(10, 10, 150, 20);
            chkTotalUser.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(chkTotalUser);
            
           //jScrollPane1.add(chkTotalUser);
        
            chkInactiveUser = new JCheckBox("Inactive Users", false);
            chkInactiveUser.setBounds(250, 10, 150, 20);
            chkInactiveUser.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(chkInactiveUser);
        
            chkTotalUsersLoginPerDay = new JCheckBox("Total Users Login Per Day", false);
            chkTotalUsersLoginPerDay.setBounds(450, 10, 250, 20);
            chkTotalUsersLoginPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(chkTotalUsersLoginPerDay);
        
            chkSessionEntryPerDay = new JCheckBox("Session Entry Per Day", false);
            chkSessionEntryPerDay.setBounds(720, 10, 250, 20);
            chkSessionEntryPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(chkSessionEntryPerDay);
        
            JCheckBox field5 = new JCheckBox("Session Activity Log Detail", false);
            field5.setBounds(950, 10, 250, 20);
            field5.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(field5);
        
            chkBranchesQuerterwise = new JCheckBox("Branches Querterwise", false);
            chkBranchesQuerterwise.setBounds(10, 60, 250, 20);
            chkBranchesQuerterwise.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(chkBranchesQuerterwise);
        
            chkEformLogged = new JCheckBox("Eform Logged", false);
            chkEformLogged.setBounds(250, 60, 250, 20);
            chkEformLogged.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(chkEformLogged);
        
            chkComplaintLogged = new JCheckBox("Complaint Logged", false);
            chkComplaintLogged.setBounds(450, 60, 250, 20);
            chkComplaintLogged.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(chkComplaintLogged);
        
            JCheckBox field9 = new JCheckBox("SEC Login History", false);
            field9.setBounds(720, 60, 250, 20);
            field9.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(field9);
        
            JCheckBox field10 = new JCheckBox("SEC Login History SLH", false);
            field10.setBounds(950, 60, 250, 20);
            field10.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(field10);
        
            JCheckBox field11 = new JCheckBox("Session History", false);
            field11.setBounds(10, 110, 250, 20);
            field11.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(field11);
        
            chkQuertzPerDay = new JCheckBox("Quertz Per Day", false);
            chkQuertzPerDay.setBounds(250, 110, 250, 20);
            chkQuertzPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(chkQuertzPerDay);
        
            chkAverageSessionTimePerDay = new JCheckBox("Average Session Time Per Day", false);
            chkAverageSessionTimePerDay.setBounds(450, 110, 250, 20);
            chkAverageSessionTimePerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
            pnlQueries.add(chkAverageSessionTimePerDay);
        
            //pnlQueries.setBounds(100, 10, 100, 300);
        
            pnlQueries.revalidate();
            pnlQueries.repaint();
        
        }
        
        /**
         * Unison Block End Here
         */
        
        //End Logic 1
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        pnlQueries = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnSelectAll = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        pgsFetching = new javax.swing.JProgressBar();
        lblFetching = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health Check Report Generator");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText(" Select Data To Fetch");

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Back");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setBorderPainted(false);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainTitle2.png"))); // NOI18N
        jLabel16.setMaximumSize(new java.awt.Dimension(120, 70));
        jLabel16.setMinimumSize(new java.awt.Dimension(120, 70));
        jLabel16.setOpaque(true);
        jLabel16.setPreferredSize(new java.awt.Dimension(120, 70));

        javax.swing.GroupLayout pnlQueriesLayout = new javax.swing.GroupLayout(pnlQueries);
        pnlQueries.setLayout(pnlQueriesLayout);
        pnlQueriesLayout.setHorizontalGroup(
            pnlQueriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlQueriesLayout.setVerticalGroup(
            pnlQueriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Fetch Data >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSelectAll.setText("Select All");
        btnSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAllActionPerformed(evt);
            }
        });

        btnClearAll.setText("Clear All");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        pgsFetching.setOpaque(true);
        pgsFetching.setStringPainted(true);

        lblFetching.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFetching.setText("Fetching Data..");
        lblFetching.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlQueries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelectAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClearAll)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addComponent(pgsFetching, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(571, 571, 571)
                .addComponent(lblFetching)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSelectAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(btnClearAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQueries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgsFetching, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFetching)
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //Loader Progess Bar and Progress Label Visibility Sets to True
        pgsFetching.setVisible(true);
        lblFetching.setVisible(true);
        
        //Creating Instance of Previous Form to Get Information of user prompted fields.
        BeginForm form = new BeginForm();
        
        // Get IP Address Entered in Previous form
        ip_address = form.ip_address;
        
        // Get User Field Entered in Previous form
        user = form.user;
        
        // Get Password Field Entered in Previous form
        password = form.password;
        
        // Get Database Name Field Entered in Previous form
        database_name = form.database_name;
        
        // Get Database Vendor Field Entered in Previous form
        database_type = form.database_type;
        
        // Get Remember Me Field Entered in Previous form (Optional)
        remember_me = form.remember_me;
        
        // Loader Progess Bar and Progress Label Current Status sets to 10.
        pgsFetching.setValue(10);
        lblFetching.setText("10%");
        
        //System Information End
        
        //
        if(database_type == "Microsoft SQL Server") {
         
        //System Information Start
        
        /**
         * 
         */
        //processor_cores = Runtime.getRuntime().availableProcessors();
        //System.out.println("Available processors (cores): " + processor_cores);
        
        /* Total amount of free memory available to the JVM */
        //free_memory = Runtime.getRuntime().freeMemory();
        //System.out.println("Free memory (bytes): " + free_memory);

        /* This will return Long.MAX_VALUE if there is no preset limit */
        //max_memory = Runtime.getRuntime().maxMemory();
        /* Maximum amount of memory the JVM will attempt to use */
        //System.out.println("Maximum memory (bytes): " + (max_memory == Long.MAX_VALUE ? "no limit" : max_memory));

        /* Total memory currently available to the JVM */
        //total_memory_available_to_JVM = Runtime.getRuntime().totalMemory();
        //System.out.println("Total memory available to JVM (bytes): " + total_memory_available_to_JVM);

        /* Get a list of all filesystem roots on this system */
        //File[] roots = File.listRoots();
        //drive = new String[roots.length];
        //drive_total_space = new long[roots.length];
        //drive_free_space = new long[roots.length];
        //drive_usable_space = new long[roots.length];
        //int localflag = 0;

        /* For each filesystem root, print some info */
        //for (File root : roots) {
        //drive[localflag] = root.getAbsolutePath();
        //drive_total_space[localflag] = root.getTotalSpace();
        //drive_free_space[localflag] = root.getFreeSpace();
        //drive_usable_space[localflag] = root.getUsableSpace();
        //System.out.println("File system root: " + root.getAbsolutePath());
        //System.out.println("Total space (bytes): " + root.getTotalSpace());
        //System.out.println("Free space (bytes): " + root.getFreeSpace());
        //System.out.println("Usable space (bytes): " + root.getUsableSpace());
        //localflag = localflag+1;
        //}
        
        /**
         * New Code 101
         */
        
        //SELECT * FROM sys.dm_os_windows_info;
        
        try {
 
            // create our mysql database connection
            String myUrl = "jdbc:sqlserver://"+ip_address;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(myUrl, user, password);
      

            String query = "USE "+database_name+";SELECT * FROM sys.dm_os_windows_info";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                windows_release = rs.getString("windows_release");
                windows_service_pack_level = rs.getString("windows_service_pack_level");
                windows_sku = rs.getInt("windows_sku");
                os_language_version = rs.getInt("os_language_version");
                System.out.println("Windows Release" + windows_release);
                System.out.println("Windows Service Pack Level" + windows_service_pack_level);
                System.out.println("Windows SKU" + windows_sku);
                System.out.println("O.S. Language Version" + os_language_version);
            }
            st.close();
        }
        catch (Exception e) {
            System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
            System.err.println(e.getMessage());
        }
        
        switch(windows_release){
            case "10.0*":
                operating_system = "Windows Server 2016 ";
                break;
            case "6.3*":
                operating_system = "Windows Server 2012 R2 ";
                break;
            case "6.2":
                operating_system = "Windows Server 2012 ";
                break;
            case "6.1":
                operating_system = "Windows Server 2008 R2 ";
                break;
            case "6.0":
                operating_system = "Windows Server 2008 ";
                break;
            case "5.2":
                operating_system = "Windows Server 2003 R2 ";
                break;
            case "5.1":
                operating_system = "Windows XP ";
                break;
            case "5.0":
                operating_system = "Windows 2000 ";
                break;
            default:
                operating_system = "";
        }
        
        switch(windows_sku){
            case 0:
                operating_system += "An unknown product";
                break;
            case 1:
                operating_system += "Ultimate";
                break;
            case 2:
                operating_system += "Home Basic";
                break;   
            case 3:
                operating_system += "Home Premium";
                break;    
            case 4:
                operating_system += "Enterprise";
                break;
            case 5:
                operating_system += "Home Basic N";
                break;    
            case 6:
                operating_system += "Business";
                break;    
            case 7:
                operating_system += "Server Standard";
                break;   
            case 8:
                operating_system += "Server Datacenter (full installation)";
                break; 
            case 9:
                operating_system += "Windows Small Business Server";
                break;
            case 10:
                operating_system += "Server Enterprise (full installation)";
                break;
            case 11:
                operating_system += "Starter";
                break;
            case 12:
                operating_system += "Server Datacenter (core installation)";
                break;
            case 13:
                operating_system += "Server Standard (core installation)";
                break;    
            case 14:
                operating_system += "Server Enterprise (core installation)";
                break;
            case 15:
                operating_system += "Server Enterprise for Itanium-based Systems";
                break;
            case 16:
                operating_system += "Business N";
                break;
            case 17:
                operating_system += "Web Server (full installation)";
                break;
            case 18:
                operating_system += "HPC Edition";
                break;
            case 19:
                operating_system += "Windows Storage Server 2008 R2 Essentials";
                break;    
            case 20:
                operating_system += "Storage Server Express";
                break;    
            case 21:
                operating_system += "Storage Server Standard";
                break;
            case 22:
                operating_system += "Storage Server Workgroup";
                break;   
            case 23:
                operating_system += "Storage Server Enterprise";
                break;    
            case 24:
                operating_system += "Windows Server 2008 for Windows Essential Server Solutions";
                break;
            case 25:
                operating_system += "Small Business Server Premium";
                break;    
            case 26:
                operating_system += "Home Premium N";
                break;    
            case 27:
                operating_system += "Enterprise N";
                break;   
            case 28:
                operating_system += "Ultimate N";
                break; 
            case 29:
                operating_system += "Web Server (core installation)";
                break;
            case 30:
                operating_system += "Windows Essential Business Server Management Server";
                break;
            case 31:
                operating_system += "Windows Essential Business Server Security Server";
                break;
            case 32:
                operating_system += "Windows Essential Business Server Messaging Server";
                break;
            case 33:
                operating_system += "Server Foundation";
                break;    
            case 34:
                operating_system += "Windows Home Server 2011";
                break;
            case 35:
                operating_system += "Windows Server 2008 without Hyper-V for Windows Essential Server Solutions";
                break;
            case 36:
                operating_system += "Server Standard without Hyper-V";
                break;
            case 37:
                operating_system += "Server Datacenter without Hyper-V (full installation)";
                break;
            case 38:
                operating_system += "Server Enterprise without Hyper-V (full installation)";
                break;
            case 39:
                operating_system += "Server Datacenter without Hyper-V (core installation)";
                break;    
            case 40:
                operating_system += "Server Standard without Hyper-V (core installation)";
                break;    
            case 41:
                operating_system += "Server Enterprise without Hyper-V (core installation)";
                break;
            case 42:
                operating_system += "Microsoft Hyper-V Server";
                break;   
            case 43:
                operating_system += "Storage Server Express (core installation)";
                break;    
            case 44:
                operating_system += "Storage Server Standard (core installation)";
                break;
            case 45:
                operating_system += "Storage Server Workgroup (core installation)";
                break;    
            case 46:
                operating_system += "Storage Server Enterprise (core installation)";
                break;    
            case 47:
                operating_system += "Starter N";
                break;   
            case 48:
                operating_system += "Professional";
                break; 
            case 49:
                operating_system += "Professional N";
                break;
            case 50:
                operating_system += "Windows Small Business Server 2011 Essentials";
                break;
            case 51:
                operating_system += "Server For SB Solutions";
                break;
            case 52:
                operating_system += "Server Solutions Premium";
                break;
            case 53:
                operating_system += "Server Solutions Premium (core installation)";
                break;    
            case 54:
                operating_system += "Server For SB Solutions EM";
                break;
            case 55:
                operating_system += "Server For SB Solutions EM";
                break;
            case 56:
                operating_system += "Windows MultiPoint Server";
                break;
            case 57:
                operating_system += "";
                break;
            case 58:
                operating_system += "";
                break;
            case 59:
                operating_system += "Windows Essential Server Solution Management";
                break;    
            case 60:
                operating_system += "Windows Essential Server Solution Additional";
                break;    
            case 61:
                operating_system += "Windows Essential Server Solution Management SVC";
                break;
            case 62:
                operating_system += "Windows Essential Server Solution Additional SVC";
                break;   
            case 63:
                operating_system += "Small Business Server Premium (core installation)";
                break;    
            case 64:
                operating_system += "Server Hyper Core V";
                break;
            case 65:
                operating_system += "";
                break;    
            case 66:
                operating_system += "Starter E";
                break;    
            case 67:
                operating_system += "Home Basic E";
                break;   
            case 68:
                operating_system += "Home Premium E";
                break; 
            case 69:
                operating_system += "Professional E";
                break;
            case 70:
                operating_system += "Enterprise E";
                break;
            case 71:
                operating_system += "Ultimate E";
                break;
            case 72:
                operating_system += "Server Enterprise (evaluation installation)";
                break;
            case 73:
                operating_system += "";
                break;    
            case 74:
                operating_system += "";
                break;
            case 75:
                operating_system += "";
                break;
            case 76:
                operating_system += "Windows MultiPoint Server Standard (full installation)";
                break;
            case 77:
                operating_system += "Windows MultiPoint Server Premium (full installation)";
                break;
            case 78:
                operating_system += "";
                break;
            case 79:
                operating_system += "Server Standard (evaluation installation)";
                break;    
            case 80:
                operating_system += "Server Datacenter (evaluation installation)";
                break;    
            case 81:
                operating_system += "";
                break;
            case 82:
                operating_system += "";
                break;   
            case 83:
                operating_system += "";
                break;    
            case 84:
                operating_system += "Enterprise N (evaluation installation)";
                break;
            case 85:
                operating_system += "";
                break;    
            case 86:
                operating_system += "";
                break;    
            case 87:
                operating_system += "";
                break;   
            case 88:
                operating_system += "";
                break; 
            case 89:
                operating_system += "";
                break;
            case 90:
                operating_system += "";
                break;
            case 91:
                operating_system += "";
                break;
            case 92:
                operating_system += "";
                break;
            case 93:
                operating_system += "";
                break;    
            case 94:
                operating_system += "";
                break;
            case 95:
                operating_system += "Storage Server Workgroup (evaluation installation)";
                break;
            case 96:
                operating_system += "Storage Server Standard (evaluation installation)";
                break;
            case 97:
                operating_system += "";
                break;
            case 98:
                operating_system += "Windows 8 N";
                break;
            case 99:
                operating_system += "Windows 8 China";
                break;    
            case 100:
                operating_system += "Windows 8 Single Language";
                break; 
            case 101:
                operating_system += "Windows 8";
                break;
            case 102:
                operating_system += "";
                break;    
            case 103:
                operating_system += "Professional with Media Center";
                break;
            default:
                operating_system += "Unknown SKU";
        }
        
        try {
        
        String[] os_lang_hex = {"0x1000", "0x1000", "0x1000"
, "0x1000"
, "0x0036"
, "0x1000"
, "0x0436"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x001C"
, "0x041C"
, "0x1000"
, "0x0084"
, "0x0484"
, "0x1000"
, "0x1000"
, "0x005E"
, "0x045E"
, "0x0001"
, "0x1401"
, "0x3C01"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0c01"
, "0x1000"
, "0x0801"
, "0x1000"
, "0x2C01"
, "0x3401"
, "0x3001"
, "0x1001"
, "0x1000"
, "0x1801"
, "0x2001"
, "0x1000"
, "0x4001"
, "0x0401"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x2801"
, "0x1C01"
, "0x3801"
, "0x1000"
, "0x2401"
, "0x002B"
, "0x042B"
, "0x004D"
, "0x044D"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x742C"
, "0x082C"
, "0x002C"
, "0x782C"
, "0x042C"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0045"
, "0x0845"
, "0x0445"
, "0x1000"
, "0x1000"
, "0x006D"
, "0x046D"
, "0x002D"
, "0x042D"
, "0x0023"
, "0x0423"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x641A"
, "0x201A"
, "0x681A"
, "0x781A"
, "0x141A"
, "0x007E"
, "0x047E"
, "0x0002"
, "0x0402"
, "0x0055"
, "0x0455"
, "0x0003"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0403"
, "0x1000"
, "0x0092"
, "0x7c92"
, "0x0492"
, "0x1000"
, "0x005C"
, "0x7c5C"
, "0x045C"
, "0x1000"
, "0x1000"
, "0x0004"
, "0x7804"
, "0x0804"
, "0x1004"
, "0x7C04"
, "0x0C04"
, "0x1404"
, "0x0404"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0083"
, "0x0483"
, "0x001A"
, "0x041A"
, "0x101A"
, "0x0005"
, "0x0405"
, "0x0006"
, "0x0406"
, "0x1000"
, "0x008C"
, "0x048C"
, "0x0065"
, "0x0465"
, "0x1000"
, "0x1000"
, "0x0013"
, "0x1000"
, "0x0813"
, "0x1000"
, "0x1000"
, "0x0413"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0C51"
, "0x1000"
, "0x1000"
, "0x0009"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0C09"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x2809"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1009"
, "0x2409"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x3C09"
, "0x4009"
, "0x1809"
, "0x1000"
, "0x1000"
, "0x2009"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x4409"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1409"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x3409"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x4809"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1C09"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x2c09"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0809"
, "0x0409"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x3009"
, "0x1000"
, "0x1000"
, "0x0025"
, "0x0425"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0038"
, "0x1000"
, "0x0438"
, "0x0064"
, "0x0464"
, "0x000B"
, "0x040B"
, "0x000C"
, "0x1000"
, "0x080C"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x2c0C"
, "0x0c0C"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x240C"
, "0x300C"
, "0x1000"
, "0x1000"
, "0x040C"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x3c0C"
, "0x140C"
, "0x1000"
, "0x340C"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x380C"
, "0x1000"
, "0x1000"
, "0x180C"
, "0x200C"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x280C"
, "0x1000"
, "0x100C"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0062"
, "0x0462"
, "0x1000"
, "0x1000"
, "0x0067"
, "0x7C67"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0867"
, "0x1000"
, "0x0056"
, "0x0456"
, "0x1000"
, "0x1000"
, "0x0037"
, "0x0437"
, "0x0007"
, "0x0C07"
, "0x1000"
, "0x0407"
, "0x1000"
, "0x1407"
, "0x1007"
, "0x0807"
, "0x0008"
, "0x1000"
, "0x0408"
, "0x006F"
, "0x046F"
, "0x0074"
, "0x0474"
, "0x0047"
, "0x0447"
, "0x1000"
, "0x1000"
, "0x0068"
, "0x7C68"
, "0x1000"
, "0x1000"
, "0x0468"
, "0x0075"
, "0x0475"
, "0x000D"
, "0x040D"
, "0x0039"
, "0x0439"
, "0x000E"
, "0x040E"
, "0x000F"
, "0x040F"
, "0x0070"
, "0x0470"
, "0x0021"
, "0x0421"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x005D"
, "0x7C5D"
, "0x085D"
, "0x785D"
, "0x045d"
, "0x003C"
, "0x083C"
, "0x0010"
, "0x0410"
, "0x1000"
, "0x0810"
, "0x1000"
, "0x0011"
, "0x0411"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x004B"
, "0x044B"
, "0x0060"
, "0x0460"
, "0x1000"
, "0x003F"
, "0x043F"
, "0x0053"
, "0x0453"
, "0x0086"
, "0x0486"
, "0x1000"
, "0x1000"
, "0x0087"
, "0x0487"
, "0x0041"
, "0x0441"
, "0x1000"
, "0x1000"
, "0x0057"
, "0x0457"
, "0x0012"
, "0x0412"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0040"
, "0x0440"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0054"
, "0x0454"
, "0x0026"
, "0x0426"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0027"
, "0x0427"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x7C2E"
, "0x082E"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x006E"
, "0x046E"
, "0x1000"
, "0x1000"
, "0x002F"
, "0x042F"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x003E"
, "0x083E"
, "0x043E"
, "0x004C"
, "0x044C"
, "0x003A"
, "0x043A"
, "0x1000"
, "0x1000"
, "0x0081"
, "0x0481"
, "0x007A"
, "0x047A"
, "0x004E"
, "0x044E"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x007C"
, "0x047C"
, "0x0050"
, "0x7850"
, "0x0450"
, "0x7C50"
, "0x0850"
, "0x0C50"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0061"
, "0x0861"
, "0x0461"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0014"
, "0x7C14"
, "0x0414"
, "0x7814"
, "0x0814"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0082"
, "0x0482"
, "0x0048"
, "0x0448"
, "0x0072"
, "0x0472"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0063"
, "0x0463"
, "0x0029"
, "0x1000"
, "0x0429"
, "0x0015"
, "0x0415"
, "0x0016"
, "0x1000"
, "0x0416"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0816"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x05FE"
, "0x0501"
, "0x09FF"
, "0x0046"
, "0x7C46"
, "0x0446"
, "0x0846"
, "0x006B"
, "0x046B"
, "0x086B"
, "0x0C6B"
, "0x1000"
, "0x1000"
, "0x0018"
, "0x0818"
, "0x0418"
, "0x0017"
, "0x0417"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0019"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0819"
, "0x0419"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0085"
, "0x0485"
, "0x1000"
, "0x1000"
, "0x703B"
, "0x243B"
, "0x7C3B"
, "0x103B"
, "0x143B"
, "0x003B"
, "0x0C3B"
, "0x043B"
, "0x083B"
, "0x743B"
, "0x203B"
, "0x783B"
, "0x183B"
, "0x1C3B"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x004F"
, "0x044F"
, "0x0091"
, "0x0491"
, "0x1000"
, "0x1000"
, "0x6C1A"
, "0x1C1A"
, "0x301A"
, "0x281A"
, "0x0C1A"
, "0x701A"
, "0x7C1A"
, "0x181A"
, "0x2c1A"
, "0x241A"
, "0x081A"
, "0x006C"
, "0x046C"
, "0x0032"
, "0x0832"
, "0x0432"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0059"
, "0x7C59"
, "0x0859"
, "0x005B"
, "0x045B"
, "0x001B"
, "0x041B"
, "0x0024"
, "0x0424"
, "0x1000"
, "0x1000"
, "0x0077"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0477"
, "0x0030"
, "0x0430"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x000A"
, "0x2C0A"
, "0x1000"
, "0x200A"
, "0x400A"
, "0x1000"
, "0x340A"
, "0x240A"
, "0x140A"
, "0x5c0A"
, "0x1c0A"
, "0x300A"
, "0x440A"
, "0x1000"
, "0x100A"
, "0x480A"
, "0x580A"
, "0x080A"
, "0x4C0A"
, "0x180A"
, "0x3C0A"
, "0x280A"
, "0x1000"
, "0x500A"
, "0x040A"
, "0x0c0A"
, "0x540A"
, "0x380A"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x001D"
, "0x1000"
, "0x081D"
, "0x041D"
, "0x005A"
, "0x045A"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0028"
, "0x7C28"
, "0x0428"
, "0x005F"
, "0x7C5F"
, "0x085F"
, "0x0049"
, "0x0449"
, "0x1000"
, "0x1000"
, "0x0849"
, "0x1000"
, "0x1000"
, "0x0044"
, "0x0444"
, "0x004A"
, "0x044A"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x001E"
, "0x041E"
, "0x0051"
, "0x1000"
, "0x0451"
, "0x1000"
, "0x1000"
, "0x0073"
, "0x0873"
, "0x0473"
, "0x1000"
, "0x1000"
, "0x0031"
, "0x0431"
, "0x001F"
, "0x1000"
, "0x041F"
, "0x0042"
, "0x0442"
, "0x0022"
, "0x0422"
, "0x002E"
, "0x042E"
, "0x0020"
, "0x0820"
, "0x0420"
, "0x0080"
, "0x0480"
, "0x1000"
, "0x1000"
, "0x7843"
, "0x0843"
, "0x0043"
, "0x7C43"
, "0x0443"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0803"
, "0x0033"
, "0x0433"
, "0x002A"
, "0x042A"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x1000"
, "0x0052"
, "0x0452"
, "0x1000"
, "0x1000"
, "0x0088"
, "0x0488"
, "0x0034"
, "0x0434"
, "0x1000"
, "0x1000"
, "0x0078"
, "0x0478"
, "0x006A"
, "0x1000"
, "0x046A"
, "0x1000"
, "0x1000"
, "0x0035"
, "0x0435"
};
        
        System.out.println("-- Hex Length: " +os_lang_hex.length);
        System.out.println("-- os_language_version: " +os_language_version);
        /**
         * 
         */
        /**
         * 
         */
        int[] os_language_decimal = new int[830];
        for(int i = 0; i < os_lang_hex.length + 1;i++){
            os_language_decimal[i] = 0;
        }
        
        
        for(int i = 0; i < os_lang_hex.length;i++){
            os_language_decimal[i] = hexadecimalToDecimal(os_lang_hex[i]);
            if(os_language_version == os_language_decimal[i])
               switch(os_language_version){
               case 1033:
                   os_language_preferance = "en-US";
                   break;
               case 4096:
                   os_language_preferance = "en-PK";
                   break;
               default:
                   os_language_preferance = "Unknown";
               }
            }
        
        }
        
        catch(Exception ex) {
           System.out.println("Exception Occured: " +ex.getMessage());
        }
        
        System.out.println("Operating System: " +operating_system);
        System.out.println("Operating System Language Preferance: " +os_language_preferance);
        
        /**
         * New Code 101 End
         */

            /**
             * 
             * Fetch Data on Others 
             * 
             */
            
            if(Others == 1) {
            
                try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      

                  String query = "USE "+database_name+";SELECT name As [DBName], database_id as [DBid],create_date as [DBcreated],state as [DBState], compatibility_level as [DBcomp]  FROM sys.databases where name = db_name()";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    String dname = rs.getString("DBName");
                    String dcomp= rs.getString("DBcomp");
                    Date ddate = rs.getDate("DBcreated");
                    int did = rs.getInt("DBid");
                    System.out.println(dname);
                    System.out.println(dcomp);
                    System.out.println(ddate);
                    System.out.println(did);
                    DatabaseID = String.valueOf(did);
                    DbCreated = String.valueOf(ddate);
                    DbCompatibility = dcomp;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
                  System.err.println(e.getMessage());
                }  
            
            
            /**
             * 
             * MDF Size
             */
            
            pgsFetching.setValue(20);
            lblFetching.setText("Getting MDF File Size");
            
             try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      

                  String query = "USE "+database_name+";SELECT DB_NAME(database_id) AS DBName,Name AS Logical_Name, Physical_Name,(size*8)/1024 SizeMB FROM sys.master_files WHERE DB_NAME(database_id) = '"+database_name+"' and physical_name like '%mdf%'";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    int mdf = rs.getInt("SizeMB");
                    //int did = rs.getInt("DBid");
                    System.out.println(mdf);
                    DbMDF = mdf;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
                  System.err.println(e.getMessage());
                }  
             
             /**
             * 
             * LDF Size
             */
             
            pgsFetching.setValue(30);
            lblFetching.setText("Getting LDF File Size");
             
             try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      

                  String query = "USE "+database_name+";SELECT DB_NAME(database_id) AS DBName,Name AS Logical_Name, Physical_Name,(size*8)/1024 SizeMB FROM sys.master_files WHERE DB_NAME(database_id) = '"+database_name+"' and physical_name like '%ldf%'";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    int ldf = rs.getInt("SizeMB");
                    //int did = rs.getInt("DBid");
                    System.out.println(ldf);
                    DbLDF = ldf;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
                  System.err.println(e.getMessage());
                } 
        
            /**
             * Getting Database Version Start
             */
             
            pgsFetching.setValue(45);
            lblFetching.setText("Getting Version Information");
             
            try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      
                  // our SQL SELECT query. 
                  // if you only need a few columns, specify them by name instead of using "*"
                  String query = "SELECT @@Version As [VERSION]";

                  // create the java statement
                  Statement st = conn.createStatement();
      
                  // execute the query, and get a java resultset
                  ResultSet rs = st.executeQuery(query);
      
                  // iterate through the java resultset
                  while (rs.next()) {
                    //int id = rs.getInt("id");
                    String database_version = rs.getString("VERSION");
                    //String lastName = rs.getString("last_name");
                    //Date dateCreated = rs.getDate("date_created");
                    //boolean isAdmin = rs.getBoolean("is_admin");
                    //int numPoints = rs.getInt("num_points");
        
                    // print the results
                    //System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
                    System.out.println(database_version);
                    DatabaseVersion = database_version;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Version from Database. ");
                  System.err.println(e.getMessage());
                }    
            
            /**
             * 
             * Database Owner
             */
            
            try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      

                  String query = "USE "+database_name+";SELECT suser_sname( owner_sid ) As DBOwner FROM sys.databases where name = '"+database_name+"'";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    String owner = rs.getString("DBOwner");
                    //int did = rs.getInt("DBid");
                    System.out.println(owner);
                    DBOwner = owner;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
                  System.err.println(e.getMessage());
                } 
            
            /**
             * SELECT physical_name FROM sys.database_files where physical_name like '%mdf%'
             * 
             */
            
            try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      

                  String query = "USE "+database_name+";SELECT physical_name As Location FROM sys.database_files where physical_name like '%mdf%'";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    String dLoc = rs.getString("Location");
                    //int did = rs.getInt("DBid");
                    System.out.println(dLoc);
                    DBLocation = dLoc;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
                  System.err.println(e.getMessage());
                } 
            
                
            }
            
            
            /**
             * 
             * Fetch Data on Unison
             * 
             */
            
            if(Unison == 1) {
                   
            pgsFetching.setValue(10);
            lblFetching.setText("Getting Database General Information");
                
            try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      

                  String query = "USE "+database_name+";SELECT name As [DBName], database_id as [DBid],create_date as [DBcreated],state as [DBState], compatibility_level as [DBcomp]  FROM sys.databases where name = db_name()";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    String dname = rs.getString("DBName");
                    String dcomp= rs.getString("DBcomp");
                    Date ddate = rs.getDate("DBcreated");
                    int did = rs.getInt("DBid");
                    System.out.println(dname);
                    System.out.println(dcomp);
                    System.out.println(ddate);
                    System.out.println(did);
                    DatabaseID = String.valueOf(did);
                    DbCreated = String.valueOf(ddate);
                    DbCompatibility = dcomp;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
                  System.err.println(e.getMessage());
                }  
            
            
            /**
             * 
             * MDF Size
             */
            
            pgsFetching.setValue(20);
            lblFetching.setText("Getting MDF File Size");
            
             try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      

                  String query = "USE "+database_name+";SELECT DB_NAME(database_id) AS DBName,Name AS Logical_Name, Physical_Name,(size*8)/1024 SizeMB FROM sys.master_files WHERE DB_NAME(database_id) = '"+database_name+"' and physical_name like '%mdf%'";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    int mdf = rs.getInt("SizeMB");
                    //int did = rs.getInt("DBid");
                    System.out.println(mdf);
                    DbMDF = mdf;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
                  System.err.println(e.getMessage());
                }  
             
             /**
             * 
             * LDF Size
             */
             
            pgsFetching.setValue(30);
            lblFetching.setText("Getting LDF File Size");
             
             try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      

                  String query = "USE "+database_name+";SELECT DB_NAME(database_id) AS DBName,Name AS Logical_Name, Physical_Name,(size*8)/1024 SizeMB FROM sys.master_files WHERE DB_NAME(database_id) = '"+database_name+"' and physical_name like '%ldf%'";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    int ldf = rs.getInt("SizeMB");
                    //int did = rs.getInt("DBid");
                    System.out.println(ldf);
                    DbLDF = ldf;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
                  System.err.println(e.getMessage());
                } 
        
            /**
             * Getting Database Version Start
             */
             
            pgsFetching.setValue(45);
            lblFetching.setText("Getting Version Information");
             
            try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      
                  // our SQL SELECT query. 
                  // if you only need a few columns, specify them by name instead of using "*"
                  String query = "SELECT @@Version As [VERSION]";

                  // create the java statement
                  Statement st = conn.createStatement();
      
                  // execute the query, and get a java resultset
                  ResultSet rs = st.executeQuery(query);
      
                  // iterate through the java resultset
                  while (rs.next()) {
                    //int id = rs.getInt("id");
                    String database_version = rs.getString("VERSION");
                    //String lastName = rs.getString("last_name");
                    //Date dateCreated = rs.getDate("date_created");
                    //boolean isAdmin = rs.getBoolean("is_admin");
                    //int numPoints = rs.getInt("num_points");
        
                    // print the results
                    //System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
                    System.out.println(database_version);
                    DatabaseVersion = database_version;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Version from Database. ");
                  System.err.println(e.getMessage());
                }    
            
            /**
             * 
             * Database Owner
             */
            
            try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      

                  String query = "USE "+database_name+";SELECT suser_sname( owner_sid ) As DBOwner FROM sys.databases where name = '"+database_name+"'";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    String owner = rs.getString("DBOwner");
                    //int did = rs.getInt("DBid");
                    System.out.println(owner);
                    DBOwner = owner;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
                  System.err.println(e.getMessage());
                } 
            
            /**
             * SELECT physical_name FROM sys.database_files where physical_name like '%mdf%'
             * 
             */
            
            try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      

                  String query = "USE "+database_name+";SELECT physical_name As Location FROM sys.database_files where physical_name like '%mdf%'";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    String dLoc = rs.getString("Location");
                    //int did = rs.getInt("DBid");
                    System.out.println(dLoc);
                    DBLocation = dLoc;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Database Gereral Details from Database. ");
                  System.err.println(e.getMessage());
                } 
            
            
            /**
             * Getting Current Date
             */
            
            pgsFetching.setValue(65);
            lblFetching.setText("Getting Miscellenous Information");
            
            try {
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
                  String query = "USE "+database_name+";SELECT getdate() As [Current Date]";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    String date = rs.getString("Current Date");
                    System.out.println("Current Date:" + date);
                    CurrentDate = String.valueOf(date);
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Got an exception! ");
                  System.err.println(e.getMessage());
                }  
            
            if(chkTotalUser.isSelected()){
                
            pgsFetching.setValue(70);
            lblFetching.setText("Getting Unison Users Information");
            
            try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      
                  // our SQL SELECT query. 
                  // if you only need a few columns, specify them by name instead of using "*"
                  String query = "USE "+database_name+";SELECT COUNT(*) as [TOTAL USERS] FROM SEC_USER";

                  // create the java statement
                  Statement st = conn.createStatement();
      
                  // execute the query, and get a java resultset
                  ResultSet rs = st.executeQuery(query);
      
                  // iterate through the java resultset
                  while (rs.next()) {
                    //int id = rs.getInt("id");
                    String total_user = rs.getString("TOTAL USERS");
                    //String lastName = rs.getString("last_name");
                    //Date dateCreated = rs.getDate("date_created");
                    //boolean isAdmin = rs.getBoolean("is_admin");
                    //int numPoints = rs.getInt("num_points");
        
                    // print the results
                    //System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
                    System.out.println(total_user);
                    Unison_TotalUsers = Integer.valueOf(total_user);
                    flagTotalUser = 1;
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Exception Occurred: At Getting Total User Count from Database. ");
                  System.err.println(e.getMessage());
                }  
            
            }
            
            else {
                    Unison_TotalUsers = 0;
                    flagTotalUser = 0;
            }
            
            if(chkInactiveUser.isSelected()){
                
            pgsFetching.setValue(71);
            lblFetching.setText("Getting Unison Users Information");
                
               try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      
                  // our SQL SELECT query. 
                  // if you only need a few columns, specify them by name instead of using "*"
                  String query = "USE "+database_name+";select count(*) as [TOTAL INCTIVE USERS] from SEC_USER where STATUS_ID = 1";

                  // create the java statement
                  Statement st = conn.createStatement();
      
                  // execute the query, and get a java resultset
                  ResultSet rs = st.executeQuery(query);
      
                  // iterate through the java resultset
                  while (rs.next()) {
                    //int id = rs.getInt("id");
                    int inactiveusers = rs.getInt("TOTAL INCTIVE USERS");
                    //String lastName = rs.getString("last_name");
                    //Date dateCreated = rs.getDate("date_created");
                    //boolean isAdmin = rs.getBoolean("is_admin");
                    //int numPoints = rs.getInt("num_points");
        
                    // print the results
                    //System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
                    System.out.println("Inactive Users:" + inactiveusers);
                    Unison_InactiveUsers = inactiveusers;
                    flagInactiveUsers = 1;
                    
                  }
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Got an exception! ");
                  System.err.println(e.getMessage());
                }    
            }
            
            else {
                    Unison_InactiveUsers = 0;
                    flagInactiveUsers = 0;
            }
            
            if(chkTotalUsersLoginPerDay.isSelected()){
                
            pgsFetching.setValue(72);
            lblFetching.setText("Getting Unison Users Information");
                
               try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      
                  // our SQL SELECT query. 
                  // if you only need a few columns, specify them by name instead of using "*"
                  String query = "USE "+database_name+";SELECT count(distinct Login_ID) As [TOTAL_USERS_LOGGED_PER_DAY] from SEC_ACTIVITY_LOG where  created_on >= CONVERT(date, getdate()-1) and created_on < CONVERT(date, getdate())";

                  // create the java statement
                  Statement st = conn.createStatement();
      
                  // execute the query, and get a java resultset
                  ResultSet rs = st.executeQuery(query);
      
                  // iterate through the java resultset
                  while (rs.next()) {
                    //int id = rs.getInt("id");
                    int TotalUsersLoginPD = rs.getInt("TOTAL_USERS_LOGGED_PER_DAY");
                    //String lastName = rs.getString("last_name");
                    //Date dateCreated = rs.getDate("date_created");
                    //boolean isAdmin = rs.getBoolean("is_admin");
                    //int numPoints = rs.getInt("num_points");
        
                    // print the results
                    //System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
                    System.out.println("Total Users Login Per Day:" + TotalUsersLoginPD);
                    Unison_TotalUsersLoginPerDay = TotalUsersLoginPD;
                    flagTotalUsersLoginPerDay = 1;
                    
                  }
                  
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Got an exception! ");
                  System.err.println(e.getMessage());
                }    
            }
            
            else {
                    Unison_TotalUsersLoginPerDay = 0;
                    flagTotalUsersLoginPerDay = 0;
            }
            
            if(chkSessionEntryPerDay.isSelected()){
               try {
                  // create our mysql database connection
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
      
                  // our SQL SELECT query. 
                  // if you only need a few columns, specify them by name instead of using "*"
                  String query = "USE "+database_name+";SELECT count(*) as SESSION_ENTRY_PD from SESSION_HISTORY where created_on >= Convert(Date, getdate() - 1) and created_on < CONVERT(date, getdate())";

                  // create the java statement
                  Statement st = conn.createStatement();
      
                  // execute the query, and get a java resultset
                  ResultSet rs = st.executeQuery(query);
      
                  // iterate through the java resultset
                  while (rs.next()) {
                    //int id = rs.getInt("id");
                    int SESSION_ENTRY_PD = rs.getInt("SESSION_ENTRY_PD");
                    //String lastName = rs.getString("last_name");
                    //Date dateCreated = rs.getDate("date_created");
                    //boolean isAdmin = rs.getBoolean("is_admin");
                    //int numPoints = rs.getInt("num_points");
        
                    // print the results
                    //System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
                    System.out.println("SESSION ENTRY Per Day:" + SESSION_ENTRY_PD);
                    Unison_SessionEntryPerDay = SESSION_ENTRY_PD;
                    
                  }
                  flagSessionEntryPerDay = 1;
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Got an exception! ");
                  System.err.println(e.getMessage());
                }    
            }
            
            else {
                    Unison_SessionEntryPerDay = 0;
                    flagSessionEntryPerDay = 0;
            }
            
            if(chkBranchesQuerterwise.isSelected()){
               try {
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
                  String query = "USE "+database_name+";SELECT count(*) As BRANCHES FROM ORG_UNIT WHERE CREATED_ON >= DATEADD(MONTH, -3, getdate())";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    int BRANCHES = rs.getInt("BRANCHES");
                    System.out.println("BRANCHES CREATED Querterwise:" + BRANCHES);
                    Unison_BranchesQuerterwise = BRANCHES;
                  }
                  flagBranchesQuerterwise = 1;
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Got an exception! ");
                  System.err.println(e.getMessage());
                }    
            }
            
            else {
                    Unison_BranchesQuerterwise = 0;
                    flagBranchesQuerterwise = 0;
            }
            
            if(chkEformLogged.isSelected()){
               try {
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
                  String query = "USE "+database_name+";select count(*) As EFORM_LOGGED from EFORM where  created_on >= CONVERT(date, getdate()-1) and created_on < CONVERT(date, getdate())";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    int EFORM = rs.getInt("EFORM_LOGGED");
                    System.out.println("Eform Logged:" + EFORM );
                    Unison_EformLogged = EFORM ;
                  }
                  flagEformLogged = 1;
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Got an exception! ");
                  System.err.println(e.getMessage());
                }    
            }
            
            else {
                    Unison_EformLogged = 0;
                    flagEformLogged = 0;
            }
            
            if(chkComplaintLogged.isSelected()){
               try {
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
                  String query = "USE "+database_name+";select count(*)As COMPLAINT_LOGGED from COMPLAINT where  created_on >= CONVERT(date, getdate()-1) and created_on < CONVERT(date, getdate())";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    int COMPLAINT = rs.getInt("COMPLAINT_LOGGED");
                    System.out.println("Complaints Logged:" + COMPLAINT );
                    Unison_ComplaintLogged = COMPLAINT ;
                  }
                  flagComplaintLogged = 1;
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Got an exception! ");
                  System.err.println(e.getMessage());
                }    
            }
            
            else {
                    Unison_ComplaintLogged = 0;
                    flagComplaintLogged = 0;
            }
            
            if(chkQuertzPerDay.isSelected()){
               try {
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
                  String query = "USE "+database_name+";SELECT COUNT(*) As TOTAL_QRTZ_TRIGGERS from QRTZ_TRIGGERS";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    int QRTZ = rs.getInt("TOTAL_QRTZ_TRIGGERS");
                    System.out.println("Quertz Trigger" + QRTZ );
                    Unison_QuertzPerDay = QRTZ ;
                  }
                  flagQuertzPerDay = 1;
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Got an exception! ");
                  System.err.println(e.getMessage());
                }    
            }
            
            else {
                    Unison_QuertzPerDay = 0;
                    flagQuertzPerDay = 0;
            }
            
            if(chkAverageSessionTimePerDay.isSelected()){
               try {
                  String myUrl = "jdbc:sqlserver://"+ip_address;
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  Connection conn = DriverManager.getConnection(myUrl, user, password);
                  String query = "USE "+database_name+";select CONVERT(TIME(0), DATEADD(MINUTE, 24*60*60*[time], 0)) AVG_SESSION_TIME from ( select case coalesce(AVG(cast(END_TIME - START_TIME as float)),'0') when '0' then '0' Else AVG(cast(END_TIME - START_TIME as float)) end as [time] from SESSIoN_HISTORY where  created_on >= CONVERT(date, DATEADD(MONTH, -3, getdate())) ) A";
                  Statement st = conn.createStatement();
                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) {
                    String AVG_SESSION_TIME = rs.getString("AVG_SESSION_TIME");
                    System.out.println("AVG_SESSION_TIME:" + AVG_SESSION_TIME );
                    Unison_AverageSessionTimePerDay = AVG_SESSION_TIME ;
                  }
                  flagAverageSessionTimePerDay = 1;
                  st.close();
                }
                catch (Exception e) {
                  System.err.println("Got an exception! ");
                  System.err.println(e.getMessage());
                }    
            }
            
            else {
                    Unison_AverageSessionTimePerDay = "00:00:00";
                    flagAverageSessionTimePerDay = 0;
            }
            
            
            }
        }
        
        //
        
        //
        
        pgsFetching.setValue(100);
        lblFetching.setText("100%");
        
        //End
        pgsFetching.setVisible(false);
        lblFetching.setVisible(false);
        
        this.setVisible(false);
        new ResultsetFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BeginForm().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        // TODO add your handling code here:
        componentClear = (Component[]) 
                    pnlQueries.getComponents();

            for (Component comp : componentClear) {

                if (comp instanceof JCheckBox) {
                    JCheckBox box = (JCheckBox) comp;
                    box.setSelected(false);
                }
            } 
        
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void btnSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAllActionPerformed
        // TODO add your handling code here:
        componentSelect = (Component[]) 
                    pnlQueries.getComponents();

            for (Component comp : componentSelect) {

                if (comp instanceof JCheckBox) {
                    JCheckBox box = (JCheckBox) comp;
                    box.setSelected(true);
                }
            }
    }//GEN-LAST:event_btnSelectAllActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataFrame().setVisible(true);
            }
        });
    }
    
    // Function to convert hexadecimal to decimal 
    public static int hexadecimalToDecimal(String hexVal) 
    {    
        int len = hexVal.length(); 
       
        // Initializing base value to 1, i.e 16^0 
        int base = 1; 
       
        int dec_val = 0; 
       
        // Extracting characters as digits from last character 
        for (int i=len-1; i>=0; i--) 
        {    
            // if character lies in '0'-'9', converting  
            // it to integral 0-9 by subtracting 48 from 
            // ASCII value 
            if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9') 
            { 
                dec_val += (hexVal.charAt(i) - 48)*base; 
                   
                // incrementing base by power 
                base = base * 16; 
            } 
   
            // if character lies in 'A'-'F' , converting  
            // it to integral 10 - 15 by subtracting 55  
            // from ASCII value 
            else if (hexVal.charAt(i) >= 'A' && hexVal.charAt(i) <= 'F') 
            { 
                dec_val += (hexVal.charAt(i) - 55)*base; 
           
                // incrementing base by power 
                base = base*16; 
            } 
        } 
        return dec_val; 
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnSelectAll;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel lblFetching;
    private javax.swing.JProgressBar pgsFetching;
    private javax.swing.JPanel pnlQueries;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
