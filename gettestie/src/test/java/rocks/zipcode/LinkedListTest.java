package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void TestLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.add(1);


        assertEquals( 1, linkedList.size());
    }

    @Test
    public void TestLinkedList2() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.remove(0);


        assertEquals( 0, linkedList.size());
    }

    @Test
    public void TestLinkedList3() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.clear();


        assertEquals( 0, linkedList.size());
    }

    @Test
    public void TestLinkedList4() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        assertEquals( true, linkedList.contains(1));
    }

    @Test
    public void TestLinkedList5() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(1);
        linkedList.add(1);
        linkedList2.add(5);


        linkedList.addAll(linkedList2);

        assertEquals(4 , linkedList.size());
    }
}
