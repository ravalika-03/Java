public class ArrayMethod {
    public static int evenArray(int nums[]){
        int mul=1;
        for(int ele:nums){
            if(ele%2==1){
                mul*=ele;
            }
        }
        return mul;
    }
    public static void main(String[] args) {
        int[] nums={4,9,12,35,22,14};
        System.out.println("The Even Sum is: "+evenArray(nums));
    }
}
