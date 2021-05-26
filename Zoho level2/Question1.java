/*Given an array of integers, replace every element with the next greatest element 
(greatest element on the right side) in the array. Since there is no element next to the last element,
 replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to 
 {17, 5, 5, 5, 2, -1}.*/

 import java.util.*;
 public class Question1{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int n;
         System.out.println("Enter the array size");
         n=sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter the array");
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++)
         {
             if(i==n-1)
             {
                System.out.print("-1");
                break;
             }
             int max=0;
             for(int j=i+1;j<n;j++)
             {
                     if(arr[j]>max)
                     max=arr[j];
             }
             System.out.print(max);
             System.out.print(" ");
         }
         sc.close();
     }
 }