package Extra;
public class D_05_Reverce_the_LinkedList {
    public static class Node {
        int data;
        Node next;

    }

    public static Node create(int val) {

        Node temp = new Node();
        temp.data = val;
        temp.next = null;

        return temp;

    }
    public static Node AddFirst(Node h, int val){
        Node t=new Node();
        t.data=val;
        t.next=h;
        System.out.println(val+" Is insrteed in linked List ");

        return t;
    }
    public static Node rev(Node h ){
        Node t=h;
        Node r=null;
        while(t!=null){
            Node temp=new Node();
            temp.data=t.data;
            temp.next=r;
            r=temp;
            t=t.next;
        }


        return r;
    }
    public static void print(Node h){
        Node t=h;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Node h=create(34);
    //    h= create(34);
       h= AddFirst(h,12);
        print(h);

       Node r= rev(h);
        print(r);



    }

}
