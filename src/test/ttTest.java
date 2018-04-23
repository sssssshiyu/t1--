package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ttTest {

	tt mycal=new tt();
    @Before
    public void setUp(){
        System.out.println("≤‚ ‘ø™ º");
    }
    @After
    public void down()
    {
        System.out.println("≤‚ ‘Ω· ¯");
    }
    @Test
    public void testAdd() {
        assertEquals(8,mycal.add(2, 6));
        assertEquals(8,mycal.add(4, 4));
        assertEquals(11,mycal.add(2, 9));
    }
    @Test
    public void testsubtract() {
        assertEquals(1,mycal.subtract(3,2));
        assertEquals(7,mycal.subtract(9, 2));
    }
    @Test
    public void testmultiply() {
        assertEquals(15,mycal.multiply(3, 5));
        assertEquals(12,mycal.multiply(3, 4));
    }
    @Test
    public void testdivide() {
        assertEquals(1,mycal.divide(4, 4));
        assertEquals(0,mycal.divide(4, 0));
        assertEquals(2,mycal.divide(4, 2));
    }

}
