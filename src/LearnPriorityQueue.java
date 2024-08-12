import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();// it is internally using heap ds to store the element it's implementing min heap ds.
        

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        Iterator<Integer> iterator = pq.iterator();
        while(iterator.hasNext())
        {
        //	System.out.println(pq.poll());  // it return [12, 24, 36, 40]
        	System.out.println(iterator.next());// it return [12, 36, 24, 40]
        }
  //      pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }

}
