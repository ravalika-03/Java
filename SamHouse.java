class SamHouse
{
    public static void main(String args[])
    {
        int A=5, B=23, S=7, T=17;
        int[] apples = {5,6,-2,12};
        int[] oranges = {-9,-7,8,2};

        int acount=0,ocount=0;

        for(int i=0;i<apples.length;i++)
        {
            if(A+apples[i]>S && A+apples[i]<T)
            {
                acount++;
            }
        }

        for(int i=0;i<oranges.length;i++)
        {
            if(A+oranges[i]>S && A+oranges[i]<T)
            {
                ocount++;
            }
        }

        System.out.println(acount);
        System.out.println(ocount);


    }
}