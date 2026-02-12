class NodeH{
    int data;
    NodeH next;
    public NodeH(int data){
        this.data=data;
        this.next=null;
    }
}


class LFront{
    NodeH head;
    public void iHead(int data){
        NodeH node = new NodeH(data);
        if(head==null){
            head=node;
            return;
        }
        NodeH temp;
        temp = head;
        head = node;
        node.next = temp;
    }
    public void display(){
        NodeH temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
}
}

public class LInsertionFront {
    public static void main(String [] args){
        LFront obj = new LFront();
        obj.iHead(1);
        obj.iHead(2);
        obj.iHead(3);
        obj.display();
    }
    
}
