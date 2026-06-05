public class PasswordValidation {
    public static void main(String[] args) {
        String s="Bits@8924";
        char[] c = s.toCharArray();
        int ucount=0;
        int lcount=0;
        int dcount=0;
        int scount=0;
        int len=s.length();

        if(len>=8){
            for (char ch:c){
                 if (ch>='A' && ch<='Z'){
                    ucount++;
                }
                else if (ch>='a' && ch<='z'){
                    lcount++;
                }
                else if (ch>='0' && ch<='9'){
                    dcount++;
                }
                 else{
                   scount++;
                }
        
            }
        }
        else{
            System.out.println("Lenght is less than 8");
        }
        if(len>=8 && ucount>=0 && lcount>=0 && dcount>=0 && scount>=0 ){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}
