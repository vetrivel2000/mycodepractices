/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package customer;
import java.util.*;
public class CustomerInfo {
    public static HashMap<Integer,CustomerInfo> map = new HashMap<>();
    public HashMap<Integer,Integer> map1 = new HashMap<>();
    public int customerId;
    public String name;
    @Override
    public String toString(){
        String result="\nCustomerInfo\n"+"CustomerId  : "+customerId+"\n"+"Name        : "+name+"\n"+"AccountInfo\n";
        for(int values:map1.keySet()){
            result += "AccountNumber : "+values+"\nBalance    : "+map1.get(values)+"\n";
        
        }
        return result;
    }
}
