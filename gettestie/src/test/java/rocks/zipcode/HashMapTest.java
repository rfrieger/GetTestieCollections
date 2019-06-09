package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HashMapTest {
    @Test
    public void TestHashMap() {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1,"a");

        assertEquals(1, hashMap.size());
    }

    @Test
    public void TestHashMap2() {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1,"a");
        hashMap.put(2,"b");


        assertEquals(true, hashMap.containsValue("a"));
    }

    @Test
    public void TestHashMap3() {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        hashMap.put(4,"d");


        assertEquals("a", hashMap.get(1));
    }

    @Test
    public void TestHashMap4() {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        hashMap.put(4,"d");
        hashMap.remove(1);
        hashMap.remove(2);

        assertEquals(2, hashMap.size());
    }

    @Test
    public void TestHashMap5() {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        hashMap.put(4,"d");

        hashMap.replace(2,"b", "yikes");


        assertEquals("yikes", hashMap.get(2));
    }

}
