import java.util.Scanner;

public class CircleArea {
    public static double area(int r){
        return 3.14*r*r;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter R value:");
        // System.out.println(area(3));
        int r=sc.nextInt();
        double a=area(r);
        System.out.println("Area is:"+a);



    }
}
