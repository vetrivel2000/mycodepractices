/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package reverseletters;
public class ReverseLettersOfTheString {
    public void reverseLetters(String text)
    {
        StringBuilder sb = new StringBuilder(text);
        System.out.println(sb.reverse());
    }
}
