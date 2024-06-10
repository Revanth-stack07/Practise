class Something implements Runnable{

// private Thread t;
private String threadname;
// parameteriozed constructor
public Something(String threadname){
    this.threadname = threadname;
}
    
    public void run(){
        int i=0;
        while (i<5) {
            System.out.println(threadname);
            i++;
        }
    }

    // public void start(){
    //     if(t == null){
    //         t = new Thread (this, threadname);
    //         t.start();
    //     }
    // }
}

public class Thing {
    public static void main(String[] args) {
       
        Something A = new Something("A");
        Something B = new Something("B");
        Thread t = new Thread(A);
        Thread t1 = new Thread(B);
        // B.start();
        t.start();
        try {
            t.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
    }
    
}
