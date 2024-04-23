import java.util.*;
public class removeElement {
    public static void main(String args[])
    {
        int[] arr ={3,2,2,3};
        int val=3;
        int len = arr.length;
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]!=val)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
