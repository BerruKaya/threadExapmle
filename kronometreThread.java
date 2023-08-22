public class kronometreThread implements Runnable {

    private Thread t;
    private String threadName;

    public kronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("created: " + threadName);
    }

    @Override
    public void run() {
         System.out.println(threadName + " is running");

             try {
                 for (int i = 0; i <= 10; i++) {
                     System.out.println(threadName + " " + i);
                     Thread.sleep(1000);  //yazdırıp 1 saniye bekle öbür türlü çok hızlı gider ve thread çalıştı mı anlaşılmaz
                 }
             }
                 catch (InterruptedException e) {
                 System.out.println(threadName + " executon is terminated");
             }
             System.out.println(threadName + " operation is done");
    }

    // we kno what will happen when a thread is created(run method) but we have not created a thread
    //lets create a thread inside a method

    public void start(){
        System.out.println("thread object is being created");
        if(t==null){
            t= new Thread(this,threadName);
            t.start();
        }
    }

    }
