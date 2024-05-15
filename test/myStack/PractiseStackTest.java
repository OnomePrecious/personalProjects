package myStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PractiseStackTest {

    @Test
  public void test_pop() {
        PractiseStack.push(1);
        PractiseStack.push(2);
        assertEquals(2, PractiseStack.pop()); ;
    }
}