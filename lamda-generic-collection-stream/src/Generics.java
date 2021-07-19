import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Generics {
    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }
    public static <T, G> List<G> fromArrayToList1(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }
    public static void main(String[] args)
    {
        String [] a={"Rajat","Wason","Rahul","Akshat"};
        List<String> al=fromArrayToList(a);
        for(String s:al)
            System.out.println(s);
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<String> stringList
                = Generics.fromArrayToList1(intArray, Object::toString);
        for(String s:stringList)
            System.out.println(s);
    }
}
