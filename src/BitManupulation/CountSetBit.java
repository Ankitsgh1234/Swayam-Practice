package BitManupulation;

public class CountSetBit {

    public static int countSetBits(int n) {
        // code here
        int count=0;
        
        for(int i=1;i<=n;i++)
        {
            int j=i;
            while(j!=0){
                j&=(j-1);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(5));
    }
}
