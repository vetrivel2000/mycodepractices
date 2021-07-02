/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package oddeven;
public class NumberOfOddEven {
    public void countOddEven(int array[],int size)
    {
        int oddCount=0,evenCount=0;
        for(int i=0;i<size;i++)
        {
            if(array[i]%2!=0)
                oddCount++;
            else
                evenCount++;
        }
        System.out.println("The number of odd integers are:"+oddCount);
        System.out.println("The number of even integers are:"+evenCount);
    }
}
