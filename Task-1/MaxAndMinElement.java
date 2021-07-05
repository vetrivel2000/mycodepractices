/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package maxmin;
import java.util.*;
public class MaxAndMinElement {
    public int findMax(int array[],int size)
    {
        Arrays.sort(array);
        int max = array[size-1];
        return max;
    }
    public int findMin(int array[],int size)
    {
        Arrays.sort(array);
        int min=array[0];
        return min;
    }
}
