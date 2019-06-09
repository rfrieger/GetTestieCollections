package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class IteratorTest {


    @Test
    public void IteratorTest  () {

        ArrayList<String > arr = new ArrayList();

        String a = new Person("jen", 99).getName();
        String b = new Person("jon", 67).getName();
        String c = new Person("gary", 60).getName();

        arr.add(a);
        arr.add(b);
        arr.add(c);

        int count = 0;
        for (String p : arr) {

            arr.set(count,"bob");
            count++;
        }



        assertEquals("bob", arr.get(1) );
    }
}
