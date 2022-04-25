public class QueueUsingArrays {
    int arr[];
    int front;
    int rear;
    int cap;
    int count;

    QueueUsingArrays(int cap)
    {
        this.cap=cap;
        arr=new int[cap];
        front=0;
        rear=0;
        count=0;
    }
    void push(int x)
    {
        if (count==cap) return;
        arr[rear%cap]=x;
        rear++;
        count++;
    }
    int pop()
    {
        if (count==0) return -1;
        int x=arr[front%cap];
        front++;
        count--;
        return x;
    }
    void print()
    {
        for(int i=front;i<rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
       QueueUsingArrays q1=new QueueUsingArrays(10);
       q1.push(12);
       q1.push(23);
       q1.push(34);
       q1.push(45);
       q1.push(56);
       q1.push(67);
       q1.print();
       q1.pop();
       q1.pop();
       q1.print();
    }
}
