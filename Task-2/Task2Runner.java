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
import secondmax.SecondLargestElement;
import zerosandones.ZerosAndOnes;
import maxmin.MaximumMinimum;
import reverseletters.ReverseLettersOfTheString;
import reversewords.ReverseWordsOfTheString;
import arraylist.CreationOfArrayList;
import pojo.PojoClass;
import employee.ConstructorOverloading;
import rainbow.EnumRainbowColors;
import file.CreationOfFile;
import java.util.*;
public class Task2Runner {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int question;
        do{
            System.out.println("Enter the Question.no:");
            question=sc.nextInt();
            sc.nextLine();
            switch(question)
            {
                case 1:
                {
                    System.out.println("Enter the length of the array");
                    int arrayLength = sc.nextInt();
                    int[] array = new int[arrayLength];
                    System.out.println("Enter the array elements");
                    for(int i=0;i<arrayLength;i++)
                    {
                        array[i]=sc.nextInt();
                    }
                    SecondLargestElement object=new SecondLargestElement();
                    int secondLargest=object.findSecondMax(array, arrayLength);
                    System.out.println("The second Largest element in the given array is:"+secondLargest);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the length of the array");
                    int arrayLength2 = sc.nextInt();
                    int[] array2 = new int[arrayLength2];
                    System.out.println("Enter the array with 0's and 1's");
                    for(int i=0;i<arrayLength2;i++)
                    {
                        array2[i]=sc.nextInt();
                    }
                    ZerosAndOnes object2 = new ZerosAndOnes();
                    object2.segregateZerosAndOnes(array2,arrayLength2);
                    System.out.println("After segragating zeros first and ones next");
                    for(int i=0;i<arrayLength2;i++)
                    {
                        System.out.print(array2[i]+" ");
                    }
                    System.out.println();
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the length of the array");
                    int arrayLength3 = sc.nextInt();
                    int[] array3 = new int[arrayLength3];
                    System.out.println("Enter the array elements");
                    for(int i=0;i<arrayLength3;i++)
                    {
                        array3[i]=sc.nextInt();
                    }
                    MaximumMinimum object3 = new MaximumMinimum();
                    object3.printMaxMin(array3,arrayLength3);
                    System.out.println("The array after printing Maximum value as firstelement minimum value as second element and so on:");
                    for(int i=0;i<arrayLength3;i++)
                    {
                        System.out.print(array3[i]+" ");
                    }
                    System.out.println();
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the string:");
                    String text;
                    text=sc.nextLine();
                    ReverseLettersOfTheString object4 = new ReverseLettersOfTheString();
                    object4.reverseLetters(text);
                    System.out.println();
                    break;
                }
                case 5:
                {
                    System.out.println("Enter the string:");
                    String message;
                    message=sc.nextLine();
                    ReverseWordsOfTheString object5 = new ReverseWordsOfTheString();
                    object5.reverseWords(message);
                    System.out.println();
                    break;
                }
                case 6:
                {
                    System.out.println("Enter the length of the array");
                    int arrayLength6 = sc.nextInt();
                    Integer[] array6 = new Integer[arrayLength6];
                    System.out.println("Enter the array elements");
                    for(int i=0;i<arrayLength6;i++)
                    {
                        array6[i]=sc.nextInt();
                    }
                    CreationOfArrayList object6 = new CreationOfArrayList();
                    object6.arrayToArrayList(array6);
                    break;
                }
                case 7:
                {
                    System.out.println("Enter the customer name:");
                    String customerName=sc.next();
                    System.out.println("Enter the product name:");
                    String productName=sc.next();
                    System.out.println("Enter the orderId:");
                    String orderId=sc.next();
                    System.out.println("Enter the model number:");
                    String modelNumber=sc.next();
                    sc.nextLine();
                    System.out.println("Enter the type of the product:");
                    String type=sc.nextLine();
                    PojoClass object7 = new PojoClass();
                    object7.setCustomerName(customerName);
                    object7.setProductName(productName);
                    object7.setOrderId(orderId);
                    object7.setModelNumber(modelNumber);
                    object7.setProductType(type);
                    System.out.println(object7);
                    break;
                }
                case 8:
                {
                    ConstructorOverloading object81 = new ConstructorOverloading("Ganesh");
                    ConstructorOverloading object82 = new ConstructorOverloading("Vetri",10000);
                    ConstructorOverloading object83 = new ConstructorOverloading("Suresh",30000,102);
                    System.out.println(object81.employeeName);
                    System.out.println(object82.employeeName+" "+object82.salary);
                    System.out.println(object83.employeeName+" "+object83.salary+" "+object83.employeeId);
                    break;
                }
                case 9:
                {
                    EnumRainbowColors object9 = new EnumRainbowColors();
                    object9.findColorCode();
                    break;
                }
                case 10:
                {
                    CreationOfFile object10 = new CreationOfFile();
                    object10.createAndWrite();
                    break;
                }
                default:
                    System.out.println("No such program!!!!");
            }
        }while(question<11);
    }
}
