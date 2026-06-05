public class RodDisk {
    public static void towerOfHanoi(int n, char source, char aux, char destination){
        if(n==0){
            return;
        }
        else {
            towerOfHanoi(n-1, source, aux, destination);
            System.out.println("Move disk "+n+" from "+source+" to "+destination);
            towerOfHanoi(n-1, aux, destination, source);

        }
    }
    public static void main(String args[]) {
        // int n=3;
        towerOfHanoi(3,'A','B','C');
    }
}
