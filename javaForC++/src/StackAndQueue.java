import java.util.ArrayDeque;
import java.util.Stack;

public class StackAndQueue {
    public static void main(String[] args){
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);

        st.push(4);
        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st);

        System.out.println("-----Queue---------");
        ArrayDeque<Integer> ad= new ArrayDeque<>();
        ad.addLast(10);
        ad.addLast(20);
        ad.addLast(30);
        System.out.println(ad);
        ad.removeFirst();
        System.out.println(ad);
        System.out.println(ad.getFirst());

        // passing to function acts as pass by reference.
        // in actual pass by value is happening. i.e. address is directly passed to fun
        // Thus, able changes made in fun reflects in actual stack/arraydeque
    }
}
