/*
Ex-1:
String:12345
Output:15
Ex-2:
String:12345678987654321
Output:81(Add the individual chars)
*/

import java.util.*;
public class Question13 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] temp=str.toCharArray();
        int sum=0;
        for(int i=0;i<temp.length;i++)
        {
            sum=sum+(temp[i]-48);
        }
        System.out.println(sum);
    }
}
