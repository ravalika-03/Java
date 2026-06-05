public class StringMethod {
    public static int star(String s){
        char[] ch=s.toCharArray();
       int count=0;
        for(int ele:ch){
            if(ele=='*'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="b*tsc*ll*ge";
        System.out.println("Number of stars are:"+star(s));
    }
}
