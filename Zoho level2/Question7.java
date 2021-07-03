/*Reverse each words in given sentence

ex:
input:
find my reversal 
output:
dnif ym lasrever
*/

import java.util.*;
public class Question7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] temp = str.split(" ");
        for(String temp1 : temp) {
            StringBuilder st = new StringBuilder(temp1);
            System.out.print(st.reverse()+" ");
        }
    }
}
