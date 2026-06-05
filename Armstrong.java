// import java.lang.*;
public class Armstrong {
    public static void main(String[] args) {
        
        int n=153;
        int temp = n ,temp1=n;
        int count=0;

        while(n>0)
        {
            count++;
            n=n/10;
        }
        // System.out.println(count);
        int sum=0,base;
        while(temp > 0)
        {
            base = temp%10;
            sum+=Math.pow(base,count);
            temp = temp/10;
        }
        System.out.println(sum);
        if(sum == temp1){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
