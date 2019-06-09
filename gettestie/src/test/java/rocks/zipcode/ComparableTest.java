package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class ComparableTest {

    @Test
    public  void ComparbleTest() {
        ArrayList<Person> array = new ArrayList<>();
        Person a = new Person("", 99);
        Person b = new Person("", 67);
        Person c = new Person("", 60);

       array.add(a);
       array.add(b);
       array.add(c);

        Collections.sort(array);

        assertEquals(99, array.get(0).getYearOfBirth());

    }



}
