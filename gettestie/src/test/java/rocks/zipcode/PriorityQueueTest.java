package rocks.zipcode;

import java.util.PriorityQueue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriorityQueueTest {


    @Test
    public void priorityQuestTest () {
        PriorityQueue<Object> pq = new PriorityQueue<>();

        Person a = new Person("", 99);
        Person b = new Person("", 67);
        Person c = new Person("", 60);

        pq.add(a);
        pq.add(b);
        pq.add(c);

        assertEquals(true, pq.contains(c));
    }

    @Test
    public void priorityQuestTest2 () {
        PriorityQueue<Object> pq = new PriorityQueue<>();

        Person a = new Person("", 99);
        Person b = new Person("", 67);
        Person c = new Person("", 60);

        pq.add(a);
        pq.add(b);
        pq.add(c);

        assertEquals(a, pq.peek());
    }

    @Test
    public void priorityQuestTest3 () {
        PriorityQueue<Object> pq = new PriorityQueue<>();

        Person a = new Person("", 99);
        Person b = new Person("", 67);
        Person c = new Person("", 60);

        pq.add(a);
        pq.add(b);
        pq.add(c);
        pq.remove(b);
        assertEquals(2, pq.size());
    }
}
