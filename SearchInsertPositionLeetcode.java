import java.util.*;
public class SearchInsertPositionLeetcode {
    public static int Serach(int[] arr,int target){
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
                return i;
            else if(target<arr[i])
                return i;
        }
        return arr.length;
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
        int target=s.nextInt();
        System.out.print(Serach(arr,target));
    }
}
