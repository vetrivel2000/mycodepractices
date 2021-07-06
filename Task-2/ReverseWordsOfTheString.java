/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package reversewords;
public class ReverseWordsOfTheString {
    public void reverseWords(String text)
    {
        String[] str = text.split(" ");
        for(int i=str.length-1;i>=0;i--)
        {
            System.out.print(str[i]+" ");
        }
    }
}
