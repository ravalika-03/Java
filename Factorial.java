public class Factorial {
    public static int fact(int n){
        //base case / exit condition
        if(n==1){
            return 1;
        }
        //recursive call
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int n=19;
        System.out.println("The factorial of "+n+" is: "+fact(n));
    }
}
