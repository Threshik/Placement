import java.util.*;
public class CandyProblemLeetcode {
    public static int Candy(int[] arr)
    {
        int len = arr.length;
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        for(int i=0;i<len;i++)
        {
            arr1[i]=arr2[i]=1;
        }

        //left to right traversal

        for(int i=1;i<len;i++)
        {
            if(arr[i]>arr[i-1])
            {
                arr1[i]=arr1[i-1]+1;
            }
        }

        //right to left traversal

        for(int i=len-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1])
            {
                arr2[i]=arr2[i+1]+1;
            }
        }

        //finding the maximum candies in the both arrays

        int[] resSum = new int[len];
        int totalSum=0;
        for(int i=0;i<len;i++)
        {
            resSum[i] = Math.max(arr1[i],arr2[i]);
            totalSum+=resSum[i];
        }
        return totalSum;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.print(Candy(arr));
    }
}
