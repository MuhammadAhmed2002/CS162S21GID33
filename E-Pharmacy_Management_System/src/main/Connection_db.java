
package main;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class Connection_db {
 
  private static Connection connect(){
       try{
    Class.forName("com.mysql.jdbc.Driver"); 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useSSL=false","root","root1234");
    if(con!=null)return con ;
   }catch(Exception e){
	   e.printStackTrace();
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
   }
   return null ;
}    
  
	private static Connection instance;
	private static Object lock = new Object();
	private Connection_db() {
		
	}
	
	public static Connection getInstance() {
		if (instance == null) {
			synchronized(lock){
				if(instance == null) {
					instance = connect();
				}
			}
		}
		return instance;
				
	}
  
  }
   