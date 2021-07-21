package singleton;

public class Singleton {
    private static Singleton singleton=null;
    // make constructor private
    private Singleton(){}

    // make static function getInstance to get instance
    public static Singleton getInstance() {
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void print(){
        System.out.println("Inside singleton class");
    }
}
