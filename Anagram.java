
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="mam";
        String s2="amma";

        char[] c1 = s1.toCharArray();
        char[] c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String r1 = new String(c1);
        String r2 = new String(c2);

        if(r1.equals(r2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
    
}
