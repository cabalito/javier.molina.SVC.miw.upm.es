package javier.molina.SVC.miw.upm.es;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class C12Test {

	@Test
	public void test() {
		fail("Not yet implemented");
	}private C12 c12;
    
    @Before
    public void before(){
        c12 = new C12();
    }
    
    @Test
    public void testMA() {
        assertEquals("mA", this.c12.mA());
    }

}
