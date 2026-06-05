public class MissingEleArray {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2};

        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int sum_natural=max*(max+1)/2;
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        System.out.println("Missing element is: "+(sum_natural- sum));
    }
}