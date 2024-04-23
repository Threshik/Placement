public static int removeDuplicate(int arr[])
{
  int count=1;
  for(int i=1;i<n;i++){
    if(arr[i]!=arr[i-1]) //curent element compared with the previous element
    {
      arr[count]=arr[i]; //checks only for the unique elements in the array and the duplicate element's first occurrence is only taken into account for only one time
      count++;
    }
    return count;
}
