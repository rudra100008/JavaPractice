// Does a thread can run two or more than two times
// After starting a thread once it can't be started twice as it will throw
// "IllegalThreadException".In such case first thread will run but second time
// it will throw exception

public class ThreadPractice1 extends Thread{
    @Override
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        ThreadPractice1 t1 = new ThreadPractice1();
        t1.start();
        t1.start();
    }
}
