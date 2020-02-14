public class BinaryRecursiveSearch implements Practice03Search{
    @Override
    public int search(int[] arr, int target) {
        return search(0, (arr.length - 1), arr, target);
        //return 0;
    }
    public int search(int start, int end, int[] arr, int target) //Overload
    {
        int mid = (start + end) / 2;

        if(start > end) //Base case
        {
            return -1;
        }

        if (arr[mid] == target)
        {
            return mid;
        }

        else if (arr[mid] < target)
        {
            return search(mid + 1, end, arr, target); //recursively increments from the middle of the array
        }                                                  //towards the end of the array until target is found

        else
        {
            return search(start, mid - 1, arr, target); //recursively decrements from the middle of the array
        }                                                    //towards the

    }

}
