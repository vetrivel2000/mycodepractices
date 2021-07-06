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
import java.util.*;
public class MaximumMinimum {
    public void printMaxMin(int array[],int size)
    {
        Arrays.sort(array);
        int temp;
        for(int i=0;i<size;i++)
        {
            for(int j=size-1;j>=i+1;j--)
            {
                if(array[j]>array[i] && i%2==0)
                {
                    temp=array[i];
		    array[i]=array[j];
		    array[j]=temp;
                }
                if(array[j]<array[i] && i%2==1)
                {
		    temp=array[i];
		    array[i]=array[j];
		    array[j]=temp;   
		}
            }
        }
    }
}
