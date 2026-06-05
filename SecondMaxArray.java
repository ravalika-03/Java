public class SecondMaxArray {
    public static void main(String[] args) {
        int[] arr={12,15,80,56,23,78};

        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        

        // for(int i=0;i<arr.length;i++) this is another way
        for(int ele:arr)
        {
            if(ele>fmax)
            {
                smax=fmax;
                fmax=ele;
            }
            else if(ele>smax && ele!=fmax)
            {
                smax=ele;
            }
        }
        System.out.println(smax);
    }
    
}
