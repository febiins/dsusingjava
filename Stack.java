class MStack{
    int top;
    int capacity;
    int []arr;
    public MStack(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        top=-1;
    }

    public void push(int data){
        if(top==-1){
            System.out.println("Stack is empty..");
        }
        
            ++top;
            arr[top]=data;
        
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(arr[top]);
            top--;
        }
    }
    public void peek(){
        if(top==-1){
            System.out.println("Stack is empty..");
        }
        else{
            System.out.println(arr[top]);
        }
    }
}




public class Stack {
    public static void main(String[] args){
        MStack obj = new MStack(10);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.peek();
        obj.pop();
        obj.peek();
    }
    
}
