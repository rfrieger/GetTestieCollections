package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {
    @Test
    public void TestArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);


        assertEquals(false, arrayList.isEmpty());
    }

    @Test
    public void TestArrayList2() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.remove(0);


        assertEquals(true, arrayList.isEmpty());
    }

    @Test
    public void TestArrayList3() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);



        assertEquals(2, arrayList.size());
    }

    @Test
    public void TestArrayList4() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(50);
        arrayList.add(10);
        arrayList.add(5);



        assertEquals(true, arrayList.contains(50));
    }

    @Test
    public void TestArrayList5() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);


        assertEquals(0, arrayList.indexOf(1));
    }

}
