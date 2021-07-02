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
public class reverseAnArray {
    public void reverse(int array[],int size)
    {
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(array[i]+" ");
        }
    }
}
