// What if we call Java run() method directly instead  start() method ?
// run() method -> new stack is not created and run method goes to main stack
//start() method -> new stack is created and thread run in this new stack

public class ThreadPractice2 extends Thread{
//    @Override
//    public void run() {
//        System.out.println("Running.........");
//    }
//
//    public static void main(String[] args) {
//        ThreadPractice2 t1 = new ThreadPractice2();
//        t1.run();//this method is not recommended as this is not treated as thread object
//        //t1.start() //this method is recommended,this is treated as thread object
//    }


    // In here i used run() method and it going to be thread as normal object not a thread object
    @Override
    public void run() {
        for (int i =0;i<5;i++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadPractice2 t1 =  new ThreadPractice2();
        ThreadPractice2 t2 =  new ThreadPractice2();
      t1.run();
        t2.run();
//        t1.start();
//        t2.start();
    }
}
// this is output for start() method:
//0
//0
//1
//1
//2
//2
//3
//3
//4
//4

// This is output for run() method
//0
//1
//2
//3
//4
//0
//1
//2
//3
//4
