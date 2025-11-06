package Stack;

import java.util.Stack;

public class P43_StockSpan {

    public static int[] StockArray(int[] arr){
        int n=arr.length;
         int[] span=new int[n];
         Stack<Integer> st=new Stack<>();
         span[0]=1;
         st.push(0);

         for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[i]>=arr[st.peek()]){
                st.pop();
            }

            span[i]=(st.isEmpty())?(i+1):(i-st.peek());

            st.push(i);


         }
         return span;
    }
   





    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int [] span=StockArray(price);

        for(int i=0;i<span.length;i++){
            System.out.print( span[i]+" ");
        }
        
    }

}
