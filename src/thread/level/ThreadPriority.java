package thread.level;

public class ThreadPriority {
    public static void main(String[] args)
    {
        X x = new X();
        Y y = new Y();
        Z z = new Z();

        Thread t1 = new Thread(x);
        Thread t2 = new Thread(y);
        Thread t3 = new Thread(z);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(t2.getPriority() + 4);
        t3.setPriority(Thread.MIN_PRIORITY);
        System.out.println("X priority: "+ t1.getPriority()+
                " Y priority:"+t2.getPriority()+
                " Z priority:"+t3.getPriority());

        t1.start();
        t2.start();
        t3.start();

    }
}
