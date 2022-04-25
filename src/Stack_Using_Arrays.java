
public class Stack_Using_Arrays {
    int top;
    int cap;
    int arr[];

    Stack_Using_Arrays(int cap)
    {
        top=-1;
        this.cap=cap;
        arr=new int[cap];
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    boolean isFull()
    {
        return top==cap;
    }
    void push(int x)
    {
        if (isFull())
        {
            return;
        }
        top++;
        arr[top]=x;
    }
    int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int x=arr[top];
        top--;

        return x;
    }
    int getSize()
    {
        if (isEmpty())
        {
            return 0;
        }
        return top+1;
    }
    void print()
    {
        for (int i = 0; i <=top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
       Stack_Using_Arrays s1=new Stack_Using_Arrays(10);
       s1.push(12);
       s1.push(23);
       s1.push(34);
       s1.push(45);
       System.out.println("The Topmost Element is: "+s1.pop());
       s1.print();
       System.out.println("The size of the array is: "+s1.getSize());
    }
}
