import java.util.*;
public class TripletSumOfArrayGFG {
    public static boolean Triplet(int[] arr,int n,int sum)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {
            int left=i+1;
            int right=arr.length-1;
            while(left<right)
            {
                int currentsum=arr[i]+arr[left]+arr[right];
                if(currentsum==sum)
                    return true;
                else if(currentsum>sum)
                    right--;
                else
                    left++;
            }
        }
        return false;
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
        int sum=s.nextInt();
        System.out.print(Triplet(arr,n,sum));
    }

}
