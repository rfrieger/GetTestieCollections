package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.assertEquals;

public class ArrayDequeTest {

    @Test
    public void TestArrayList() {
        ArrayDeque<Integer> arrayList = new ArrayDeque<>();
        arrayList.push(1);


        assertEquals(false, arrayList.isEmpty());
    }

    @Test
    public void TestArrayDeque2() {
        ArrayDeque<Integer> arrayList = new ArrayDeque<>();
        arrayList.push(1);
        arrayList.pop();


        assertEquals(true, arrayList.isEmpty());
    }

    @Test
    public void TestArrayDeque3() {
        ArrayDeque<Integer> arrayList = new ArrayDeque<>();
        arrayList.push(1);
        arrayList.push(2);



        assertEquals(2, arrayList.size());
    }

    @Test
    public void TestArrayDeque4() {
        ArrayDeque<Integer> arrayList = new ArrayDeque<>();
        arrayList.push(1);
        arrayList.push(50);
        arrayList.push(10);
        arrayList.push(5);



        assertEquals(true, arrayList.contains(50));
    }

    @Test
    public void TestArrayDeque5() {
        ArrayDeque<Integer> arrayList = new ArrayDeque<>();
        arrayList.push(1);
        arrayList.removeFirst();

        assertEquals(0, arrayList.size());
    }
}
