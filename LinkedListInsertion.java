
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Insert{
    Node head;
    public void insert(int data){
        
        Node node = new Node(data);
        if(head == null){
            head=node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}



public class LinkedListInsertion {
    public static void main(String[] args) {
        Insert list = new Insert();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();

    }
    
}
