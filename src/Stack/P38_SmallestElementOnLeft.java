package Stack;
import java.util.Stack;

public class P38_SmallestElementOnLeft {

    public static void nextGreater(int[] arr,int n){
        int i=0;
        int[] nrr=new int[n];
        Stack<Integer> st=new Stack<>();


        while(i<n){
            int digit=arr[i];
            if(i==0){
                nrr[i]=-1;

            }
            while(!st.isEmpty()&&digit<=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                nrr[i]=-1;
            }
            else{
                nrr[i]=st.peek();
            }
            st.push(digit);
            i++;
        }
        for(int j=0;j<n;j++){
            System.out.print(nrr[j]+" ");
        }
    }



   public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 1, 9, 8, 6};
        int n = arr.length;
       nextGreater(arr, n);

    }

}
