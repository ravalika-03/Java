import java.util.Scanner;

public class NestedIf{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        float cgpa = sc.nextFloat();

        
        if(cgpa >= 7.5f)
        {
            int backlog = sc.nextInt();
            if(backlog < 2)
            {
                int coding = sc.nextInt();
                if(coding >=2)
                {
                    int com = sc.nextInt();
                    if(com >= 60)
                    {
                        System.out.println("Eligible for Placements");
                    }
                    else{
                        System.out.println("Sorry! Improve your Communication SKills");
                    }
                }
                else{
                    System.out.println("Sorry! You should get 2 coding questions correct.");
                }

            }
            else{
                System.out.println("Sorry! You should have less than 2 backlogs.");
            }
        }
        else{
            System.out.println("Sorry! Your cgpa should more than 7.5");
        }
    }
}