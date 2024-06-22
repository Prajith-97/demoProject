import java.util.Arrays;

public class array {
    public static void main(String[] args){
       twoDimensional();

        int[] a = new int[5];   //first approach
        int[] b = {10, 2, 34, 34, 23};  //second approach
        int len=b.length;
        //retrieve data
        for(int i=0;i<len;i++){
            System.out.println(b[i]);
        }
       /* for(int i:b){
            System.out.println(i);
        }*/
    }

    public static void twoDimensional(){
        int[][] a = new int[3][2];
        a[0][0]=10;
        a[0][1]=20;

        a[1][0]=30;
        a[1][1]=40;

        a[2][0]=50;
        a[2][1]=60;

        int[][] b = {{200, 100},{400, 300}};

        //length
        int rowLen = a.length;
        int colLen = a[0].length;

        //read data
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                System.out.println(a[i][j]);
            }
        }

    }
}
