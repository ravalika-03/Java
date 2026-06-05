public class PasswordValidation1 {
    public static void main(String args[]) {
        String s="Bits@8924";
        // char[] c = s.toCharArray();
        int ucount=0;
        int lcount=0;
        int dcount=0;
        int scount=0;
        int len=s.length();

        if(len>=8){
            for (int i=0;i<=len;i++){
                 if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
                    ucount++;
                }
                else if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                    lcount++;
                }
                else if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                    dcount++;
                }
                 else{
                   scount++;
                }
        
            }
        }
        else{
            System.out.println("Lenght is less than 10");
        }
        if(len>=8 && ucount>=0 && lcount>=0 && dcount>=0 && scount>=0 ){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}
