/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package duplicateremoval;
public class RemoveDuplicate {
    public void duplicate(int array[],int size)
    {
        int[] temp = new int[size];
        int count=0;
        for(int i=0;i<size;i++)
        {
            int j;
            for(j=0;j<count;j++)
            {
                if(array[i]==temp[j])
                {
                    break;
                } 
            }
            if(j==count)
            {
                temp[count]=array[i];
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
