public class BubbleSort implements Practice03Sort{
    @Override
    public void sort(int[] a) {

        int passes = 1;
        boolean swapped = true;
        while(swapped)
        {
            swapped = false;
            for(int i = 0; i < (a.length - passes); i++)
            {
                if(a[i] > a[i + 1])
                    {
                        swap(a, i, i + 1);
                        swapped = true;
                    }
            }
            passes++;
        }

    }
    private void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
