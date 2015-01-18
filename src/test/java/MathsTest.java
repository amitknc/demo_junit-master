import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathsTest {
	Maths obj;
	
	@Test
	public void testAdd(){
		System.out.println("Test case for addtion");
		assertEquals(50.0, obj.add(20, 30));
		assertNotNull(obj.add(20, 30));
		assertEquals(-10.0, obj.add(20, -30));
		assertEquals(10.0, obj.add(-20, 30));
		assertEquals(-50.0, obj.add(-20, -30));
	}
	
	@Test
	public void testSub(){
		System.out.println("Test case for subtraction");
		assertEquals(-10.0, obj.subtract(20, 30));
		assertNotNull(obj.subtract(20, 30));
		assertEquals(50.0, obj.subtract(20, -30));
		assertEquals(-50.0, obj.subtract(-20, 30));
		assertEquals(10.0, obj.subtract(-20, -30));

	}
	
	@Test
	public void testMultiply(){
		System.out.println("Test case for Multiply");
		assertEquals(600.0, obj.multiply(20, 30));
		assertNotNull(obj.multiply(20, 30));
		assertEquals(-600.0, obj.multiply(20, -30));
		assertEquals(-600.0, obj.multiply(-20, 30));
		assertEquals(600.0, obj.multiply(-20, -30));
	}
	
	@Test
	public void testDivide(){
		System.out.println("Test case for division");
		assertEquals(0.6666666666666666, obj.divide(20, 30));
		assertNotNull(obj.divide(20, 30));
		assertEquals(-0.6666666666666666, obj.divide(20, -30));
		assertEquals(-0.6666666666666666, obj.divide(-20, 30));
		assertEquals(0.6666666666666666, obj.divide(-20, -30));

	}
	@Test
	public void testPower(){
		System.out.println("Test case for power");
		assertEquals(4.0, obj.power(2, 2));
		assertNotNull(obj.power(20, 30));
		assertEquals(20.0, obj.power(20, -30));
		assertEquals(1.0737418239999999E39, obj.power(-20, 30));
		assertEquals(-20.0, obj.power(-20, -30));
	}
	
	@Before
	public void prepare(){
		System.out.println("Before class");
		obj = new Maths();
	}
	
	@After
	public void tearDown(){
		System.out.println("After class");
		obj= null;
	}
}
