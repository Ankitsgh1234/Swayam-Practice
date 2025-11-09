package BinarySearch1;

public class P55_KokoEatingBanana {

    public static int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int l=1;

        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        int ans=0;

        while(l<=max){
            int mid=l+(max-l)/2;
            if(check(piles,mid,h)){
                ans=mid;
                max=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return ans;
        
        
    }

    public static boolean check(int[] arr,int mid,int h){
        int time=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%mid!=0){
                time+=(arr[i]/mid)+1;
            }
            else{
                time+=arr[i]/mid;
            }
            if(time>h){
                return false;
            }
        }

        if(time<=h){
            return true;
        }
        else 
        return false;

    }

     public static void main(String[] args) {
        int[] nums1 = {3,6,7,11};
       

        System.out.println("Max banana: " + minEatingSpeed(nums1,8));
    }
}

