import java.util.*;

public class QueueUsingStacks {
    Queue<Integer> q1;
    Queue<Integer> q2;

    QueueUsingStacks()
    {
        q1=new ArrayDeque<>();
        q2=new ArrayDeque<>();
    }
    void push(int x)
    {
        q2.add(x);
        while (!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }

        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
    }
    int pop()
    {
        if (q1.isEmpty()) return -1;
        return q1.poll();
    }
    int top()
    {
        if (q1.isEmpty()) return -1;
        return q1.poll();
    }
    void print()
    {
        for(int x:q1)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {

    }
}
