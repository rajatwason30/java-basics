import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueWithComparator {
    static class Student implements Comparable<Student>{
        private int age;
        private int weight;
        private String name;

        public Student(int age, int weight, String name) {
            this.age = age;
            this.weight=weight;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", weight=" + weight +
                    ", name='" + name + '\'' +
                    '}';
        }
        @Override
        public int compareTo(Student o) {
            return this.age - o.age;
        }
    }

    static class weightComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.weight- o1.weight;
        }
    }

    public static void main(String[] args){
        int [] ages = {10,4,6,1,7};
        String [] names= {"a","b","c","d","e"};
        int [] weights = {40,34,12,45,89};

        // on the basis of decreasing weight
        ArrayList<Student> al= new ArrayList<>();
        // on the basis of age
        PriorityQueue<Student> pq= new PriorityQueue<>();
        for(int i=0;i<5;i++) {
            Student o= new Student(ages[i], weights[i], names[i]);
            pq.add(o);
            al.add(o);
        }

        System.out.println("----- PQ --------");
        while(pq.size()>0)
        {
            System.out.println(pq.peek());
            pq.remove();
        }
        System.out.println("----- AL --------");
        Collections.sort(al, new weightComparator());
        for( Student s: al)
            System.out.println(s);
    }
}
