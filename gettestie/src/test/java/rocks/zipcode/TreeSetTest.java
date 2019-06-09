package rocks.zipcode;

import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TreeSetTest {

    @Test
    public void TestTreeSet() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);

        assertEquals(1, treeSet.size());
    }


    @Test
    public void TestTreeSet2() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.remove(1);

        assertEquals(0, treeSet.size());
    }


    @Test
    public void TestTreeSet3() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(1);

        assertEquals(1, treeSet.size());
    }


    @Test
    public void TestTreeSet4() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.clear();

        assertEquals(0, treeSet.size());
    }


    @Test
    public void TestTreeSet5() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(1);


        assertEquals(false, treeSet.isEmpty());
    }
}
