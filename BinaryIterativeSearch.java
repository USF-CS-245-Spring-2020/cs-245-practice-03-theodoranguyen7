public class BinaryIterativeSearch implements Practice03Search{
    @Override
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) //Iterates through each index in the array5
        {
            int mid = (start + end) / 2; //Find the middle of the array

            if (arr[mid] == target) /*Checks if the target number is the same number as the number
                                   in the middle of the array*/
            {
                return mid;
            }

            if (arr[mid] < target) /*Checks if the target number is a greater number than the number in
                                   the middle of the array*/
            {
                start = mid + 1;   //If true, start from the middle and increment indexes to iterate through array
            }

            else
            {
                end = mid - 1; //If true, start from the middle and decrease indexes to iterate through array
            }
        }

        return 0;
    }
}
