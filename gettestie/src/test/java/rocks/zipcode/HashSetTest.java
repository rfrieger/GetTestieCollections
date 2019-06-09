package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class HashSetTest {
    @Test
    public void TestHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);

        assertEquals(1, hashSet.size());
    }


    @Test
    public void TestHashSet2() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.remove(1);

        assertEquals(0, hashSet.size());
    }


    @Test
    public void TestHashSet3() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);

        assertEquals(1, hashSet.size());
    }


    @Test
    public void TestHashSet4() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.clear();

        assertEquals(0, hashSet.size());
    }


    @Test
    public void TestHashSet5() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);


        assertEquals(false, hashSet.isEmpty());
    }


}

