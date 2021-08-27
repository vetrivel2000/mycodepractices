/*
Given a two dimensional array of string like
 <”luke”, “shaw”>
 <”wayne”, “rooney”>
 <”rooney”, “ronaldo”>
 <”shaw”, “rooney”>
Where the first string is “child”, second string is “Father”. And given “ronaldo” we have to find his
no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.
*/


import java.util.*;
public class Question14 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String array[][]={{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
        int rowLength=array.length;
        String x= sc.nextLine();
        String s = null;
        int count=0;
        for(int i=0;i<rowLength;i++)
        {
            if(array[i][1].equals(x))
            {
                s=array[i][0];
            }
        }
        for (int i=0;i<rowLength;i++)
        {
            if(array[i][1].equals(s))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
