import java.util.*;
class Vote
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age; 
        System.out.print("Enter age: ");
        age=sc.nextInt();
        String res = (age > 18) ? ("Eligible"):("Not Eligible");

        System.out.println(res);
    }
}