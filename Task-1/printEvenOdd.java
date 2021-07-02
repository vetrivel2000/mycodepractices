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
public class printEvenOdd {
    public void oddEven(int array[],int size)
    {
        for(int i=0;i<size;i++)
        {
            if(array[i]%2==0)
               System.out.print(array[i]+" ");
        }
        for(int i=0;i<size;i++)
        {
            if(array[i]%2==1)
               System.out.print(array[i]+" ");
        }
    }
}
