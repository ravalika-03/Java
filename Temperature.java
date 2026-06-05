
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature:");
        String temp = sc.next();

        if(temp.equals("high")){
            System.out.println("No");
        }
        else if(temp.equals("medium")){
            System.out.println("cloudy?:");
            boolean cloudy = sc.nextBoolean();
            if(cloudy == true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");

            }
        }
        else{
            System.out.println(" Enter rainy?: (true/false)");
            boolean rainy = sc.nextBoolean();
            if (rainy == true){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
