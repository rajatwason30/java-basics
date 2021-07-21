import org.w3c.dom.ls.LSOutput;

class Printer{
    synchronized void print(int n, String name){
        for(int i=1;i<=n;i++){
            System.out.println("Printing doc# "+ i +" for "+ name);
        }
    }
}

class MyTask1 extends Thread{
    Printer pRef;
    public MyTask1(Printer o){
        pRef=o;
    }
    @Override
    public void run() {
        //other way to achieve synchronization is to write this way
        //synchronized (pRef) {
            pRef.print(6, "Akshat");
        //}
    }
}
class YourTask extends Thread {
    Printer pRef;
    public YourTask(Printer o){
        pRef=o;
    }
    @Override
    public void run() {
        pRef.print(10,"Rajat");
    }
}
public class SyncApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----Started--------");

        Printer pRef= new Printer();

        //we want to achieve synchronization.
        //there are 2 threads simulataneously working on same instance of Printer obj.
        MyTask1 myTask1= new MyTask1(pRef);
        myTask1.start();

        //1. using join()
        //by writing this, we achieved synchronization. now 1 thread will work on printer ref at a time
        //myTask1.join();

        //2. by marking the method as synchronized
        // in case there are multiple threads, and instead of writing .join() on each thread, we write
        // synchronized keyword with the method in Printer class

        YourTask yourTask = new YourTask(pRef);
        yourTask.start();

        System.out.println("--------Finished-----");
    }



}
