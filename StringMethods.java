public class StringMethods {
    public static void main(String args[]) {
        String s= "hello";
        String s1="HI";
        System.out.println(s.toUpperCase());
        System.out.println(s1.toLowerCase());
        
        char[] characters = s.toCharArray();
        for (char ch:characters){
            System.out.print(ch+" " );
        }

        char[] c={'a','p','p','l','e'};
        String s2=String.valueOf(c);
        System.out.println(s2);

        String str = new String("hello");
        String str1 = new String("hello");

            System.out.println(str==str1); //false
       
            System.out.println(str.equals(str1));//true
        

        String st="bits";
        // String st1 = "college";
        st+="college";

        System.out.println(st);

        String st1 = "water";
        System.out.println(st1.substring(0,3));

        String st3 = "";
        System.out.println(st3.isEmpty());

        String string="mango";
        System.out.println(string.indexOf('g'));
        System.out.println(string.contains("man"));
        System.out.println(string.startsWith("ma"));
        System.out.println(string.endsWith("go"));
    }   
}
