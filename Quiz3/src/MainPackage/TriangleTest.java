package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetArea() {
		Triangle testTriangle = new Triangle(1,1,1);
		assertTrue(testTriangle.getArea() == Math.sqrt(1.5*(1.5-1)*(1.5-1)));
		assertFalse(testTriangle.getArea() == 1);
		Triangle testTriangle2 = new Triangle(1,2,2);
		assertTrue(testTriangle2.getArea() == Math.sqrt(2.5*(2.5-1)*(2.5-2)));
		assertFalse(testTriangle2.getArea() == 1);
	}

	@Test
	public void testGetPerimeter() {
		Triangle testTriangle = new Triangle(1,1,1);
		assertTrue(testTriangle.getPerimeter() == 3);
		assertFalse(testTriangle.getPerimeter() == 2);
		Triangle testTriangle2 = new Triangle(3,4,5);
		assertTrue(testTriangle2.getPerimeter() == 12);
		assertFalse(testTriangle2.getPerimeter() == 10);
	}

}
