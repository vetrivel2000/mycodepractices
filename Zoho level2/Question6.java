/*check whether the given two strings are rotation of each other or not
Ex:
Input:
Hello from here
reHello from he
Output:
YES


Input:
Hello from here
erHello from he
Output:
NO
*/


import java.util.*;
public class Question6 
{
	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 String str=sc.nextLine();
	 String st=sc.nextLine();
	 String temp=str+str;
	 if(temp.contains(st))
	 {
		 System.out.println("YES");
	 }
	 else
	 {
		 System.out.println("NO");
	 }
	 sc.close();
	}
}
