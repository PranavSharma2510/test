import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {
int arr[]= {-5,-6,-8,-2,-9,-4,-8};
	@Test
	void test() {
		assertEquals(-2,Calculation.findMax(arr));
	}

}
