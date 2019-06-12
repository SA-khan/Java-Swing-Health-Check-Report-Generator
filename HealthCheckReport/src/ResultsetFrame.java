

import java.awt.Dimension;
import java.awt.Label;
import java.io.File;
import javafx.scene.control.CheckBox;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.POIDocument;

  import java.io.FileOutputStream;   



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saad.ahmed
 */
public class ResultsetFrame extends javax.swing.JFrame {

    public static String ip_address;
    public static String user;
    public static String password;
    public static String database_name;
    public static String database_type;
    public static String product;
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
    //public static String[] query_selected2 = new String[50];
    
    
    //System Internal Variables
    public static String operating_system;
    public static int processor_cores;
    public static long free_memory;
    public static long max_memory;
    public static long total_memory_available_to_JVM;
    public static String[] drive;
    public static long[] drive_total_space;
    public static long[] drive_free_space;
    public static long[] drive_usable_space;
    
    public static label chkDatabaseVersion;
    public static String DatabaseVersion;
    public static label chkDatabaseID;
    public static String DatabaseID;
    public static label chkDBOwner;
    public static String DBOwner;
    public static label chkCurrentDate;
    public static String CurrentDate;
    public static label chkDbCreated;
    public static String DbCreated;
    public static label chkDbCompatibility;
    public static String DbCompatibility;
    public static label chkDbOwner;
    public static String DbOwner;
    public static label chkDbMDF;
    public static int DbMDF;
    public static label chkDbLDF;
    public static int DbLDF;
    public static label chkDBLocation;
    public static String DBLocation;
    
    
    //Unison Data Variables
    
    public static Label lblUnison;
    public static int flagTotalUser;
    public static Label lblUnison_TotalUsers;
    public static Label lblUnison_TotalUsersValue;
    public static int Unison_TotalUsers;
    public static int flagInactiveUsers;
    public static Label lblUnison_InactiveUsers;
    public static Label lblUnison_InactiveUsersValue;
    public static int Unison_InactiveUsers;
    public static int flagTotalUsersLoginPerDay;
    public static Label lblUnison_TotalUsersLoginPerDay;
    public static Label lblUnison_TotalUsersLoginPerDayValue;
    public static int Unison_TotalLoggedUsersPD;
    public static int flagSessionEntryPerDay;
    public static Label lblUnison_SessionEntryPerDay;
    public static Label lblUnison_SessionEntryPerDayValue;
    public static int Unison_SessionEntryPerDay;
    public static int flagBranchesQuerterwise;
    public static Label lblUnison_BranchesQuerterwise;
    public static Label lblUnison_BranchesQuerterwiseValue;
    public static int Unison_BranchesQuerterwise;
    public static int flagEformLogged;
    public static Label lblUnison_EformLogged;
    public static Label lblUnison_EformLoggedValue;
    public static int Unison_EformLogged;
    public static int flagComplaintLogged;
    public static Label lblUnison_ComplaintLogged;
    public static Label lblUnison_ComplaintLoggedValue;
    public static int Unison_ComplaintLogged;
    public static int flagQuertzPerDay;
    public static Label lblUnison_QuertzPerDay;
    public static Label lblUnison_QuertzPerDayValue;
    public static int Unison_QuertzPerDay;
    public static int flagAverageSessionTimePerDay;
    public static Label lblUnison_AverageSessionTimePerDay;
    public static Label lblUnison_AverageSessionTimePerDayValue;
    public static String Unison_AverageSessionTimePerDay;

    
    /**
     * Creates new form ResultsetFrame
     */
    public ResultsetFrame() {
        initComponents();
        
        DataFrame form = new DataFrame();
        ip_address = form.ip_address;
        user = form.user;
        password = form.password;
        database_name = form.database_name;
        database_type = form.database_type;
        remember_me = form.remember_me;
        //product3 = form.product2;
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
        //
        
        
        System.out.println("=================================================");
        System.out.println("Initiated ResultsetFrame... ");
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
        System.out.println("=================================================");
        //query_selected2 = form.query_selected;
        
        //System Internal Variables Setting
        System.out.println("=================================================");
        System.out.println("= System Information");
        operating_system = form.operating_system;
        System.out.println("= O.S. = "+operating_system);
        //processor_cores = form.processor_cores;
        //System.out.println("= Processor Cores = "+processor_cores);
        //free_memory = form.free_memory;
        //System.out.println("= Free Memory = "+free_memory);
        //max_memory = form.max_memory;
        //System.out.println("= Max Memory = "+max_memory);
        //total_memory_available_to_JVM = form.total_memory_available_to_JVM;
        //System.out.println("= Total Memory = "+total_memory_available_to_JVM);
        //drive = form.drive;
        //System.out.println("= Drive 1 = "+drive[0]);
        //drive_total_space = form.drive_total_space;
        //System.out.println("= Drive 1 Total Space= "+drive_total_space[0]);
        //drive_free_space = form.drive_free_space;
        //System.out.println("= Drive 1 Drive Free Space= "+drive_free_space[0]);
        //drive_usable_space = form.drive_usable_space;
        //System.out.println("= Drive 1 Drive Usable Space= "+drive_usable_space[0]);
        //System.out.println("=================================================");
        //try {
        //if(drive[1] != ""){
        //System.out.println("= Drive 2 = "+drive[1]);
        //drive_total_space = form.drive_total_space;
        //System.out.println("= Drive 2 Total Space= "+drive_total_space[1]);
        //drive_free_space = form.drive_free_space;
        //System.out.println("= Drive 2 Drive Free Space= "+drive_free_space[1]);
        //drive_usable_space = form.drive_usable_space;
        //System.out.println("= Drive 2 Drive Usable Space= "+drive_usable_space[1]);
        //System.out.println("=================================================");
        //}
        //if(drive[2] != ""){
        //System.out.println("= Drive 3 = "+drive[2]);
        //drive_total_space = form.drive_total_space;
        //System.out.println("= Drive 3 Total Space= "+drive_total_space[2]);
        //drive_free_space = form.drive_free_space;
        //System.out.println("= Drive 3 Drive Free Space= "+drive_free_space[2]);
        //drive_usable_space = form.drive_usable_space;
        //System.out.println("= Drive 3 Drive Usable Space= "+drive_usable_space[2]);
        //System.out.println("=================================================");
        //}
        //if(drive[3] != ""){
        //System.out.println("= Drive 1 = "+drive[3]);
        //drive_total_space = form.drive_total_space;
        //System.out.println("= Drive 1 Total Space= "+drive_total_space[3]);
        //drive_free_space = form.drive_free_space;
        //System.out.println("= Drive 1 Drive Free Space= "+drive_free_space[3]);
        //drive_usable_space = form.drive_usable_space;
        //System.out.println("= Drive 1 Drive Usable Space= "+drive_usable_space[3]);
        //System.out.println("=================================================");
        //}
        //}
        //catch(Exception e){
        //}
        tblSystem = new javax.swing.JTable();

        tblSystem.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {
           {"Operating System", operating_system},
           {"Processor Cores", ""},
           {"Free Memory", ""},
           {"Max Memory", ""} },new String [] {"", ""}) {Class[] types = new Class [] {java.lang.String.class, java.lang.String.class};
           boolean[] canEdit = new boolean [] {false, false};
           public Class getColumnClass(int columnIndex) {
               return types [columnIndex];
           }
           public boolean isCellEditable(int rowIndex, int columnIndex) {
               return canEdit [columnIndex];
           }
        });



spnlSystem.setViewportView(tblSystem);

        
        DatabaseVersion = form.DatabaseVersion;
        System.out.println(DatabaseVersion);
        String DbV1 = DatabaseVersion.substring(0, (DatabaseVersion.length()/2));
        String DbV2 = DatabaseVersion.substring((DatabaseVersion.length()/2), DatabaseVersion.length());
        //String DbV2 = DatabaseVersion.substring(dbvSize/2);
        DatabaseID = form.DatabaseID;
        DbCreated = form.DbCreated;
        DbCompatibility = form.DbCompatibility;
        DbMDF = form.DbMDF;
        DbLDF = form.DbLDF;
        DBOwner = form.DBOwner;
        DBLocation = form.DBLocation;
        CurrentDate = form.CurrentDate;
        
        //TBL
        
        tblDatabase = new javax.swing.JTable();

tblDatabase.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {"Database Version", DbV1},
        {"", DbV2},
        {"Database ID", DatabaseID},
        {"Database Name", database_name},
        {"Database Vendor", database_type},
        {"Database Created Date", DbCreated},
        {"Database Owner", DBOwner},
        {"Database Location", DBLocation},
        {"Database MDF File Size", DbMDF},
        {"Database LDF File Size", DbLDF},
        {"Database Compatibility", DbCompatibility+"%"}
    },
    new String [] {
        "", ""
    }
) {
    Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class
    };
    boolean[] canEdit = new boolean [] {
        false, false
    };

    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
});



spnlDatabase.setViewportView(tblDatabase);
   
        
        //TBL
        
        if(Ambit == 1) {
           
            lblCurrentDate.setText(CurrentDate);
            
            JScrollPane pnlAmbit = new JScrollPane();
            
            pnlAmbit.setPreferredSize(new Dimension(200, 150));

            tbdProducts.add(new JScrollPane(pnlAmbit), "Ambit");
            
            DefaultTableModel model = new DefaultTableModel(new String[][] {
            { "1", "2" }, { "3", "4" } }, new String[] { "", "" });
            JTable tblUnison = new JTable(model);
            pnlAmbit.getViewport().add(tblUnison);
            
            /**
            try {
            String v1 = DatabaseVersion.substring(0,75);
            String v2 = DatabaseVersion.substring(76);
            lblDBVersion.setText(v1);
            lblDBVersion2.setText(v2);
            }
            catch(Exception e){}
            lblCurrentDate.setText(CurrentDate);
            lblDBID.setText(DatabaseID);
            lblDBNAME.setText(database_name);
            lblDBCreated.setText(DbCreated);
            lblDBCompatible.setText(DbCompatibility);
            lblMDF.setText(String.valueOf(DbMDF));
            lblLDF.setText(String.valueOf(DbLDF));
            lblDBOwner.setText(DBOwner);
            lblCurrentDate.setText(CurrentDate);
            lblDBLocation.setText(DBLocation);
            
            **/
            
        }
        
        if(Others == 1) {
            
            lblCurrentDate.setText(CurrentDate);
            
            /**
            
            String v1 = DatabaseVersion.substring(0,75);
            String v2 = DatabaseVersion.substring(76);
            
            lblDBVersion.setText(v1);
            lblDBVersion2.setText(v2);
            lblDBID.setText(DatabaseID);
            lblDBNAME.setText(database_name);
            lblDBCreated.setText(DbCreated);
            lblDBCompatible.setText(DbCompatibility);
            lblMDF.setText(String.valueOf(DbMDF));
            lblLDF.setText(String.valueOf(DbLDF));
            lblDBOwner.setText(DBOwner);
            lblCurrentDate.setText(CurrentDate);
            lblDBLocation.setText(DBLocation);
            
            
            
            String[][] dataDatabase = new String[5][5];
            dataDatabase[0][0] = "VERSION";
            dataDatabase[0][1] = v1;
            dataDatabase[1][0] = "";
            dataDatabase[1][1] = v2;
            dataDatabase[1][0] = "ID";
            dataDatabase[1][1] = DatabaseID;
            dataDatabase[1][0] = "Name";
            dataDatabase[1][1] = database_name;
            dataDatabase[1][0] = "Database Created Date";
            dataDatabase[1][1] = DbCreated;
            
            **/
            
        }
        
        if(Unison == 1) {
            
            lblCurrentDate.setText(CurrentDate);
            
            JScrollPane pnlUnison = new JScrollPane();
            
            pnlUnison.setPreferredSize(new Dimension(600, 1200));

            tbdProducts.add(new JScrollPane(pnlUnison), "Unison");
            
            
            
        lblUnison = new Label("Unison Data");
        lblUnison.setBounds(10, 10, 150, 20);
        lblUnison.setFont(new java.awt.Font("Tahoma", 1, 18));
        pnlUnison.add(lblUnison);    
        
        System.out.println("Initiated Flags... ");
        flagTotalUser = form.flagTotalUser;
        System.out.println("Total Users = " + flagTotalUser);
        flagInactiveUsers = form.flagInactiveUsers;
        System.out.println("Inactive Users = " + flagInactiveUsers);
        flagTotalUsersLoginPerDay = form.flagTotalUsersLoginPerDay;
        System.out.println("Total Users Login Per Day = " + flagTotalUsersLoginPerDay);
        flagSessionEntryPerDay = form.flagSessionEntryPerDay;
        System.out.println("Session Entry Per Day = " + flagSessionEntryPerDay);
        flagBranchesQuerterwise = form.flagBranchesQuerterwise;
        System.out.println("Branches Querterwise = " + flagBranchesQuerterwise);
        flagEformLogged = form.flagEformLogged;
        System.out.println("Eform Logged = " + flagEformLogged);
        flagComplaintLogged = form.flagComplaintLogged;
        System.out.println("Complaint Logged = " + flagComplaintLogged);
        flagQuertzPerDay = form.flagQuertzPerDay;
        System.out.println("Quartz Per Day = " + flagQuertzPerDay);
        flagAverageSessionTimePerDay = form.flagAverageSessionTimePerDay;
        System.out.println("Average Session Time Per Day = " + flagAverageSessionTimePerDay);
        
        Unison_TotalUsers = form.Unison_TotalUsers;
        Unison_InactiveUsers = form.Unison_InactiveUsers;
        Unison_TotalLoggedUsersPD = form.Unison_TotalUsersLoginPerDay;
        Unison_SessionEntryPerDay = form.Unison_SessionEntryPerDay;
        Unison_BranchesQuerterwise = form.Unison_BranchesQuerterwise;
        Unison_EformLogged = form.Unison_EformLogged;
        Unison_ComplaintLogged = form.Unison_ComplaintLogged;
        Unison_QuertzPerDay = form.Unison_QuertzPerDay;
        Unison_AverageSessionTimePerDay = form.Unison_AverageSessionTimePerDay;
        
        if(flagTotalUser == 1 && flagInactiveUsers == 1 && flagTotalUsersLoginPerDay == 1 && flagSessionEntryPerDay == 1 && flagBranchesQuerterwise == 1 && flagEformLogged == 1 && flagComplaintLogged == 1 && flagQuertzPerDay == 1 && flagAverageSessionTimePerDay == 1) {
            
            DefaultTableModel model = new DefaultTableModel(new String[][] {
            { "Total Users",  String.valueOf(Unison_TotalUsers)},
            { "Inactive Users",  String.valueOf(Unison_InactiveUsers)},
            { "Total Users Logged In Per Day",  String.valueOf(Unison_TotalLoggedUsersPD)},
            { "Session Entry Per Day",  String.valueOf(Unison_SessionEntryPerDay)},
            { "Branches Querterwise",  String.valueOf(Unison_BranchesQuerterwise)},
            { "Eform Logged",  String.valueOf(Unison_EformLogged)},
            { "Complaint Logged",  String.valueOf(Unison_ComplaintLogged)},
            { "Quartz Count",  String.valueOf(Unison_QuertzPerDay)},
            { "Average Session Time Per Day", String.valueOf(Unison_AverageSessionTimePerDay) } }, new String[] { "Unison Information", "" });
            JTable tblUnison = new JTable(model);
            pnlUnison.getViewport().add(tblUnison);
        
        lblUnison_TotalUsers = new Label("Total Users");
        lblUnison_TotalUsers.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalUsers));
        lblUnison_TotalUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
        
        lblUnison_InactiveUsers = new Label("Inactive Users");
        lblUnison_InactiveUsers.setBounds(10, 80, 230, 20);
        lblUnison_InactiveUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsers);
        
        lblUnison_InactiveUsersValue = new Label(String.valueOf(Unison_InactiveUsers));
        lblUnison_InactiveUsersValue.setBounds(250, 80, 150, 20);
        lblUnison_InactiveUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsersValue);
        
        lblUnison_TotalUsersLoginPerDay = new Label("Total Users Logged In Per Day");
        lblUnison_TotalUsersLoginPerDay.setBounds(10, 110, 230, 20);
        lblUnison_TotalUsersLoginPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDay);
        
        lblUnison_TotalUsersLoginPerDayValue = new Label(String.valueOf(Unison_TotalLoggedUsersPD));
        lblUnison_TotalUsersLoginPerDayValue.setBounds(250, 110, 200, 20);
        lblUnison_TotalUsersLoginPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDayValue);
        
        lblUnison_SessionEntryPerDay = new Label("Session Entry Per Day");
        lblUnison_SessionEntryPerDay.setBounds(10, 140, 230, 20);
        lblUnison_SessionEntryPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDay);
        
        lblUnison_SessionEntryPerDayValue = new Label(String.valueOf(Unison_SessionEntryPerDay));
        lblUnison_SessionEntryPerDayValue.setBounds(250, 140, 200, 20);
        lblUnison_SessionEntryPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDayValue);
        
        lblUnison_BranchesQuerterwise = new Label("Branches Querterwise");
        lblUnison_BranchesQuerterwise.setBounds(10, 170, 230, 20);
        lblUnison_BranchesQuerterwise.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_BranchesQuerterwise);
        
        lblUnison_BranchesQuerterwiseValue = new Label(String.valueOf(Unison_BranchesQuerterwise));
        lblUnison_BranchesQuerterwiseValue.setBounds(250, 170, 200, 20);
        lblUnison_BranchesQuerterwiseValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_BranchesQuerterwiseValue);
        
        lblUnison_EformLogged = new Label("Eform Logged");
        lblUnison_EformLogged.setBounds(10, 200, 230, 20);
        lblUnison_EformLogged.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_EformLogged);
        
        lblUnison_EformLoggedValue = new Label(String.valueOf(Unison_EformLogged));
        lblUnison_EformLoggedValue.setBounds(250, 200, 200, 20);
        lblUnison_EformLoggedValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_EformLoggedValue);
        
        lblUnison_ComplaintLogged = new Label("Complaint Logged");
        lblUnison_ComplaintLogged.setBounds(10, 230, 230, 20);
        lblUnison_ComplaintLogged.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_ComplaintLogged);
        
        lblUnison_ComplaintLoggedValue = new Label(String.valueOf(Unison_ComplaintLogged));
        lblUnison_ComplaintLoggedValue.setBounds(250, 230, 200, 20);
        lblUnison_ComplaintLoggedValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_ComplaintLoggedValue);
        
        lblUnison_QuertzPerDay = new Label("Quartz Count");
        lblUnison_QuertzPerDay.setBounds(10, 260, 230, 20);
        lblUnison_QuertzPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_QuertzPerDay);
        
        lblUnison_QuertzPerDayValue = new Label(String.valueOf(Unison_QuertzPerDay));
        lblUnison_QuertzPerDayValue.setBounds(250, 260, 200, 20);
        lblUnison_QuertzPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_QuertzPerDayValue);
        
        lblUnison_AverageSessionTimePerDay = new Label("Average Session Time Per Day");
        lblUnison_AverageSessionTimePerDay.setBounds(10, 290, 230, 20);
        lblUnison_AverageSessionTimePerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_AverageSessionTimePerDay);
        
        lblUnison_AverageSessionTimePerDayValue = new Label(String.valueOf(Unison_AverageSessionTimePerDay));
        lblUnison_AverageSessionTimePerDayValue.setBounds(250, 290, 200, 20);
        lblUnison_AverageSessionTimePerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_AverageSessionTimePerDayValue);
          
       }
        
        else if(flagTotalUser == 1 && flagInactiveUsers == 0 && flagTotalUsersLoginPerDay == 0 && flagSessionEntryPerDay == 0  && flagBranchesQuerterwise == 0 && flagEformLogged == 0 && flagComplaintLogged == 0 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_TotalUsers = new Label("Total Users");
        lblUnison_TotalUsers.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalUsers));
        lblUnison_TotalUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
           
       }
       
       else if(flagTotalUser == 1 && flagInactiveUsers == 1 && flagTotalUsersLoginPerDay == 0 && flagSessionEntryPerDay == 0 && flagBranchesQuerterwise == 0 && flagEformLogged == 0 && flagComplaintLogged == 0 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
           
        lblUnison_TotalUsers = new Label("Total Users");
        lblUnison_TotalUsers.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalUsers));
        lblUnison_TotalUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
        
        lblUnison_InactiveUsers = new Label("Inactive Users");
        lblUnison_InactiveUsers.setBounds(10, 80, 230, 20);
        lblUnison_InactiveUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsers);
        
        lblUnison_InactiveUsersValue = new Label(String.valueOf(Unison_InactiveUsers));
        lblUnison_InactiveUsersValue.setBounds(250, 80, 150, 20);
        lblUnison_InactiveUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsersValue);
           
       }
       
       else if(flagTotalUser == 0 && flagInactiveUsers == 1 && flagTotalUsersLoginPerDay == 0  && flagSessionEntryPerDay == 0 && flagBranchesQuerterwise == 0 && flagEformLogged == 0 && flagComplaintLogged == 0 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_InactiveUsers = new Label("Inactive Users");
        lblUnison_InactiveUsers.setBounds(10, 50, 230, 20);
        lblUnison_InactiveUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsers);
        
        lblUnison_InactiveUsersValue = new Label(String.valueOf(Unison_InactiveUsers));
        lblUnison_InactiveUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_InactiveUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsersValue);
           
       }
       
       else if(flagTotalUser == 1 && flagInactiveUsers == 1 && flagTotalUsersLoginPerDay == 1 && flagSessionEntryPerDay == 0 && flagBranchesQuerterwise == 0 && flagEformLogged == 0 && flagComplaintLogged == 0 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_TotalUsers = new Label("Total Users");
        lblUnison_TotalUsers.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalUsers));
        lblUnison_TotalUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
        
        lblUnison_InactiveUsers = new Label("Inactive Users");
        lblUnison_InactiveUsers.setBounds(10, 80, 230, 20);
        lblUnison_InactiveUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsers);
        
        lblUnison_InactiveUsersValue = new Label(String.valueOf(Unison_InactiveUsers));
        lblUnison_InactiveUsersValue.setBounds(250, 80, 150, 20);
        lblUnison_InactiveUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsersValue);
        
        lblUnison_TotalUsersLoginPerDay = new Label("Total User Loggedin Per Day");
        lblUnison_TotalUsersLoginPerDay.setBounds(10, 110, 230, 20);
        lblUnison_TotalUsersLoginPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDay);
        
        lblUnison_TotalUsersLoginPerDayValue = new Label(String.valueOf(Unison_TotalLoggedUsersPD));
        lblUnison_TotalUsersLoginPerDayValue.setBounds(250, 110, 150, 20);
        lblUnison_TotalUsersLoginPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDayValue);
           
       }
       
       else if(flagTotalUser == 1 && flagInactiveUsers == 0 && flagTotalUsersLoginPerDay == 1 && flagSessionEntryPerDay == 0 && flagBranchesQuerterwise == 0 && flagEformLogged == 0 && flagComplaintLogged == 0 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_TotalUsers = new Label("Total Users");
        lblUnison_TotalUsers.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalUsers));
        lblUnison_TotalUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
        
        
        lblUnison_TotalUsersLoginPerDay = new Label("Total Users Logged In Per Day");
        lblUnison_TotalUsersLoginPerDay.setBounds(10, 80, 230, 20);
        lblUnison_TotalUsersLoginPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalLoggedUsersPD));
        lblUnison_TotalUsersValue.setBounds(250, 80, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
           
       }
       
       else if(flagTotalUser == 0 && flagInactiveUsers == 0 && flagTotalUsersLoginPerDay == 1  && flagSessionEntryPerDay == 0 && flagBranchesQuerterwise == 0 && flagEformLogged == 0 && flagComplaintLogged == 0 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_TotalUsersLoginPerDay = new Label("Total Users LogIn Per Day");
        lblUnison_TotalUsersLoginPerDay.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsersLoginPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDay);
        
        lblUnison_TotalUsersLoginPerDayValue = new Label(String.valueOf(Unison_TotalLoggedUsersPD));
        lblUnison_TotalUsersLoginPerDayValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersLoginPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDayValue);
           
       }
       
       else if(flagTotalUser == 1 && flagInactiveUsers == 1 && flagTotalUsersLoginPerDay == 1 && flagSessionEntryPerDay == 1 && flagBranchesQuerterwise == 0 && flagEformLogged == 0 && flagComplaintLogged == 0 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_TotalUsers = new Label("Total Users");
        lblUnison_TotalUsers.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalUsers));
        lblUnison_TotalUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
        
        lblUnison_InactiveUsers = new Label("Inactive Users");
        lblUnison_InactiveUsers.setBounds(10, 80, 230, 20);
        lblUnison_InactiveUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsers);
        
        lblUnison_InactiveUsersValue = new Label(String.valueOf(Unison_InactiveUsers));
        lblUnison_InactiveUsersValue.setBounds(250, 80, 150, 20);
        lblUnison_InactiveUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsersValue);
        
        lblUnison_TotalUsersLoginPerDay = new Label("Total Users Login Per Day");
        lblUnison_TotalUsersLoginPerDay.setBounds(10, 110, 230, 20);
        lblUnison_TotalUsersLoginPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDay);
        
        lblUnison_TotalUsersLoginPerDayValue = new Label(String.valueOf(Unison_TotalLoggedUsersPD));
        lblUnison_TotalUsersLoginPerDayValue.setBounds(250, 110, 200, 20);
        lblUnison_TotalUsersLoginPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDayValue);
        
        lblUnison_SessionEntryPerDay = new Label("Session Entry Per Day");
        lblUnison_SessionEntryPerDay.setBounds(10, 140, 230, 20);
        lblUnison_SessionEntryPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDay);
        
        lblUnison_SessionEntryPerDayValue = new Label(String.valueOf(Unison_SessionEntryPerDay));
        lblUnison_SessionEntryPerDayValue.setBounds(250, 140, 200, 20);
        lblUnison_SessionEntryPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDayValue);
           
       }
       
       else if(flagTotalUser == 0 && flagInactiveUsers == 0 && flagTotalUsersLoginPerDay == 0  && flagSessionEntryPerDay == 1 && flagBranchesQuerterwise == 0 && flagEformLogged == 0 && flagComplaintLogged == 0 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_SessionEntryPerDay = new Label("Session Entry Per Day");
        lblUnison_SessionEntryPerDay.setBounds(10, 50, 230, 20);
        lblUnison_SessionEntryPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDay);
        
        lblUnison_SessionEntryPerDayValue = new Label(String.valueOf(Unison_SessionEntryPerDay));
        lblUnison_SessionEntryPerDayValue.setBounds(250, 50, 200, 20);
        lblUnison_SessionEntryPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDayValue);
           
       }
       
       else if(flagTotalUser == 1 && flagInactiveUsers == 1 && flagTotalUsersLoginPerDay == 1 && flagSessionEntryPerDay == 1  && flagBranchesQuerterwise == 1 && flagEformLogged == 0 && flagComplaintLogged == 0 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_TotalUsers = new Label("Total Users");
        lblUnison_TotalUsers.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalUsers));
        lblUnison_TotalUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
        
        lblUnison_InactiveUsers = new Label("Inactive Users");
        lblUnison_InactiveUsers.setBounds(10, 80, 230, 20);
        lblUnison_InactiveUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsers);
        
        lblUnison_InactiveUsersValue = new Label(String.valueOf(Unison_InactiveUsers));
        lblUnison_InactiveUsersValue.setBounds(250, 80, 150, 20);
        lblUnison_InactiveUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsersValue);
        
        lblUnison_TotalUsersLoginPerDay = new Label("Total Users Login Per Day");
        lblUnison_TotalUsersLoginPerDay.setBounds(10, 110, 230, 20);
        lblUnison_TotalUsersLoginPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDay);
        
        lblUnison_TotalUsersLoginPerDayValue = new Label(String.valueOf(Unison_TotalLoggedUsersPD));
        lblUnison_TotalUsersLoginPerDayValue.setBounds(250, 110, 200, 20);
        lblUnison_TotalUsersLoginPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDayValue);
        
        lblUnison_SessionEntryPerDay = new Label("Session Entry Per Day");
        lblUnison_SessionEntryPerDay.setBounds(10, 140, 230, 20);
        lblUnison_SessionEntryPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDay);
        
        lblUnison_SessionEntryPerDayValue = new Label(String.valueOf(Unison_SessionEntryPerDay));
        lblUnison_SessionEntryPerDayValue.setBounds(250, 140, 200, 20);
        lblUnison_SessionEntryPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDayValue);
        
        lblUnison_BranchesQuerterwise = new Label("Branches Querterwise");
        lblUnison_BranchesQuerterwise.setBounds(10, 140, 230, 20);
        lblUnison_BranchesQuerterwise.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_BranchesQuerterwise);
        
        lblUnison_BranchesQuerterwiseValue = new Label(String.valueOf(Unison_BranchesQuerterwise));
        lblUnison_BranchesQuerterwiseValue.setBounds(250, 140, 200, 20);
        lblUnison_BranchesQuerterwiseValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_BranchesQuerterwiseValue);
           
       }
       
       else if(flagTotalUser == 1 && flagInactiveUsers == 1 && flagTotalUsersLoginPerDay == 1 && flagSessionEntryPerDay == 1  && flagBranchesQuerterwise == 1 && flagEformLogged == 1 && flagComplaintLogged == 0 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_TotalUsers = new Label("Total Users");
        lblUnison_TotalUsers.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalUsers));
        lblUnison_TotalUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
        
        lblUnison_InactiveUsers = new Label("Inactive Users");
        lblUnison_InactiveUsers.setBounds(10, 80, 230, 20);
        lblUnison_InactiveUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsers);
        
        lblUnison_InactiveUsersValue = new Label(String.valueOf(Unison_InactiveUsers));
        lblUnison_InactiveUsersValue.setBounds(250, 80, 150, 20);
        lblUnison_InactiveUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsersValue);
        
        lblUnison_TotalUsersLoginPerDay = new Label("Total Users Logged In Per Day");
        lblUnison_TotalUsersLoginPerDay.setBounds(10, 110, 230, 20);
        lblUnison_TotalUsersLoginPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDay);
        
        lblUnison_TotalUsersLoginPerDayValue = new Label(String.valueOf(Unison_TotalLoggedUsersPD));
        lblUnison_TotalUsersLoginPerDayValue.setBounds(250, 110, 200, 20);
        lblUnison_TotalUsersLoginPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDayValue);
        
        lblUnison_SessionEntryPerDay = new Label("Session Entry Per Day");
        lblUnison_SessionEntryPerDay.setBounds(10, 140, 230, 20);
        lblUnison_SessionEntryPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDay);
        
        lblUnison_SessionEntryPerDayValue = new Label(String.valueOf(Unison_SessionEntryPerDay));
        lblUnison_SessionEntryPerDayValue.setBounds(250, 140, 200, 20);
        lblUnison_SessionEntryPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDayValue);
        
        lblUnison_BranchesQuerterwise = new Label("Branches Querterwise");
        lblUnison_BranchesQuerterwise.setBounds(10, 140, 230, 20);
        lblUnison_BranchesQuerterwise.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_BranchesQuerterwise);
        
        lblUnison_BranchesQuerterwiseValue = new Label(String.valueOf(Unison_BranchesQuerterwise));
        lblUnison_BranchesQuerterwiseValue.setBounds(250, 140, 200, 20);
        lblUnison_BranchesQuerterwiseValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_BranchesQuerterwiseValue);
        
        lblUnison_EformLogged = new Label("Branches Querterwise");
        lblUnison_EformLogged.setBounds(10, 140, 230, 20);
        lblUnison_EformLogged.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_EformLogged);
        
        lblUnison_EformLoggedValue = new Label(String.valueOf(Unison_EformLogged));
        lblUnison_EformLoggedValue.setBounds(250, 140, 200, 20);
        lblUnison_EformLoggedValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_EformLoggedValue);
           
       }
       
       else if(flagTotalUser == 1 && flagInactiveUsers == 1 && flagTotalUsersLoginPerDay == 1 && flagSessionEntryPerDay == 1 && flagBranchesQuerterwise == 1 && flagEformLogged == 1 && flagComplaintLogged == 1 && flagQuertzPerDay == 0 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_TotalUsers = new Label("Total Users");
        lblUnison_TotalUsers.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalUsers));
        lblUnison_TotalUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
        
        lblUnison_InactiveUsers = new Label("Inactive Users");
        lblUnison_InactiveUsers.setBounds(10, 80, 230, 20);
        lblUnison_InactiveUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsers);
        
        lblUnison_InactiveUsersValue = new Label(String.valueOf(Unison_InactiveUsers));
        lblUnison_InactiveUsersValue.setBounds(250, 80, 150, 20);
        lblUnison_InactiveUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsersValue);
        
        lblUnison_TotalUsersLoginPerDay = new Label("Total Users Logged In Per Day");
        lblUnison_TotalUsersLoginPerDay.setBounds(10, 110, 230, 20);
        lblUnison_TotalUsersLoginPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDay);
        
        lblUnison_TotalUsersLoginPerDayValue = new Label(String.valueOf(Unison_TotalLoggedUsersPD));
        lblUnison_TotalUsersLoginPerDayValue.setBounds(250, 110, 200, 20);
        lblUnison_TotalUsersLoginPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDayValue);
        
        lblUnison_SessionEntryPerDay = new Label("Session Entry Per Day");
        lblUnison_SessionEntryPerDay.setBounds(10, 140, 230, 20);
        lblUnison_SessionEntryPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDay);
        
        lblUnison_SessionEntryPerDayValue = new Label(String.valueOf(Unison_SessionEntryPerDay));
        lblUnison_SessionEntryPerDayValue.setBounds(250, 140, 200, 20);
        lblUnison_SessionEntryPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDayValue);
        
        lblUnison_BranchesQuerterwise = new Label("Branches Querterwise");
        lblUnison_BranchesQuerterwise.setBounds(10, 170, 230, 20);
        lblUnison_BranchesQuerterwise.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_BranchesQuerterwise);
        
        lblUnison_BranchesQuerterwiseValue = new Label(String.valueOf(Unison_BranchesQuerterwise));
        lblUnison_BranchesQuerterwiseValue.setBounds(250, 170, 200, 20);
        lblUnison_BranchesQuerterwiseValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_BranchesQuerterwiseValue);
        
        lblUnison_EformLogged = new Label("Eform Logged");
        lblUnison_EformLogged.setBounds(10, 200, 230, 20);
        lblUnison_EformLogged.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_EformLogged);
        
        lblUnison_EformLoggedValue = new Label(String.valueOf(Unison_EformLogged));
        lblUnison_EformLoggedValue.setBounds(250, 200, 200, 20);
        lblUnison_EformLoggedValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_EformLoggedValue);
        
        lblUnison_ComplaintLogged = new Label("Complaint Logged");
        lblUnison_ComplaintLogged.setBounds(10, 230, 230, 20);
        lblUnison_ComplaintLogged.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_ComplaintLogged);
        
        lblUnison_ComplaintLoggedValue = new Label(String.valueOf(Unison_ComplaintLogged));
        lblUnison_ComplaintLoggedValue.setBounds(250, 230, 200, 20);
        lblUnison_ComplaintLoggedValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_ComplaintLoggedValue);
          
       }
       
       //1
       else if(flagTotalUser == 1 && flagInactiveUsers == 1 && flagTotalUsersLoginPerDay == 1 && flagSessionEntryPerDay == 1 && flagBranchesQuerterwise == 1 && flagEformLogged == 1 && flagComplaintLogged == 1 && flagQuertzPerDay == 1 && flagAverageSessionTimePerDay == 0) {
        
        lblUnison_TotalUsers = new Label("Total Users");
        lblUnison_TotalUsers.setBounds(10, 50, 230, 20);
        lblUnison_TotalUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsers);
        
        lblUnison_TotalUsersValue = new Label(String.valueOf(Unison_TotalUsers));
        lblUnison_TotalUsersValue.setBounds(250, 50, 150, 20);
        lblUnison_TotalUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersValue);
        
        lblUnison_InactiveUsers = new Label("Inactive Users");
        lblUnison_InactiveUsers.setBounds(10, 80, 230, 20);
        lblUnison_InactiveUsers.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsers);
        
        lblUnison_InactiveUsersValue = new Label(String.valueOf(Unison_InactiveUsers));
        lblUnison_InactiveUsersValue.setBounds(250, 80, 150, 20);
        lblUnison_InactiveUsersValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_InactiveUsersValue);
        
        lblUnison_TotalUsersLoginPerDay = new Label("Total Users Logged In Per Day");
        lblUnison_TotalUsersLoginPerDay.setBounds(10, 110, 230, 20);
        lblUnison_TotalUsersLoginPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDay);
        
        lblUnison_TotalUsersLoginPerDayValue = new Label(String.valueOf(Unison_TotalLoggedUsersPD));
        lblUnison_TotalUsersLoginPerDayValue.setBounds(250, 110, 200, 20);
        lblUnison_TotalUsersLoginPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_TotalUsersLoginPerDayValue);
        
        lblUnison_SessionEntryPerDay = new Label("Session Entry Per Day");
        lblUnison_SessionEntryPerDay.setBounds(10, 140, 230, 20);
        lblUnison_SessionEntryPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDay);
        
        lblUnison_SessionEntryPerDayValue = new Label(String.valueOf(Unison_SessionEntryPerDay));
        lblUnison_SessionEntryPerDayValue.setBounds(250, 140, 200, 20);
        lblUnison_SessionEntryPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_SessionEntryPerDayValue);
        
        lblUnison_BranchesQuerterwise = new Label("Branches Querterwise");
        lblUnison_BranchesQuerterwise.setBounds(10, 170, 230, 20);
        lblUnison_BranchesQuerterwise.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_BranchesQuerterwise);
        
        lblUnison_BranchesQuerterwiseValue = new Label(String.valueOf(Unison_BranchesQuerterwise));
        lblUnison_BranchesQuerterwiseValue.setBounds(250, 170, 200, 20);
        lblUnison_BranchesQuerterwiseValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_BranchesQuerterwiseValue);
        
        lblUnison_EformLogged = new Label("Eform Logged");
        lblUnison_EformLogged.setBounds(10, 200, 230, 20);
        lblUnison_EformLogged.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_EformLogged);
        
        lblUnison_EformLoggedValue = new Label(String.valueOf(Unison_EformLogged));
        lblUnison_EformLoggedValue.setBounds(250, 200, 200, 20);
        lblUnison_EformLoggedValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_EformLoggedValue);
        
        lblUnison_ComplaintLogged = new Label("Complaint Logged");
        lblUnison_ComplaintLogged.setBounds(10, 230, 230, 20);
        lblUnison_ComplaintLogged.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_ComplaintLogged);
        
        lblUnison_ComplaintLoggedValue = new Label(String.valueOf(Unison_ComplaintLogged));
        lblUnison_ComplaintLoggedValue.setBounds(250, 230, 200, 20);
        lblUnison_ComplaintLoggedValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_ComplaintLoggedValue);
        
        lblUnison_QuertzPerDay = new Label("Quartz Count");
        lblUnison_QuertzPerDay.setBounds(10, 230, 230, 20);
        lblUnison_QuertzPerDay.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_QuertzPerDay);
        
        lblUnison_QuertzPerDayValue = new Label(String.valueOf(Unison_QuertzPerDay));
        lblUnison_QuertzPerDayValue.setBounds(250, 230, 200, 20);
        lblUnison_QuertzPerDayValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        pnlUnison.add(lblUnison_QuertzPerDayValue);
        
        
          
       }
       
       //2
       
       
       else {
       
       }
       
        /**
        String v1 = DatabaseVersion.substring(0,75);
        String v2 = DatabaseVersion.substring(76);
        lblCurrentDate.setText(CurrentDate);
        lblDBVersion.setText(v1);
        lblDBVersion2.setText(v2);
        lblDBID.setText(DatabaseID);
        lblDBNAME.setText(database_name);
        lblDBCreated.setText(DbCreated);
        lblDBCompatible.setText(DbCompatibility);
        lblMDF.setText(String.valueOf(DbMDF));
        lblLDF.setText(String.valueOf(DbLDF));
        lblDBOwner.setText(DBOwner);
        lblCurrentDate.setText(CurrentDate);
        lblDBLocation.setText(DBLocation);
        
        **/
        
        }
        
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
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lblCurrentDate = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        spnlDbFragmentation = new javax.swing.JTabbedPane();
        spnlDatabase = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatabase = new javax.swing.JTable();
        spnlSystem = new javax.swing.JScrollPane();
        tblSystem = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlUnison = new javax.swing.JPanel();
        tbdProducts = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health CHeck Report Generator");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainTitle2.PNG"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton1.setText("Go Back");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Current Date");

        lblCurrentDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCurrentDate.setText("lblCurrentDate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCurrentDate)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel18)
                .addComponent(lblCurrentDate))
        );

        jButton4.setBackground(new java.awt.Color(153, 0, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton4.setText("Custom Date");

        jButton2.setBackground(new java.awt.Color(102, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton2.setText("Custom Query");

        btnExport.setBackground(new java.awt.Color(153, 51, 255));
        btnExport.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnExport.setText("Export Report");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        spnlDbFragmentation.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblDatabase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDatabase);
        if (tblDatabase.getColumnModel().getColumnCount() > 0) {
            tblDatabase.getColumnModel().getColumn(1).setResizable(false);
        }

        spnlDatabase.setViewportView(jScrollPane3);

        spnlDbFragmentation.addTab("Database Information", spnlDatabase);

        tblSystem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spnlSystem.setViewportView(tblSystem);

        spnlDbFragmentation.addTab("System Information", spnlSystem);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Fragment Percentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        spnlDbFragmentation.addTab("Database Fragmentation", jScrollPane2);

        javax.swing.GroupLayout pnlUnisonLayout = new javax.swing.GroupLayout(pnlUnison);
        pnlUnison.setLayout(pnlUnisonLayout);
        pnlUnisonLayout.setHorizontalGroup(
            pnlUnisonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        pnlUnisonLayout.setVerticalGroup(
            pnlUnisonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnlUnison);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tbdProducts, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnlDbFragmentation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnlDbFragmentation, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbdProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DataFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        //Export Button Functionality
        
        /**
       XWPFDocument document = new XWPFDocument();   
       XWPFParagraph tmpParagraph = document.createParagraph();   
       XWPFRun tmpRun = tmpParagraph.createRun();   
       tmpRun.setText(fileContent);   
       tmpRun.setFontSize(18);   
       FileOutputStream fos = new FileOutputStream(new File("C:\\HCReport\\"+filename + ".doc"));   
       document.write(fos);   
       fos.close();
       * **/
    }//GEN-LAST:event_btnExportActionPerformed

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
            java.util.logging.Logger.getLogger(ResultsetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultsetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultsetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultsetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultsetFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCurrentDate;
    private javax.swing.JPanel pnlUnison;
    private javax.swing.JScrollPane spnlDatabase;
    private javax.swing.JTabbedPane spnlDbFragmentation;
    private javax.swing.JScrollPane spnlSystem;
    private javax.swing.JTabbedPane tbdProducts;
    private javax.swing.JTable tblDatabase;
    private javax.swing.JTable tblSystem;
    // End of variables declaration//GEN-END:variables
}
