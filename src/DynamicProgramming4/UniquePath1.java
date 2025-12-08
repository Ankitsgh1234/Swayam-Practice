package DynamicProgramming4;

public class UniquePath1 {

     public static void main(String[] args) {
        int rows=2;
        int cols=3;
        int count=maze(1,1,rows,cols);
        System.out.println(count);
        
    }

    public static int maze(int sc, int sr , int er, int ec) {
        if(sc>ec||sr>er){
            return 0;
        }
        if(sc==ec&&sr==er){
            return 1;
        }
        int totalways=maze(sc,sr+1,er,ec)+maze(sc+1,sr,er,ec);
        
        return totalways;
    }


}
