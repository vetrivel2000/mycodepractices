/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package user;
import java.sql.*;
import java.util.*;
import customer.CustomerInfo;
public class AccountHolders {
    static String url = "jdbc:mysql://localhost/db";
    static String user= "root";
    static String pass= "Vetri@50";
    public static void showCustomerInfo() throws Exception
    {
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,user,pass);
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery("select * from CustomerInfo");
       while(rs.next())
       {
           CustomerInfo obj = new CustomerInfo();
           obj.customerId=rs.getInt("CustomerId");
           obj.name=rs.getString("CustomerName");
           obj.map1=showAccountInfo(obj.customerId);
           obj.map.put(obj.customerId, obj);
       }
       rs.close();
       st.close();
       con.close();
    }
    public static HashMap showAccountInfo(int id) throws Exception
    {
        HashMap<Integer,Integer> map1=new HashMap<>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,pass);
        PreparedStatement st = con.prepareStatement("select * from AccountInfo where CustomerId=?");
        st.setInt(1,id);
        ResultSet rs=st.executeQuery();
        while(rs.next())
        {
            map1.put(rs.getInt("AccountNumber"),rs.getInt("Balance"));
        }
        rs.close();
        st.close();
        con.close();
        return map1;
    }
}
