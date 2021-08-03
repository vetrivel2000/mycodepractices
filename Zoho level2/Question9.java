/*sort the elements in odd positions by descending order and elements in even position by ascending order*/


import java.util.*;
public class Question9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (i % 2 == 1 && j % 2 == 1) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
                if (i % 2 == 0 && j % 2 == 0) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
