package BitManupulation2;

public class CountingBits {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        int c=0;
        for(int i=0;i<=n;i++){
            int j=i;
            while(j!=0){
                if((j&1)==1){
                    c++;
                }
                j=j>>1;
            }
            arr[i]=c;
            c=0;
        }
        return arr;
        
    }
}
