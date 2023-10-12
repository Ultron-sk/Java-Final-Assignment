class Printer implements Runnable{
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("First")){
            for(int i=1;i<=10;i+=2){
                System.out.println("First Thread ::"+i);
            }
        }else{
            for(int i=0;i<=10;i+=2){
                System.out.println("Second Thread ::"+i);
            }
        }
    }

}

public class Question8_Threads {
    public static void main(String[] args) throws Exception{
          Printer p = new Printer();
          Thread t1 = new Thread(p, "First");
          Thread t2 = new Thread(p, "Second");
          t1.start();
          t1.join();
          t2.start();
        
    }
}

