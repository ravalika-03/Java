class MarksArray
{
    public static void main(String args[])
    {
        int[] arr = {14,23,31,67,32,75};
        // char gender = 'g';
        char gender = 'b';

        int sum = 0;

        if (gender == 'g')
        {
            for (int i=0;i<arr.length;i+=2)
            {
                sum+=arr[i];
            }
        }
        else {
            for (int i=1;i<arr.length;i+=2)
            {
                sum+=arr[i];
            }
        }

        System.out.println(sum);

    }
}