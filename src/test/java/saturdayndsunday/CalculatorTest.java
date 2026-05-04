package saturdayndsunday;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaluclatorTest {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before- All");
		}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
		}
	public Calculator calc;
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculator(20, 30);
		System.out.println("Before");
		}
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Before");
		calc = null;
		}

	@Test
	void testAdd() {
		int expected = 50;
		int actual = calc.add();
		assertEquals(expected, actual);
		}
	@Test
	void testMultiply() {
		int expected = 600;
		int actual = calc.multiply();
		assertEquals(expected, actual);
		}@Test
	void testMultiplyNegative() {
	calc.setOperand1(-100);
	int expected = -1;
	int actual = calc.multiply();
	assertEquals(expected, actual);
	}@Test
	void testMultiplyNegative1() {
	calc.setOperand2(-100);
    int expected = -1;
    int actual = calc.multiply();
    assertEquals(expected, actual);
    }@Test
	void testMultiplyBothNegative() {
	calc.setOperand1(-100);
	calc.setOperand2(-20);
	int expected = -1;
	int actual = calc.multiply();
	assertEquals(expected, actual);
	}
}