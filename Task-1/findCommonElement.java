/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package common;
public class findCommonElement {
    public void numericCommon(int array1[],int array2[],int size1,int size2)
    {
        System.out.println("The common elements in numeric array are:");
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            {
                if(array1[i]==array2[j])
                {
                    System.out.println(array1[i]+" ");
                    break;
                }
            }
        }
    }
    public void wordCommon(String array1[],String array2[],int size1,int size2)
    {
        System.out.println("The common elements in string array are:");
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    System.out.println(array1[i]+" ");
                    break;
                }
            }
        }
    }
}
