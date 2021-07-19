import java.util.ArrayList;
import java.util.Scanner;

public class StringAndStringBuilder {
    public static void main(String[] args){
        /*
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
//        for(int i=0;i<s.length();i++)
//        {
//            System.out.println(s.charAt(i));
//        }
        // String are immutable
        // can not set char at an index

        // substring : [i,j)
        System.out.println(s.substring(1,3));

        System.out.println(s.substring(1));

        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
                System.out.println(s.substring(i,j));
        }

        String s1="hello";
        String s2="world";
        String s3= s1+s2;
        s3+=' ';
        s3+='c';
        s3+=101;
        System.out.println(s3);

        // left to right evvaluate => op= hello1020
        System.out.println("rajat"+10+20);
        System.out.println(10+20+"rajat");


        // split function which returns array of string
        String ss="rajat is a good boi";
        String[] splittedS= ss.split(" ");
        for(String t:splittedS)
            System.out.println(t);
        */

        // interning : intern pool
        String s1="hello";
        String s2="hello";
        // s1 is created in intern pool. s2 having same content is not created again. s1, s2 shares same location
        String s3= new String("hello");

        StringBuilder sb= new StringBuilder("hello");
        System.out.println(sb.charAt(0));
        sb.setCharAt(1,'d');
        System.out.println(sb);

    }
}
