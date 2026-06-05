
// import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr={4,6,12,89,45,34};

        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);

    }
    
}
