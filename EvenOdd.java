import java.util.*;
class EvenOdd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter a number: ");
        n= sc.nextInt();
        // int n = 15

        // System.out.println((boolean) ((n&1) == 0) ? "Even" : "Odd");
        if ((n & 1) == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}