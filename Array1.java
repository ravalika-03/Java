
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        
        System.out.print("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        
        int size=sc.nextInt();
        System.out.print("Enter elements: ");

        int[] arr = new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
