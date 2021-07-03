/* Remove a common fragments from the given three strings

Ex:
Input:
Every morning I want to do exercise
Every morning I want to do meditation without fail
It is important that I want to be happy always
Output:
I want to
*/

import java.util.*;
public class RemoveFragment {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        
       String words1[] = str1.split(" ");
       String words2[] = str2.split(" ");
       String words3[] = str3.split(" ");
        for(int i=0;i<words1.length;i++)
        {
            for(int j=0;j<words2.length;j++)
            {
                for(int k=0;k<words3.length;k++)
                {
                    if(words1[i].equals(words2[j])&&words2[j].equals(words3[k])&&words3[k].equals(words1[i]))
                        System.out.print(words1[i]+" ");
                }
            }
        }
    }
}
