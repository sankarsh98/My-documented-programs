package DS_ALGO_IN_JAVA;
import java.util.Scanner;

class Node{
    Node next;
    int data;
    Node(int data){
        this.next=null;
        this.data=data;
    }
}

class LinkedList {
    Node head;

    public void append(int item){
        if(head==null){
            head=new Node(item);
            return;
        }
        Node newNode=new Node(item);
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    public void deleteWithValue(int item){
        if(head==null){
            return;
        }
        if(head.data==item){
            head=null;
            return;
        }
        Node current=head;
        while(current.next.data!=item){
            current=current.next;
        }
        current.next=current.next.next;
        return;
    }

    public void addAtIndex(int index,int item){
        
    }
    public void displayList(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data+"->");
            current=current.next;
        }
    }

}

 class LinkedListImplementation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        LinkedList ll=new LinkedList();
        int ch;
        do{
            System.out.println("1.Append 2.Delete with value 3.Display all items 5.exit");
            ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("Enter the element to Add");
                        int item=sc.nextInt();
                        ll.append(item);
                        break;

                case 2: System.out.println("Enter the value of item to delete");
                        item=sc.nextInt();
                        ll.deleteWithValue(item);
                        break;

                case 3:ll.displayList();
                        break;

                default:
                        break;
            }
        }while(ch!=5);
    }
}