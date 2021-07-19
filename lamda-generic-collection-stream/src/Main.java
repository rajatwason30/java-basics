import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
interface Addable{
    int add(int a, int b);
}

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Addable o=(a,b) -> {
            return (a+b);
        };
        System.out.println(o.add(4,5));
        Addable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
                (n)->System.out.println(n)
        );

        //Thread Example without lambda
        Runnable r1=new Runnable(){
            public void run(){
                for(int i=0;i<=1e9;i++){}
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
        //Thread Example with lambda
        Runnable r2=()->{
            System.out.println("Thread2 is running...");
        };
        Thread t2=new Thread(r2);
        t2.start();

        List<Product> list1=new ArrayList<Product>();
        //Adding Products
        list1.add(new Product(1,"HP Laptop",25000f));
        list1.add(new Product(3,"Keyboard",300f));
        list1.add(new Product(2,"Dell Mouse",150f));
        /*
        Runnable r3=()->{
            System.out.println("Sorting on the basis of name...");
            // implementing lambda expression
            Collections.sort(list1,(p1, p2)->(p1.name.compareTo(p2.name)));
            for(Product p:list1){
                System.out.println(p.id+" "+p.name+" "+p.price);
            }
        };
        Thread t3=new Thread(r3);
        t3.start();*/

        System.out.println("Sorting on the basis of name...");
        // implementing lambda expression
        Collections.sort(list1,(p1, p2)->(p1.name.compareTo(p2.name)));
        for(Product p:list1){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

        /* // using multithreading
        List<Product> list2= new ArrayList<>(list1);
        Runnable r4= () -> {
            System.out.println("--filter---");
            Stream<Product> filtered_data = list2.stream().filter(p -> p.price > 20000);
            // using lambda to iterate through collection
            filtered_data.forEach(
                    product -> System.out.println(product.name+": "+product.price)
            );
        };
        Thread t4 = new Thread(r4);
        t4.start();
        */

        List<Product> list2= new ArrayList<>(list1);
        System.out.println("--filter---");
        Stream<Product> filtered_data = list2.stream().filter(p -> p.price > 20000);
        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );

        // event listner using lambda
        JTextField tf=new JTextField();
        tf.setBounds(50, 50,150,20);
        JButton b=new JButton("click");
        b.setBounds(80,100,70,30);

        // lambda expression implementing here.
        b.addActionListener(e-> {tf.setText("hello swing");});

        JFrame f=new JFrame();
        f.add(tf);f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
