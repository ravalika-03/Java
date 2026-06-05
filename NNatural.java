public class NNatural {
    public static int naturalNum(int n){
        int sum=1;
        if(n==1){
            return sum;
        }
        else{
            return n+naturalNum(n-1);
        }
        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(naturalNum(n));
    }
        
}
    
