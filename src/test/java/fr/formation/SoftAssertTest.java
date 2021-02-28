
package fr.formation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void testPlusieursAssert() {

		SoftAssert sa = new SoftAssert();

		sa.assertTrue(4 * 3 < 6 * 7, "4 * 3 < 6 * 7");
		sa.assertTrue(4 * 3 > 6 * 7, "4 * 3 > 6 * 7");
		sa.assertTrue(8 == 9, "8 == 9");
		sa.assertTrue(7 * 5 == Integer.parseInt("35"), "7*5==parseInt('35')");
		sa.assertTrue(7 * 5 == 32, "7 * 5 == 32");

		sa.assertAll();
	}
}
