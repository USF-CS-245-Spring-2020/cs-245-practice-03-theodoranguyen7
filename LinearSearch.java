public class LinearSearch implements Practice03Search {
    @Override
    public int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) //iterates through the array from index 0 until the index holding
        {                                    //the target value is found
            if (arr[i] == target)
            {
                return i;
            }
        }
        return 0;
    }
}
