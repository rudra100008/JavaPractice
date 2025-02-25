class ABC extends Thread{
    Thread threadToInterrupt;
    @Override
    public void run() {
        threadToInterrupt.interrupt();
    }
}
public  class ThreadJoinPractice1 {
    public static void main(String[] args) {
        try {
            ABC th = new ABC();
            th.threadToInterrupt = Thread.currentThread();
            th.start();
            th.join();
        }catch (InterruptedException e){
            System.out.println("The exception has being caught:\n"+ e.getMessage());
        }
    }
}
