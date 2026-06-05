public class GetAsciiValue {
    public static void main(String args[]) {
        // char ch='g';
        // System.out.println((int)ch);

        String s ="a1s2c5d8";
        
        int sum=0;
        // System.out.println((int)c);

         for (int i =0;i<s.length();i++){
            char c = s.charAt(i);
                if (c>='0' && c<='9'){
                   sum+=(int)c-48;
                }
        
            }
        System.out.println(sum);
    }
}
