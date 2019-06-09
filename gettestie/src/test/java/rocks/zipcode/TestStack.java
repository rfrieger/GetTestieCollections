package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void TestSack2() {
        Stack<String> stack = new Stack<>();
        stack.push("what what ");
        stack.pop();

        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void TestSack3() {
        Stack<String> stack = new Stack<>();
        stack.push("what is love ");
        stack.push("baby dont hurt me");
        stack.push("dont hurt me");
        stack.push("no more");
        stack.clear();

        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void TestSack4() {
        Stack<String> stack = new Stack<>();
        stack.push("what");


        assertEquals("what", stack.peek());
    }

    @Test
    public void TestSack5() {
        Stack<String> stack = new Stack<>();
        stack.push("what");

        assertEquals(1, stack.search("what"));
    }

}
