/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package secondmax;
import java.util.*;
public class SecondLargestElement {
    public int findSecondMax(int array[],int size)
    {
        Arrays.sort(array);
        int secondMax=array[size-2];
        return secondMax;
    }
}
