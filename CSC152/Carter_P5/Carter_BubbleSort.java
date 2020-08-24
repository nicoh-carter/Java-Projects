//Nicoh Carter

public class Carter_BubbleSort
{  
    public static int[] doBubbleSort(int arr[])
    {
        int n = arr.length;
        int k;
        for (int m = n; m >= 0; m--)
        {
            for (int i = 0; i < n - 1; i++)
            {
                k = i + 1;
                if (arr[i] > arr[k])
                {
                    swapNumbers(i, k, arr);
                }
            }
        }
        return arr;
    }
 
    private static void swapNumbers(int i, int j, int[] array)
    {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}