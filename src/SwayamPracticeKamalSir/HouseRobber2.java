package SwayamPracticeKamalSir;

public class HouseRobber2 {
     public static int rob(int[] arr,int i,int n){

        if(i>=n){
            return 0;
        }
        int x=arr[i]+rob(arr,i+2,n);
        int y=rob(arr,i+1,n);
        return Math.max(x,y);
        

    }

    public static void main(String[] args) {
        int[] arr={5,2,8,7,1,1 ,6};
        int n=arr.length;
        int x=rob(arr,1,n);
        int y=rob(arr,0,n-1);
        System.out.println(Math.max(x,y));

    }
    
}
