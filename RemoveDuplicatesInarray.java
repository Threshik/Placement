public static int removeDuplicate(int arr[])
{
  int count=1;
  for(int i=1;i<n;i++){
    if(arr[i]!=arr[i-1]) //curent element compared with the previous element
    {
      arr[count]=arr[i];
      count++;
    }
    return count;
}
