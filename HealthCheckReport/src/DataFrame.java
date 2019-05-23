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
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
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

public class DataFrame extends javax.swing.JFrame {

    
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
    
    
    /**
     * Creates new form DataFrame
     */
    public DataFrame() {
        initComponents();
        System.out.println("Initiated DataFrame Form..");
        
        //Hiding Progress Bar and Label
        pgsFetching.setVisible(false);
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
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
            .addGap(0, 145, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Fetch Data >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Select All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(pgsFetching, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFetching)
                        .addGap(92, 92, 92)))
                .addGap(459, 459, 459))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQueries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgsFetching, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFetching)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Loader Progess Bar and Progress Label
        pgsFetching.setVisible(true);
        lblFetching.setVisible(true);
        
        BeginForm form = new BeginForm();
        ip_address = form.ip_address;
        user = form.user;
        password = form.password;
        database_name = form.database_name;
        database_type = form.database_type;
        remember_me = form.remember_me;
        
        pgsFetching.setValue(10);
        lblFetching.setText("10%");
        
        //
        if(database_type == "Microsoft SQL Server") {
            
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel lblFetching;
    private javax.swing.JProgressBar pgsFetching;
    private javax.swing.JPanel pnlQueries;
    // End of variables declaration//GEN-END:variables
}
