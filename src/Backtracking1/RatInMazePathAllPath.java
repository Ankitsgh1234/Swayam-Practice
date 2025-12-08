package Backtracking1;

public class RatInMazePathAllPath {
     public static void main(String[] args) {
        
        int r=2;
        int c=3;
        print(1,1,r,c,"");
        
    }

    public static void print(int sr, int sc, int er, int ec,String s) {
        if(sc>ec||sr>er){
            return;
        }
        if(sc==ec&&sr==er){
            System.out.println(s);
            return;
        }
        print(sr+1, sc, er, ec,s+"R");
        print(sr, sc+1, er, ec,s+"D");
        if(sc+1>ec)
            print(sr, sc-1, er, ec,s+"L");
    if(sr+1>er)
        print(sr-1, sc, er, ec,s+"U");

        
    }

}
