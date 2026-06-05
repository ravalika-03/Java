public class StringEX1 {
    public static void main(String args[]) {
        String name="ravalika";//string literal
        // String branch = new String("CSE");//string object

        System.out.println(name.length());

        int len = name.length();
        for(int i=len-1;i>=0;i--){
            System.out.print(name.charAt(i)+" ");
        }
    }
    
}
