import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_GetStrike(){
	int firstThrow =+ 10;
	assertEquals(10, firstThrow);
	
	}
	
	@Test
	public void test_GetSpare(){
	int firstThrow = 4;
	int secondThrow = firstThrow+ 6;
	assertEquals(10, secondThrow);
	}
	
}
