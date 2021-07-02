/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package average;
public class averageExceptMaxMin {
    public void findAverage(int array[],int size)
    {
        int max=0,min=array[1],sum=0,avg;
        for(int i=0;i<size;i++)
        {
            if(max<array[i])
                max=array[i];
            if(min>array[i])
                min=array[i];
            sum+=array[i];
        }
        avg=(sum-max-min)/(size-2);
        System.out.println("The average except the largest and smallest values is:"+avg);
    }
}
