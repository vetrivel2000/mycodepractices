/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package sum;
public class SumOfValues {
    public int findSum(int array[],int size)
    {
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum = sum+array[i];
        }
        return sum;
    }
}
