class MyTask extends Thread {
    //child thread creating another thread
    @Override
    public void run() {
        //another way of invoking thread of a class which implements Runnable
        Thread thread = new Thread(new MyTask2());
        thread.start();
        for(int i=1;i<=10;i++)
            System.out.println("@@Printing document #" + i +" using printer-2");
    }
}
class CA{}

class MyTask2 extends CA implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
            System.out.println("%%Printing document #" + i +" using printer-3");
    }
}
public class App {
    // main method represents main thread
    public static void main(String[] args) {
        // content in main is executed by main thread
        // threads always executes jobs in a sequence
        System.out.println("Starting Application");

        //1. extends Thread
        MyTask myTask = new MyTask();
        myTask.start();


        //2. implements Runnable
        Runnable r= new MyTask2();
        Thread thread = new Thread(r);
        thread.start();

        for(int i=1;i<=10;i++)
            System.out.println("^^Printing document #" + i +" using printer-1");

        System.out.println("Application ended");
    }
}
