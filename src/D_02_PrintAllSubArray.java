import java.util.Scanner;

public class D_02_PrintAllSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                printsub(arr,i,j);
            }
        }
    }
    public static void printsub(int[] a,int i,int j){
        while(i<=j){
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.println();

    }

}
