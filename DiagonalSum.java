public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat= {{10,20,30},{40,50,60},{70,80,90}};
        int rsum = 0,lsum=0;
        for(int i=0;i<mat.length;i++)
        {
            
            for(int j=0;j<mat.length;j++)
            {
                if(i==j)
                {
                    rsum+=mat[i][j];
                    lsum+=mat[i][j];
                }
            }
            // for(int j=0;j<mat.length;j++)
            // {
            //     if(i==j)
            //     {
            //         lsum+=mat[i][j];
            //     }
            // }
        }
        System.out.println(lsum+rsum);
    }
}