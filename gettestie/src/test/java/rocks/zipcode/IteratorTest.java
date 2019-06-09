package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class IteratorTest {


    @Test
    public void IteratorTest  () {

        ArrayList<Object> arr = new ArrayList();
        Object a = new Person("", 99);
        Object b = new Person("", 67);
        Object c = new Person("", 60);

        arr.add(a);
        arr.add(b);
        arr.add(c);


//        for (Person p : arr) {
//            p.getName() = "bob";
//        }



        assertEquals("bob", ((Person) c).getName());
    }
}
