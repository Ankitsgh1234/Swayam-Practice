package Matrix;

public class P25_RowWithMax1 {

     public static void rowAndMaximumOnes(int[][] mat) {
        int [] arr=new int[2];
        int ind=0;
        int max=0;
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0; j<mat[0].length;j++){

            if(mat[i][j]==1){
                sum++;
            }
        }
        if(sum>max){
            max=sum;
            ind=i;
            }
        }
        arr[0]=ind;
        arr[1]=max;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
    public static void main(String[] args) {
        int[][]  matrix = {{1,0,0},{0,0,0},{1,1,1}};
        rowAndMaximumOnes(matrix);
    }

}
