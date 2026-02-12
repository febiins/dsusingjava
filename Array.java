/*In this program we are going to see the basic operaions in an array such as:
Traversal

Insertion at position

Deletion at position

Display
*/

class ArrayOperations{
    int size,capacity;
    int []arr;
    public ArrayOperations(int capacity){
        this.capacity=capacity;
        size=0;
        arr=new int[capacity];
    }
   
    
    public void insert(int value){
        if(size==capacity){
            System.out.println("Array is full");
            return;
        }else{
            arr[size]=value;
            size++;
        }
    }
    public void insertSpecificPosition(int pos,int value){
        if(size==capacity){
            System.out.println("Array is full");
            return;
        }else{
            if(pos<0||pos>size){
                System.out.println("invalid position");
            }else{
                for(int i=size;i>pos;i--){
                    arr[i]=arr[i-1];
                }
                arr[pos]=value;
                size++;
            }
        }
    }

    public void deleteSpecificPosition(int pos){
        if(pos<0||pos>=size){
            System.out.println("invalid size");
        }
        else{
            for(int i=pos;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            size--;
        }
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}



public class Array {
    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations(10);
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);

        obj.display();

        obj.insertSpecificPosition(2, 6);
        obj.display();

        obj.deleteSpecificPosition(3);
        obj.display();

    } 
}
