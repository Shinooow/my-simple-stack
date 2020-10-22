package deqo.mdem.mysimplestack;

import org.junit.Before;
import org.junit.Test;
import sun.invoke.empty.Empty;

import static org.junit.Assert.*;

public class StackTest {
    private Item item1;
    private Item item2;
    private Item item3;
    private Stack stack;

    @Before
    public void before(){
        stack = new Stack();
        item1 = new Item("Item 1");
        item2 = new Item("Item 2");
        item3 = new Item("Item 3");
    }

    @Test
    public void isANewStackEmpty() {
        /* a new stack must be empty */
        assertEquals("a new stack must be empty", 0, stack.getSize());
    }

    @Test
    public void push() throws EmptyStackException{
        stack.push(item1);
        assertEquals(item1, stack.peek());
    }

    @Test
    public void peek() throws EmptyStackException{
        stack.push(item1);
        stack.push(item2);
        assertEquals(item2, stack.peek());
    }

    @Test
    public void pop() throws EmptyStackException{
        stack.push(item1);
        stack.push(item2);
        assertEquals(item2, stack.pop());
        assertEquals(item1, stack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void popEmptyStack() throws EmptyStackException {
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmptyStack() throws EmptyStackException {
        stack.peek();
    }

    @Test
    public void getSize() {
        stack.push(item1);
        stack.push(item2);
        assertEquals("the stack size is wrong", 2, stack.getSize());
    }
}