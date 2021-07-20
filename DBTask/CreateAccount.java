/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package account;
import java.util.*;
import existing.ExistingCustomer;
import fresh.NewCustomer;
public class CreateAccount {
    public void accountCreate() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enter your choice:");
            System.out.println("1.Already a customer\n 2.New customer\n");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    ExistingCustomer obj = new ExistingCustomer();
                    obj.alreadyCustomer();
                    break;
                }
                case 2:
                {
                    NewCustomer obj1 = new NewCustomer();
                    obj1.freshCustomer();
                    break;
                }
                default:
                    System.out.println("No such choice!");
            }
        }while(choice<3);
    }
    public void newCustomer()
    {
        
    }
}
