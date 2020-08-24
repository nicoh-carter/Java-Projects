//Nicoh Carter

public class Carter_BinarySearch
{
 
    public static int doBinarySearch(int[] arr, int target)
    {
         
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (target == arr[mid])
            {
                return mid;
            }
            if (target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }
}