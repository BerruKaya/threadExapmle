public class Main {

     public static void main(String [] args){

          kronometreThread kk = new kronometreThread("firstThread");
          kronometreThread myThread = new kronometreThread("secondThread");
          kk.start();
          myThread.start();
     }
}
