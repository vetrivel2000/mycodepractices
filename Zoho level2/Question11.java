/*Find if a String2 is present in String1,if yes then return the index else return -1*/

import java.util.*;
public class Question11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        if(str.contains(str1))
        {
            System.out.println(str.indexOf(str1));
        }
        else
        {
            System.out.println("-1");
        }
    }
}
