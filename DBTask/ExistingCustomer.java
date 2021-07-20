/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package existing;
import java.util.*;
import java.sql.*;
public class ExistingCustomer {
    public void alreadyCustomer() throws Exception
    {
       String url = "jdbc:mysql://localhost/db";
       String user= "root";
       String pass= "Vetri@50"; 
       String query ="insert into AccountInfo(CustomerId,Balance) values(?,?)";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your CustomerId");
       int cust_id=sc.nextInt();
       double balance;
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,user,pass);  
       System.out.println("Enter the amount you want to deposit into your new account:");
       balance = sc.nextDouble();
       PreparedStatement st1=con.prepareStatement(query);
       st1.setInt(1,cust_id);
       st1.setDouble(2,balance);
       st1.executeUpdate();     
       st1.close();
       con.close();
    }
}
