package ac.za.cput.projects;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class TimeoutDemoTest
{

    @Rule
    public Timeout globalTimeout= new Timeout(20);

    @Test
    public void testCompareString()
    {
        ObjectEqualityDemo demo = new ObjectEqualityDemo();

        assertFalse(demo.compareString("hello","hell"));
        assertTrue(demo.compareString("hello", "hello"));
    }

}
