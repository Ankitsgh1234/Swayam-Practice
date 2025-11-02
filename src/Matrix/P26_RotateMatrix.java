package Matrix;

public class P26_RotateMatrix {
    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] nm=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nm[j][n-i-1]=matrix[i][j];
                 
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=nm[i][j];
                 
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
                 
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
         int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }

}
