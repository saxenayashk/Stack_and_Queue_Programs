public class TwoStacksInArray {

    int top1;
    int top2;
    int arr[];
    int cap;

    TwoStacksInArray(int cap)
    {
        this.cap=cap;
        top1=-1;
        top2=cap;
        arr=new int[cap];
    }
    void push1(int x)
    {
        if (top1<top2)
        {
            top1++;
            arr[top1]=x;
        }
        else
        {
            System.exit(0);
        }
    }
    void push2(int x)
    {
        if(top2>top1)
        {
            top2--;
            arr[top2]=x;
        }
        else
        {
            System.exit(0);
        }
    }
    int pop1()
    {
        if(top1>=0)
        {
            int x=arr[top1];
            top1--;
            return x;
        }
        else
        {
            System.exit(0);
        }
        return -1;
    }
    int pop2()
    {
        if (top2<cap)
        {
            int x=arr[top2];
            top2++;
            return x;
        }
        else
        {
            System.exit(0);
        }
        return -1;
    }
    void print()
    {
        for (int i = 0; i <cap; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
         TwoStacksInArray s1=new TwoStacksInArray(10);
         s1.push1(12);
         s1.push1(23);
         s1.push1(34);
         s1.push1(45);

         s1.push2(99);
         s1.push2(98);
         s1.push2(97);
         s1.push2(96);

         s1.print();
    }
}
