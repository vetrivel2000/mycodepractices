/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package leaders;
public class leadersOfTheArray {
    public void findLeaders(int array[],int size)
    {
        for(int i=0;i<size;i++)
        {
            int flag=0;
            if(i==size-1)
                System.out.print(array[i]+" ");
            else{
                for(int j=i+1;j<size;j++)
                {
                   if(array[i]>array[j])
                      flag=1;
                   else
                   {
                    flag=0;
                    break;
                   }
                }   
            }
            if(flag==1)
                System.out.print(array[i]+" ");
        }
    }
}
