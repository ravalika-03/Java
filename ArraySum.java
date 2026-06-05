public class ArraySum {
    public static void main(String[] args) {
        int[] arr={54,93,12,65};

        int sum = 0;

        for(int num : arr){
            while (num>0){
                sum += num % 10;
                num /= 10;
            }
        }
        System.out.println("Sum of digits is: "+sum);
    }
    
}
