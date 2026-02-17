
class MQueue{
    int front,rear;
    int capacity,size;
    int[] arr ;
    public MQueue(int capacity){
        this.capacity=capacity;
        arr = new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    public void enqueue(int data){
        if(size==0){
            System.out.println("Queue is empty");
        }
        ++rear;
        arr[rear]=data;
        size++;
    }
    public void dequeue(){
        if(size==0){
          System.out.println("Queue is empty");  
        }
        front++;
        size--;
        System.out.println("Element is dequeued");
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}


public class Queue {
    public static void main(String[] args) {
        MQueue obj = new MQueue(10);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.display();
        obj.dequeue();
        obj.display();
    }
}
