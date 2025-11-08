package SwayamPracticeKamalSir;

public class houserobber {
    public static int rob(int[] arr,int i){

        if(i>=arr.length){
            return 0;
        }
        int x=arr[i]+rob(arr,i+2);
        int y=rob(arr,i+1);
        return Math.max(x,y);
        

    }

    public static void main(String[] args) {
        int[] arr={5,2,8,7,1,1 ,6};
        System.out.println(rob(arr,0));

    }
    
}
