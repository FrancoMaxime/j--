package junit;

import junit.framework.TestCase;
import pass.Primes;

public class PrimesTest extends TestCase {
	public Primes primes;

	
	public void setUp() throws Exception {
		super.setUp();
		primes = new Primes();
	}

	
	public void tearDown() throws Exception {
		super.tearDown();
	}

	
	public void testPrimes() {
		this.assertEquals(primes.primes(11),"2 3 5 7 11");
		this.assertEquals(primes.primes(2),"2");
		this.assertEquals(primes.primes(8),"2 3 5 7");
	}

}
