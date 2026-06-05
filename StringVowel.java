public class StringVowel {
    public static void main(String args[]) {
        String s="bitscollege";

        int len = s.length();
        for(int i=0;i<len;i++){

            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ){
                System.out.print(s.charAt(i)+" ");
            }
            
        }
    }
    
}
