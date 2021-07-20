/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package fresh;
import java.util.*;
import java.sql.*;
public class NewCustomer {
    public void freshCustomer() throws Exception
    {
        String url = "jdbc:mysql://localhost/db";
        String user= "root";
        String pass= "Vetri@50";
        String query ="insert into CustomerInfo(CustomerName) values(?)";
        String query1 ="insert into AccountInfo(CustomerId,Balance) values(?,?)";
        String username;
        double balance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        username = sc.nextLine();
        System.out.println("Enter the amount you want to deposit:");
        balance = sc.nextDouble();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,pass);
        PreparedStatement st=con.prepareStatement(query);
        st.setString(1,username);
        st.executeUpdate();
        Statement sta=con.createStatement();
        ResultSet rs = sta.executeQuery("select last_insert_id() from CustomerInfo");
        rs.next();
        int cust_id=rs.getInt("last_insert_id()");
        PreparedStatement st1=con.prepareStatement(query1);
        st1.setInt(1,cust_id);
        st1.setDouble(2,balance);
        st1.executeUpdate();
        rs.close();
        st.close();
        con.close();
    }
}
