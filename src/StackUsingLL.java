import java.util.*;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        next=null;
    }
}

public class StackUsingLL {

    Node head;
    int size;

    StackUsingLL()
    {
        head=null;
        size=0;
    }

    boolean isEmpty()
    {
        return head==null;
    }
    void push(int x)
    {
        Node newNode=new Node(x);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            head=newNode;
            newNode.next=temp;
        }
        size++;
    }
    int pop()
    {
        int popped=Integer.MIN_VALUE;
        if (isEmpty())
        {
            return -1;
        }
        else
        {
            popped=head.data;
            head=head.next;
        }
        size--;
        return popped;
    }
    void print()
    {
        Node curr=head;
        while (curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    int getSize()
    {
        return size;
    }

    public static void main(String[] args)
    {
         StackUsingLL s1=new StackUsingLL();
         s1.push(12);
         s1.push(23);
         s1.push(34);
         s1.push(45);
         s1.print();

         System.out.println("The size of the stack is: "+s1.getSize());
    }
}
