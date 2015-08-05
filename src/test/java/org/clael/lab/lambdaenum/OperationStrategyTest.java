package org.clael.lab.lambdaenum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperationStrategyTest {
	@Test
	public void add() {
		assertEquals("Should add 5 and 3 to obtain 8", new Integer(8), Operation.ADD.compute(5, 3));
	}
	@Test
	public void sub() {
		assertEquals("Should sub 5 and 3 to obtain 2", new Integer(2), Operation.SUB.compute(5, 3));
	}
	@Test
	public void max() {
		assertEquals("Should find max of 5 and 3 to obtain 5", new Integer(5), Operation.MAX.compute(5, 3));
	}
}
