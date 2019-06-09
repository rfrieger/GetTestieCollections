package rocks.zipcode;

import org.junit.Test;

import java.util.TreeMap;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TreeMapTest {

    @Test
    public void TestTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"a");

        assertEquals(1, treeMap.size());
    }

    @Test
    public void TestTreeMap2() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"a");
        treeMap.put(2,"b");


        assertEquals(true, treeMap.containsValue("a"));
    }

    @Test
    public void TestTreeMap3() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"a");
        treeMap.put(2,"b");
        treeMap.put(3,"c");
        treeMap.put(4,"d");


        assertEquals("a", treeMap.get(1));
    }

    @Test
    public void TestTreeMap4() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"a");
        treeMap.put(2,"b");
        treeMap.put(3,"c");
        treeMap.put(4,"d");
        treeMap.remove(1);
        treeMap.remove(2);

        assertEquals(2, treeMap.size());
    }

    @Test
    public void TestTreeMap5() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"a");
        treeMap.put(2,"b");
        treeMap.put(3,"c");
        treeMap.put(4,"d");

        treeMap.replace(2,"b", "yikes");


        assertEquals("yikes", treeMap.get(2));
    }
}
