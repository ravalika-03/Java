public class BinarytoDecimal {
    public static int binaryToDecimal(int n){
        int sum=0;
        int power=0;
        while(n>0)
        {
            int lastDigit=n%10;
            sum+=lastDigit*Math.pow(2, power);
            power++;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=1011;
        System.out.println(binaryToDecimal(n));
    }
}
