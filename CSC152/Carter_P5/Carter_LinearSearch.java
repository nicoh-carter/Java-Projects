//Nicoh Carter

public class Carter_LinearSearch
{
 
   public static int doLinearSearch(int[] arr, int key)
   {
         
        int size = arr.length;
        for(int i=0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
}