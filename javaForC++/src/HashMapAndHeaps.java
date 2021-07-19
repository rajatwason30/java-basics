import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public class HashMapAndHeaps {
    public static void main(String[] args)
    {
        HashMap<String, Integer> hm= new HashMap<>();
        // order is not maintained => unordered_map
        hm.put("rajat",23);
        hm.put("kamya",22);
        hm.put("rahul",25);

        System.out.println(hm);

        System.out.println(hm.get("rajat"));
        System.out.println(hm.get("akshat"));

        System.out.println(hm.containsKey("rajat"));
        System.out.println(hm.containsKey("akshat"));

        Set<String> keys= hm.keySet();
        System.out.println(keys);
        for(String k:keys)
        {
            System.out.println(k+"->"+hm.get(k));
        }

        System.out.println("=============== Heaps ===============");
        // priorityQueue
        // add, remove, peak
        // by default => min pq
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(5);
        System.out.println(pq.peek());
        pq.add(9);
        System.out.println(pq.peek());
        pq.add(2);
        System.out.println(pq.peek());
        pq.add(10);
        System.out.println(pq.peek());
        System.out.println("----------");
        while(pq.size() >0)
        {
            System.out.println(pq.peek());
            pq.remove();
        }

        // max pq
        PriorityQueue<Integer> pq1= new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(5);
        System.out.println(pq1.peek());
        pq1.add(9);
        System.out.println(pq1.peek());
        pq1.add(2);
        System.out.println(pq1.peek());
        pq1.add(10);
        System.out.println(pq1.peek());
        System.out.println("----------");
        while(pq1.size() >0)
        {
            System.out.println(pq1.peek());
            pq1.remove();
        }
    }
}
