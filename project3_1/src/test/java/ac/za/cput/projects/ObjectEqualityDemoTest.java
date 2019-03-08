package ac.za.cput.projects;

import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectEqualityDemoTest
{

    @Test
    public void testCompareString()
    {
        ObjectEqualityDemo demo = new ObjectEqualityDemo();

        assertFalse(demo.compareString("hello","hell"));
        assertTrue(demo.compareString("hello", "hello"));
    }

    @Test
    public void testConcatString()
    {
        ObjectEqualityDemo demo = new ObjectEqualityDemo();

        assertEquals("HelloWorld", demo.concatString("Hello","World"));
    }
}
