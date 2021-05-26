/*Given a square matrix of size nxn, find the sum of all sub-squares of size k(k<=n)*/


import java.util.*;
public class Question2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,k;
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
        System.out.println("Enter the value of k");
        k=sc.nextInt();
        for(int i=0;i<n-k+1;i++)
        {
            for(int j=0;j<n-k+1;k++)
            {
                int sum=0;
                for(int x=i;x<k+i;x++)
                {
                    for(int y=j;y<k+j;y++)
                    {
                        sum=sum+arr[x][y];
                        System.out.print(sum);
                        System.out.print(" ");
                    }
                }
            }
        }
        sc.close();
    }
}
