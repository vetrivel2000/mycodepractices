/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package test;
public class TestAnElement {
    public void testElement(int array[],int size,int element)
    {
        int flag=0;
        for(int i=0;i<size;i++)
        {
            flag=0;
            if(array[i]==element)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Yes,this value is in this array");
        }
        else
        {
            System.out.println("No,this value isn't in this array");
        }
    }
}
