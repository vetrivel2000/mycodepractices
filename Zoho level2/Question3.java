//Given a square matrix,perform mirrored z-traversal of the matrix and display the elements//



import java.util.*;
public class Question3 {   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the matrix size");
        n=sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[0][i]+" ");
        }
        int i=1,j=1;
        while(i<n-1 && j<n-1)
        {
            System.out.print(arr[i][j]+" ");
            i++;
            j++;
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.print(arr[n-1][i]+" ");
        }
        sc.close();
    } 
}
