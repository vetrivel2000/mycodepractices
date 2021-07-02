/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package insert;
public class insertAnElement {
    public void addElement(int array[],int size,int element,int position)
    {
        size = size+1;
        for(int i=size-1;i>=position;i--)
        {
            array[i]=array[i-1];
        }
        array[position-1]=element;
        System.out.println("The array after inserting an element:");
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }
}
