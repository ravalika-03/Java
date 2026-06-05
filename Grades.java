import java.util.Scanner;
public class Grades
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        if(marks>=91 && marks<= 100 )
        {
            System.out.println("O");
        }
        else if(marks >= 81 && marks <= 90)
        {
            System.out.println("A+");
        }
        else if(marks >= 71 && marks <= 80)
        {
            System.out.println("A");
        }
        else if(marks >= 61 && marks <= 70)
        {
            System.out.println("B+");
        }
        else if(marks >= 51 && marks <= 60)
        {
            System.out.println("B");
        }
        else 
        {
            System.out.println("F");
        }
        sc.close();
    }
}