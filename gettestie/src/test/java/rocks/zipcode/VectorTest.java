package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class VectorTest {

    @Test
    public void VectorTest() {
        Vector vec = new Vector();

        Person a = new Person("", 99);
        Person b = new Person("", 67);
        Person c = new Person("", 60);

       vec.add(a);
       vec.add(b);
       vec.add(c);

        assertEquals(2, vec.lastIndexOf(c));
    }
}
