package Queue;

public class P45_CircularQueue {

    public static class CQueue{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[10];
        int n=arr.length;

        public void add(int val) {
            if(size==arr.length){
                System.out.println("Queue is full");
                // throw new Exception("Queue is full");
                return;
            }
            else if(size==0){
                arr[0]=val;
                f=1;
                r=1;
            }
            else if(r<n-1){
                arr[r+1]=val;
                r++;
            }
            else if(size!=n&& r==n-1){
                arr[0]=val;
                r=0;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            if(r==0&&size>=2){
                r=n-1;
                size--;
                return arr[0];


            }
            else{
                r=r-1;
                size--;
                return arr[r+1];
            }

        }

        public int peek(){
            return arr[r];
        }
        public void Display(){
            if(size==0){
                System.out.println("Queue is Empty");
            }
            else{
                if(r<n){
                    for(int i=f;i<=r;i++){
                        System.out.print(arr[i]+" ");
                    }
                }
                else{
                    for(int i=f;i<n;i++){
                        System.out.print(arr[i]+" ");
                    }
                    for(int i=0;i==f;i++){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        CQueue q=new CQueue();
        q.add(52);
        q.add(54);
        q.add(42);
        q.add(2);
        q.Display();
        
    }

}
