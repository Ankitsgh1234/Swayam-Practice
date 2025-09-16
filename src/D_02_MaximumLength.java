import java.util.Scanner;

public class D_02_MaximumLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        // Bruteforce(arr);
        SlidingWindow(arr);

        
    }
    // Method 1 O(n+k)
    public static void Bruteforce(int[] arr){
        int max=0;
        int n=arr.length;
        for(int i=0;i<=n-4;i++){
           int sum=0;
            for(int j=i;j<i+4;j++){
                sum+=arr[j];
            }
            max=Math.max(max,sum);

        }
        System.out.println("The maximum of the sum is "+max);

    }

    // Method 2 O(n);
     public static void SlidingWindow(int[] arr){
         int n=arr.length;
         int sum=0;
         for(int i=0;i<4;i++){
             sum+=arr[i];
             
            }
            int j=0;
            int max=sum;
        for(int i=4;i<n;i++){
            // max=Math.max(max,sum);
            sum-=arr[j++];
            sum+=arr[i];
            max=Math.max(max,sum);

        }



        System.out.println("The maximum of the sum is "+max);

    }


}
