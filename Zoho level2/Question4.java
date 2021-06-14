//In a square matrix,double the edge elements and half the other elements//



import java.util.*;
public class Question4 {
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
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j==0)
				{
                  arr[i][j]=2*arr[i][j];
                }
                else if(i==n-1 && j==n-1)
                {
					arr[i][j]=2*arr[i][j];
				}	
                else if(i==0 && j==n-1)
                {
					arr[i][j]=2*arr[i][j];
				}
                else if(i==n-1 && j==0)
                {
					arr[i][j]=2*arr[i][j];
				}
                else
                {
					arr[i][j]=1/2*arr[i][j];
				}				
			}
		}
        for(int i=0;i<n;i++)
        {
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}			
		sc.close();
	}
}	
