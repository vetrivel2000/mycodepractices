/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package arraylist;

import java.util.*;

public class CreationOfArrayList {
    public void arrayToArrayList(Integer array[])
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
    }
}
