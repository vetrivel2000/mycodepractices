/*Expand the given String
Ex:a3b10
output:aaabbbbbbbbbb
 */




import java.util.*;
public class Question10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        char letter=' ';
        char temp[]=str.toCharArray();
        int i,j,num=0;
        for(i=0;i<temp.length;i++)
        {
            if(temp[i]>='0'&&temp[i]<='9') {
                letter = temp[i - 1];
                while (i<temp.length && temp[i] >= '0' && temp[i] <= '9') {
                    num = (num * 10) + (temp[i] - 48);
                    i++;
                }
                for (j = 0; j < num; j++) {
                    System.out.print(letter);
                }
            }
            num=0;
        }
    }
}
