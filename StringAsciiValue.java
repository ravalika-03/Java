public class StringAsciiValue {
    public static void main(String args[]) {

        String s="ravalika";
        char[] c = s.toCharArray();
        for(char ch:c){
            System.out.println(ch+"->"+(ch-96));
        }

    }
}
