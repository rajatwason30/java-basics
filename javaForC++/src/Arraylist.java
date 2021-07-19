import java.util.ArrayList;
public class Arraylist{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("list=> "+ list);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("list=> "+ list);
        list.add(1,100);
        System.out.println("list=> "+ list);

        //use get and set. list[i] doesnt work
        System.out.println(list.get(2));

        list.remove(1);
        System.out.println("list=> "+ list);

        ArrayList<String> al= new ArrayList<>();
        al.add("Rajat");
        al.add("Wason");
        for(String s:al)
            System.out.println(s);
    }
}
