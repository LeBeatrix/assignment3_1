package ac.za.cput.projects;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisablingTest
{
    @Ignore
    @Test
    public void testConcatString()
    {
        ObjectEqualityDemo demo = new ObjectEqualityDemo();

        assertEquals("HelloWorld", demo.concatString("Hello","World"));
    }
}
