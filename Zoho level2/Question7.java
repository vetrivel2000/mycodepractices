/*Reverse each words in given sentence

ex:
input:
find my reversal 
output:
dnif ym lasrever
*/
import java.util.*;
public class Question7 
{
static void rev(char str[],int i,int j)
{
	char temp;
	while(i<=j)
	{
		temp=str[i];
		str[i]=str[j];
		str[j]=temp;
		i++;
		j--;
	}
}
static char[] reverse(char s[])
{
	int i=0;
	for(int j=0;j<s.length;j++)
	{
		if(s[j]==' ')
		{
			rev(s,i,j);
			i=j+1;
		}
	}
	rev(s,i,s.length-1);
	return s;
}
public static void main(String[] args)
{
	 Scanner sc = new Scanner(System.in);
	 String str=sc.nextLine();
	 char st[]=reverse(str.toCharArray());
	 for(int i=0;i<st.length;i++)
	 {
		 System.out.print(st[i]);
	 }
	 sc.close();
}
}
