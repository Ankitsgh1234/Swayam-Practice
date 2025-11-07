package Queue;

public class P44_ImplementationOfQueue {
    public static class queueA{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];

        public void add(int val){
            if(r==arr.length){
                System.out.println("Queue if full");
                return;
            }
            if(f==-1){ f=r=0;
                arr[0]=val;
            }
            else {
                arr[++r]=val;

            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            size--;
            f++;
            return arr[f-1];

        }
        public void Display(){
            int i=f;
            while(i<=r){
                System.out.print(arr[i]+" ");
                i++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueA a=new queueA();
        a.add(90);
        a.Display();
        a.add(98);
        a.Display();
        a.remove();
        a.Display();

    }

}
