
// Naming thread
// using setName() and getName()
//using ThreadName Class

class ThreadName extends Thread{
    ThreadName(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("The thread is exceuting");
    }
}
public class ThreadPractice4 extends Thread{
    public void run(){
        System.out.println("running......");
    }
    public static void main(String[] args) {
        ThreadPractice4 th1 = new ThreadPractice4();
        ThreadPractice4 th2 = new ThreadPractice4();
        System.out.println("Th1: "+th1.getName());
        System.out.println("Th2: "+th2.getName());

        th1.start();
        th2.start();

        th1.setName("Ashum Bhuju");
        System.out.println("After changing th1 name: "+th1.getName());

        ThreadName threadName = new ThreadName("Ashum");
        System.out.println("ThreadName: "+threadName.getName());
        threadName.start();
    }
}
