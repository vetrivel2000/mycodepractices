/*Given two sorted arrays,merge them such that the elements are not repeating*/



import java.util.*;
public class Question12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size1,size2;
        size1= sc.nextInt();
        size2= sc.nextInt();
        int[] sortedArray1=new int[size1];
        int[] sortedArray2=new int[size2];
        int[] mergedArray=new int[size1+size2];
        for(int i=0;i<size1;i++)
        {
            sortedArray1[i]= sc.nextInt();
            mergedArray[i]=sortedArray1[i];
        }
        int k=size1;
        for(int i=0;i<size2;i++)
        {
            sortedArray2[i]= sc.nextInt();
            mergedArray[k]=sortedArray2[i];
            k++;
        }
        Arrays.sort(mergedArray);
        int flag=0;
        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(mergedArray[i]==mergedArray[j])
                {
                    flag=1;
                    for(int p=j;p<k-1;p++)
                    {
                        mergedArray[p]=mergedArray[p+1];
                    }
                    k--;
                    j--;
                }
            }
        }
        if(flag==1)
        {
            for(int i=0;i<k;i++)
              System.out.print(mergedArray[i]+" ");
        }
    }
}
