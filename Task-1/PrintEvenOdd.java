/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package evenodd;
public class PrintEvenOdd {
    public void oddEven(int array[],int size)
    {
        int j=-1,temp;
        for(int i=0;i<size;i++)
        {
            if(array[i]%2==0)
            {
                j++;
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        System.out.println("The array after seperating even numbers first and odd numbers next:");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
