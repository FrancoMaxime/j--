package junit;

import junit.framework.TestCase;
import pass.BitwiseComplement;

public class BitwiseComplementTest extends TestCase {
	private BitwiseComplement bitwisecomp;
	
	public void setUp() throws Exception {
		super.setUp();
		bitwisecomp = new BitwiseComplement();
		
	}

	
	public void tearDown() throws Exception {
		super.tearDown();
	}

	
	public void testComplement() {
		this.assertEquals(bitwisecomp.unaryComplement(4), -5);
		this.assertEquals(bitwisecomp.unaryComplement(3), -4);
		this.assertEquals(bitwisecomp.unaryComplement(4) - bitwisecomp.unaryComplement(3), -1);
	}

}
