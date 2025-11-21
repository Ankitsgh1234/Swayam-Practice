package BitManupulation;

public class KthBitisSet {

    public static boolean checkKthBit(int n, int k) {
        // code here
        n=n>>k;
        return (n&1)==1;
       
    }
    public static void main(String[] args) {
        System.out.println(checkKthBit(56314, 4));
    }
}

