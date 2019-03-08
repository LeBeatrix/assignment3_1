package ac.za.cput.projects;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class ObjectIdentityTestDemoTest
{
    @Test
    public void testCompareString()
    {
        ObjectIdentityTestDemo demo = new ObjectIdentityTestDemo();

        assertSame(demo.compareString("hello", "hello"), demo.compareString("hello", "hello"));
    }
}
