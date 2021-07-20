/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
import java.util.*;
import account.CreateAccount;
import user.AccountHolders;
import customer.CustomerInfo;
public class TestRunner {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enter your choice:");
            System.out.println("1.Add an account\n 2. Show AccountInfo");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    CreateAccount obj = new CreateAccount();
                    obj.accountCreate();
                    break;
                }
                case 2:
                {
                    AccountHolders.showCustomerInfo();
                    System.out.println("Enter your CustomerId:");
                    int id=sc.nextInt();
                    System.out.println(CustomerInfo.map.get(id));
                    break;
                }
                default:
                    System.out.println("No such choice!");
            }
        }while(choice<3);
    }
}
