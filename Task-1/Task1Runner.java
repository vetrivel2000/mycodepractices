/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package task;
import index.IndexOfAnElement;
import sum.SumOfValues;
import remove.RemoveAnElement;
import insert.InsertAnElement;
import test.TestAnElement;
import maxmin.MaxAndMinElement;
import common.FindCommonElement;
import duplicateremoval.RemoveDuplicate;
import oddeven.NumberOfOddEven;
import average.AverageExceptMaxMin;
import target.TargetValueSum;
import revarray.ReverseAnArray;
import evenodd.PrintEvenOdd;
import sortarray.SortAnArray;
import leaders.LeadersOfTheArray;
import java.util.*;
public class Task1Runner {
    public static void main(String args[])
    {
         int Question;
         Scanner sc = new Scanner(System.in);
         do
         {
             System.out.println("Enter the Question.no:");
             Question = sc.nextInt();
             switch(Question)
             {
                 case 1:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength1 = sc.nextInt();
                     int[] array1 = new int[arrayLength1];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength1;i++)
                     {
                         array1[i]=sc.nextInt();
                     }
                     System.out.println("Enter the element you need to find the index");
                     int element = sc.nextInt();
                     IndexOfAnElement object1 = new IndexOfAnElement();
                     int index=object1.findIndex(array1,arrayLength1,element);
                     System.out.println("The index of the element "+element+" is:"+index);
                     break;
                 }
                 case 2:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength2 = sc.nextInt();
                     int[] array2 = new int[arrayLength2];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength2;i++)
                     {
                         array2[i]=sc.nextInt();
                     }
                     SumOfValues object2 = new SumOfValues();
                     int sum=object2.findSum(array2,arrayLength2);
                     System.out.println("The sum of all values in this numeric array is:"+sum);
                     break;
                 }
                 case 3:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength3 = sc.nextInt();
                     int[] array3 = new int[arrayLength3];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength3;i++)
                     {
                         array3[i]=sc.nextInt();
                     }
                     System.out.println("Enter the element you want to remove:");
                     int elementToBeRemove = sc.nextInt();
                     RemoveAnElement object3 = new RemoveAnElement();
                     object3.removeElement(array3,arrayLength3,elementToBeRemove);
                     break;
                 }
                 case 4:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength4 = sc.nextInt();
                     int[] array4 = new int[100];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength4;i++)
                     {
                         array4[i]=sc.nextInt();
                     }
                     System.out.println("Enter the element you want to add:");
                     int elementToBeAdd = sc.nextInt();
                     System.out.println("Enter the specific position you want to add:");
                     int position = sc.nextInt();
                     InsertAnElement object4 = new InsertAnElement();
                     object4.addElement(array4,arrayLength4,elementToBeAdd,position);
                     break;
                 }
                 case 5:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength5 = sc.nextInt();
                     int[] array5 = new int[arrayLength5];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength5;i++)
                     {
                         array5[i]=sc.nextInt();
                     }
                     System.out.println("Enter the element you want to check:");
                     int elementToCheck = sc.nextInt();
                     TestAnElement object5 = new TestAnElement();
                     object5.testElement(array5,arrayLength5,elementToCheck);
                     break;
                 }
                 case 6:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength6 = sc.nextInt();
                     int[] array6 = new int[arrayLength6];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength6;i++)
                     {
                         array6[i]=sc.nextInt();
                     }
                     MaxAndMinElement object6 = new MaxAndMinElement();
                     int max=object6.findMax(array6,arrayLength6);
                     int min=object6.findMin(array6,arrayLength6);
                     System.out.println("The maximum of all values in this numeric array is:"+max);
                     System.out.println("The minimum of all values in this numeric array is:"+min);
                     break;
                 }
                 case 7:
                 {
                     System.out.println("Enter the length of the first numeric array:");
                     int firstArrayLength = sc.nextInt();
                     int[] firstArray = new int[firstArrayLength];
                     System.out.println("Enter first numeric array elements:");
                     for(int i=0;i<firstArrayLength;i++)
                     {
                         firstArray[i]=sc.nextInt();
                     }
                     System.out.println("Enter the length of the second numeric array:");
                     int secondArrayLength = sc.nextInt();
                     int[] secondArray = new int[secondArrayLength];
                     System.out.println("Enter second numeric array elements:");
                     for(int i=0;i<secondArrayLength;i++)
                     {
                         secondArray[i]=sc.nextInt();
                     }
                     System.out.println("Enter the length of the first string array:");
                     int firstArrayLength1 = sc.nextInt();
                     String[] firstArray1 = new String[firstArrayLength1];
                     System.out.println("Enter first string array elements:");
                     for(int i=0;i<firstArrayLength1;i++)
                     {
                         firstArray1[i]=sc.next();
                     }
                     System.out.println("Enter the length of the second string array:");
                     int secondArrayLength1 = sc.nextInt();
                     String[] secondArray1 = new String[secondArrayLength1];
                     System.out.println("Enter second string array elements:");
                     for(int i=0;i<secondArrayLength1;i++)
                     {
                         secondArray1[i]=sc.next();
                     }
                     FindCommonElement object7 = new FindCommonElement();
                     object7.numericCommon(firstArray,secondArray,firstArrayLength,secondArrayLength);
                     object7.wordCommon(firstArray1,secondArray1,firstArrayLength1,secondArrayLength1);
                     break;
                 }
                 case 8:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength8 = sc.nextInt();
                     int[] array8 = new int[arrayLength8];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength8;i++)
                     {
                         array8[i]=sc.nextInt();
                     }
                     RemoveDuplicate object8 = new RemoveDuplicate();
                     System.out.println("The array after removing duplicate is:");
                     object8.duplicate(array8,arrayLength8);
                     System.out.println();
                     break;                     
                 }
                 case 9:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength9 = sc.nextInt();
                     int[] array9 = new int[arrayLength9];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength9;i++)
                     {
                         array9[i]=sc.nextInt();
                     }
                     NumberOfOddEven object9 = new NumberOfOddEven();
                     object9.countOddEven(array9,arrayLength9);
                     System.out.println();
                     break;
                 }
                 case 10:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength10 = sc.nextInt();
                     int[] array10 = new int[arrayLength10];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength10;i++)
                     {
                         array10[i]=sc.nextInt();
                     }
                     AverageExceptMaxMin object10 = new AverageExceptMaxMin();
                     object10.findAverage(array10,arrayLength10);
                     System.out.println();
                     break;
                 }
                 case 11:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength11 = sc.nextInt();
                     int[] array11 = new int[arrayLength11];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength11;i++)
                     {
                         array11[i]=sc.nextInt();
                     }
                     System.out.println("Enter target value:");
                     int targetValue=sc.nextInt();
                     TargetValueSum object11 = new TargetValueSum();
                     object11.findElements(array11, arrayLength11, targetValue);
                     break;
                 }
                 case 12:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength12 = sc.nextInt();
                     int[] array12 = new int[arrayLength12];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength12;i++)
                     {
                         array12[i]=sc.nextInt();
                     }
                     ReverseAnArray object12 = new ReverseAnArray();
                     System.out.println("The reversed array is:");
                     object12.reverse(array12,arrayLength12);
                     System.out.println();
                     break;
                 }
                 case 13:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength13 = sc.nextInt();
                     int[] array13 = new int[arrayLength13];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength13;i++)
                     {
                         array13[i]=sc.nextInt();
                     }
                     PrintEvenOdd object13 = new PrintEvenOdd();
                     object13.oddEven(array13,arrayLength13);
                     System.out.println();
                     break;   
                 }
                 case 14:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength14 = sc.nextInt();
                     int[] array14 = new int[arrayLength14];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength14;i++)
                     {
                         array14[i]=sc.nextInt();
                     }
                     SortAnArray object14 = new SortAnArray();
                     System.out.println("The sorted array is:");
                     object14.sort(array14,arrayLength14);
                     System.out.println();
                     break;
                 }
                 case 15:
                 {
                     System.out.println("Enter the length of the array:");
                     int arrayLength15 = sc.nextInt();
                     int[] array15 = new int[arrayLength15];
                     System.out.println("Enter array elements:");
                     for(int i=0;i<arrayLength15;i++)
                     {
                         array15[i]=sc.nextInt();
                     }
                     LeadersOfTheArray object15 = new LeadersOfTheArray();
                     System.out.println("The leaders of the array are:");
                     object15.findLeaders(array15,arrayLength15);
                     System.out.println();
                     break;
                 }
                 default:
                     System.out.println("No such program!!!!");
             }
         }while(Question<16);
    }
}
