/*Reverse the given string by wordwise
Ex:
I am good 
good am I
*/

import java.util.*;
public class Question5 
{
	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 String str=sc.nextLine();
	 String st[]=str.split(" ");
	 for(int i=st.length-1;i>=0;i--)
	 {
		 System.out.print(st[i]+" ");
	 }
	 sc.close();
	}
}
