public class SumThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Sum Thread of i: "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e)
            {
                e.getStackTrace();
            }
        }
    }
    public static void main(String[] args){
        SumThread sum1 = new SumThread();
        AnotherSumThread sum2 = new AnotherSumThread();
        Thread t1 = new Thread(sum1);
        Thread t2  = new Thread(sum2);
        t1.start();
        t2.start();
    }
}
 class AnotherSumThread implements  Runnable{
     @Override
     public void run() {
         for(int i=0;i<10;i++){
             System.out.println("Another Sum Thread i: "+(i+1));
             try{
                 Thread.sleep(1000);
             }catch (Exception e)
             {
                 e.getStackTrace();
             }
         }
     }
 }
