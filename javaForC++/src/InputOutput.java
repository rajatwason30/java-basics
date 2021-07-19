import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args){
        // vid-2
        //        //Input
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        // Output : in next line
        System.out.println("Input = ");
        System.out.println(n);

        // in same line
        System.out.print("Input = ");
        System.out.print(n);

        // input string till space
        String s= scanner.next();
        //input till next line
        String s1=scanner.nextLine();
        System.out.println(s);
        System.out.println(s1);

        // for , while, do-while, break, continue
        // if, else , if else, switch
        // same as in c++


        // vid - 3
        // total 8 data types
        // byte(1 byte), short(2), int(4) , long(8)
        // char(2)
        // float(4), double(8)
        // boolean = true/ false
    }
}
