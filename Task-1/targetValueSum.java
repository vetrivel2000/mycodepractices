/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package target;
public class targetValueSum {
    public void findElements(int array[],int size,int target)
    {
        System.out.println("The required elements are:");
        for(int i=0;i<size;i++)
        {
            int flag=0;
            for(int j=i+1;j<size;j++)
            {
                if(array[i]+array[j]==target)
                {
                    flag=1;
                    System.out.println(array[i]+","+array[j]);
                }
            }
            if(flag==1)
                System.out.println();
        }
    }
}
