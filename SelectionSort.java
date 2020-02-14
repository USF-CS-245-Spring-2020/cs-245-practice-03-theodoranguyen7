public class SelectionSort implements Practice03Sort{
    @Override
    public void sort(int[] a)
    {
        for(int i = 0; i < a.length - 1; i++)
        {
            swap(a, i, findmin(a,i));
        }
    }

    private int findmin(int[] a, int start)
    {
        int min = start;

        for (int i = (start + 1); i < a.length; i++)
        {
            if(a[i] < min)
            {
                min = i;
            }
        }

        return min;

    }

    private void swap(int[] a, int i, int j) //swaps the values stored in two variables with each other
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
