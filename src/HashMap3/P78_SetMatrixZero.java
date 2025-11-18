package HashMap3;

public class P78_SetMatrixZero {
    
    public static void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=-1;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    int l=0;
                    int u=0;
                    while(l<n){
                        arr[l][j]=0;
                        l++;
                        
                    }
                    while(u<m){
                        arr[i][u]=0;
                        u++;
                    }
                }
                else if(arr[i][j]!=0){
                    arr[i][j]=matrix[i][j];
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        


        
    }
    public static void main(String[] args) {
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);

        
    }
}


