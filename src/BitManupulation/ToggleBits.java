package BitManupulation;

public class ToggleBits {

    public static int toggleBits(int n, int l, int r) {
        // code here
        // int m=n;
        int m=0;
        int i=1;
        while(i<l){
            m=m<<1;
            i++;
        }
        for(i=l;i<=r;i++){
            m=m|1;
            m=m<<1;
            
        }
        m=m>>1;
        m=m<<(l-1);
        return (n^m);
    }
    public static void main(String[] args) {
        System.out.println(toggleBits(17, 2, 3));
    }
}

