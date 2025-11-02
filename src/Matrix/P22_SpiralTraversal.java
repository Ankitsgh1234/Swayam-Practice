package Matrix;

import java.util.ArrayList;
import java.util.List;

public class P22_SpiralTraversal {
    public static void Traverse(int[][] matrix){
         int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> arr = new ArrayList<>();
        int k = 0;
        int right = m- 1;
        int left = 0;
        int top = 0;
        int bot = n - 1;
        while(top<=bot&&left<=right){
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top<=bot){
                 for(int i=right;i>=left;i--){
                arr.add(matrix[bot][i]);
            }
            bot--;
            }
            if(left<=right){
                 for(int i=bot;i>=top;i--){
                arr.add(matrix[i][left]);
            }
            left++;
            }
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Traverse(matrix);
    }

}
