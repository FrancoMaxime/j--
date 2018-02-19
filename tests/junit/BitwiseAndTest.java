package junit;

import junit.framework.TestCase;
import pass.BitwiseAnd;

public class BitwiseAndTest extends TestCase {
	public BitwiseAnd bitwise;

	protected void setUp() throws Exception {
		super.setUp();
		bitwise = new BitwiseAnd();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void test() {
		this.assertEquals(bitwise.bitwiseand(4, 2), 0);
		this.assertEquals(bitwise.bitwiseand(7, 2), 2);
	}

}
