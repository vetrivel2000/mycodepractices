/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package remove;
public class removeAnElement {
    public void removeElement(int array[],int size,int element)
    {
     int i;   
     for(i=0;i<size;i++)
     {
         if(array[i]==element)
            break;
     }
     if(i<size)
     {
         size= size - 1;
         for(int j=i;j<size;j++)
         {
             array[j]=array[j+1];
         }
     }
     System.out.println("The remaining array is:");
     for(i=0;i<size;i++)
     {
         System.out.print(array[i]+" ");
     }
     System.out.println();
    }
}
