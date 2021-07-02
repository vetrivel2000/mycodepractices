/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package maxmin;
public class MaxAndMinElement {
    public int findMax(int array[],int size)
    {
        int max = 0;
        for(int i=0;i<size;i++)
        {
            if(max<array[i])
                max=array[i];
        }
        return max;
    }
    public int findMin(int array[],int size)
    {
        int min=array[0];
        for(int i=0;i<size;i++)
        {
            if(min>array[i])
                min=array[i];
        }
        return min;
    }
}
