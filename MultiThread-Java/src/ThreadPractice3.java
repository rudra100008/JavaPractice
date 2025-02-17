// The join() method in Java is provided by the java.lang.Thread class.
// It allows one thread to wait until another thread has completed its execution.
// Suppose 'th' is a thread object that is currently running.
// Calling th.join() ensures that the current thread waits until 'th' finishes execution before proceeding.

public class ThreadPractice3 extends  Thread {
    @Override
    public void run() {
        for (int i=0;i<3;i++){
            try{
                Thread.sleep(300);
                System.out.println("The thread name: "+Thread.currentThread().getName());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadPractice3 th1 = new ThreadPractice3();
        ThreadPractice3 th2 = new ThreadPractice3();
        ThreadPractice3 th3 = new ThreadPractice3();
        th1.start();
        try{
            System.out.println("The thread name1: "+Thread.currentThread().getName().toUpperCase());
            th1.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        th2.start();
        try{
            System.out.println("\nThe thread name1: "+Thread.currentThread().getName().toUpperCase());
            th2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        th3.start();
        try{
            System.out.println("\nThe thread name1: "+Thread.currentThread().getName().toUpperCase());
            th3.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

