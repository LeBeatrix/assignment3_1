package ac.za.cput.projects;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FailingTestDemoTest
{

    @Test
    public void testConcatString()
    {
        FailingTestDemo demo = new FailingTestDemo();

        assertEquals("HelloWorlds", demo.concatString("Hell","World"));
    }
}
