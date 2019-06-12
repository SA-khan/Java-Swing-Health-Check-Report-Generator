
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saad.ahmed
 */
public class DatabaseConnection implements Runnable {
    
    public boolean flag;
    
    public DatabaseConnection(String ip, String user, String password, String database, String database_type) {
       // store parameter for later user
       flag = DBaseConnection(ip, user, password, database, database_type);
   }
    

    @Override
    public void run() {
          
    } 
    
    public boolean DBaseConnection (String ip, String user, String password, String database, String database_type) {
        
        //Start
        System.out.println(ip);
        System.out.println(user);
        System.out.println(password);
        System.out.println(database);
        System.out.println(database_type);

        if(ip == "" || user == "" ||  password == "" || database == "" || database_type == ""){
             System.out.println("Fields are empty.");
             flag = false;
        }
        else if (database_type == "Microsoft SQL Server") {
            
             String Url = "jdbc:sqlserver://"+ip+";DatabaseName=" + database + ";user=" + user + ";Password=" + password + "";
             
              try {     
                   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                   System.out.println("Trying to connect");
                   Connection connection = DriverManager.getConnection(Url);
                   System.out.println("Successfully Connected to Database Server.");
                   flag = true;
                }
                catch(Exception e) {
                   System.out.println("Unable to connect to Database Server.");
                   flag = false;
                }
        }
            
        else if(database_type == "Oracle Server") {
            System.out.println("Oracle Server Coding Not Found.");
            flag = false;
        }
            
        else if(database_type == "MySql Server") {
            System.out.println("Oracle Server Coding Not Found.");
            flag = false;
        }
            
        else if(database_type == "MangoDB Server") {
            System.out.println("Oracle Server Coding Not Found.");
            flag = false;
        }
        
        else if(database_type == "DB/2 Server") {
            System.out.println("Oracle Server Coding Not Found.");
            flag = false;
        }
            
        else if(database_type == "Redis Server") {
            System.out.println("Oracle Server Coding Not Found.");
            flag = false;
        }
        
        else {
            System.out.println("Unknown Error.");
            flag = false;
        }
        
        if(flag == true) {
            return true;
        }
        else {
            return false;
        }
        //End
    }

}


    

