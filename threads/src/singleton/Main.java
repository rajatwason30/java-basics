package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton o1 = Singleton.getInstance();
        Singleton o2 = Singleton.getInstance();
        Singleton o3 = Singleton.getInstance();
        // o1, o2, o3 shares same instance. only 1 instance is created.
        o1.print();

        System.out.println("Address of o1, o2, o3 belonging to Singleton class");
        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));
        System.out.println(System.identityHashCode(o3));

        NonSingletonClass o4 = new NonSingletonClass();
        NonSingletonClass o5 = new NonSingletonClass();
        NonSingletonClass o6 = new NonSingletonClass();
        System.out.println("Address of o4, o5, o6 belonging to NonSingletonClass");
        System.out.println(System.identityHashCode(o4));
        System.out.println(System.identityHashCode(o5));
        System.out.println(System.identityHashCode(o6));
    }
}
