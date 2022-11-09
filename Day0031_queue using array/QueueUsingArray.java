// Java program to implement queue using array
import java.util.*;
class QueueUsingArray{
    static int[] ar=new int[10];
    static int n = 10;
    static int front = - 1;
    static int rear = - 1;
      static  void enqueue(int item) {
        if (rear == n - 1){
            System.out.println("Overflow!");
            return;
        }
        else {
            if (front == - 1 && rear==-1){
                front = 0;
                rear=0;
            }
            else{
                rear++;
            }
            ar[rear] = item;
            System.out.println("Element inserted");
        }
    }
    //function to implement dequeue operation
    static void dequeue() {
        //checking underflow condition
        if (front == - 1 || front > rear) {
            System.out.println("Underflow!");
            return ;
        }
        else {
            int item=ar[front];
            //displaying deleted element
            System.out.println("Element deleted from queue is : "+ item);
            // if front and rear reach at end then initialize it at -1
            if(front == rear)  {  
                front = -1;  
                rear = -1 ;  
            }
            else{
                //incrementing the front
                front++;
            }
        }
    }
    //function to display all elements of queue
    static void display() {
        //checking whether queue is empty or not
        if (front == - 1){
            //if queue is empty simply return
            System.out.println("Queue is empty");
            return;
        }
        else {
            // if queue is not empty print all the elements from rear to front
            System.out.println("Elements are : ");
        for (int i = front; i <= rear; i++)
            System.out.print(ar[i]+" ");
        System.out.println();
        }
    }
    //function to display front element of queue
    static void fronte() {
        //checking whether queue is empty or not
        if (front == - 1){
            //if queue is empty simply return
        System.out.println("Queue is empty");
            return;
        }
        else {
            // if queue is not empty print front element
            System.out.println("Front Element is :"+ar[front]);
        }
    }
    //driver code
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        //displaying options of enqueue, dequeue, front, display to the user
        System.out.println("1: Inserting element to queue(enqueue)");
        System.out.println("2: Deleting element from queue(dequeue)");
        System.out.println("3: Display front element of queue");
        System.out.println("4: Display all the elements of queue");
        System.out.println("5: Exit");
        int ch;
        do {
            //taking user choice 
            System.out.println("Enter your choice : ");
            ch=sc.nextInt();
            switch (ch) {
                    //calling functions according to the choice of user
                    case 1: {
                        System.out.println("enter element to be inserted:");
                        int item=sc.nextInt();
                        enqueue(item);
                        break;
                    }
                case 2: dequeue();
                    break;
                case 3: display();
                    break;
                case 4: fronte();
                    break;
                case 5: System.out.println("Exit");
                    break;
                default: System.out.println("Invalid choice");
            }
        }
        while(ch!=5);
    }
}