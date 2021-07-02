/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package revarray;
public class ReverseAnArray {
    public void reverse(int array[],int size)
    {
        int array2[]=new int[size];
        int index=size-1;
        for(int i=0;i<size;i++)
        {
            array2[index]=array[i];
            index--;
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(array2[i]+" ");
        }
    }
}
