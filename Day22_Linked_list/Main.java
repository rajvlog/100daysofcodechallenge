import java.lang.*;

class LinkedList {
    Node head;

    
    class Node{
        int data;
        Node next;

        Node(int x) 
        {
            data = x;
            next = null;
        }
    }
    public Node insertStart(int data)
    {
        
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        System.out.println(newNode.data + " inserted");
        return head;
    }


    public void display()
    {
        System.out.println();
        Node node = head;
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
 class Main
{
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insertStart(5);
        ll.insertStart(4);
        ll.insertStart(3);
        ll.insertStart(2);
        ll.insertStart(1);

        ll.display();

    }
}

