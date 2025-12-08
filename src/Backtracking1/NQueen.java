package Backtracking1;

public class NQueen {
     public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nqueen(board, 0);
    }

    public static void nqueen(char[][] board, int rows) {
        int n = board.length;
        if (rows == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
                
            }
            System.out.println();
            return;
        }

        for(int j=0;j<n;j++){
            if(isSafe(board,rows,j)){
                board[rows][j]='Q';
                nqueen(board, rows+1);
                board[rows][j]='X';

            }

        }
    }
    public static boolean isSafe(char[][] board,int rows,int col){
        int n=board.length;
        //same row
        for(int j=0;j<n;j++){
            if(board[rows][j]=='Q'){
                return false;
            }
            
        }


        // Same Coloum
        for(int j=0;j<n;j++){
            if(board[j][col]=='Q'){
                return false;
            }
        }

        // uper right
        int i=rows;
        int j=col;
        while(i>=0&&j<n){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j++;

        }

        // // neeche right
        //  i=rows;
        //  j=col;
        // while(i<n&&j<n){
        //     if(board[i][j]=='Q'){
        //         return false;
        //     }
        //     i++;
        //     j++;

        // }

        // // neeche left
        //  i=rows;
        //  j=col;
        // while(i<n&&j>=0){
        //     if(board[i][j]=='Q'){
        //         return false;
        //     }
        //     i++;
        //     j--;

        // }
        // uper left
         i=rows;
         j=col;
        while(i>=0&&j>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j--;

        }
        return true; 

    }

}
