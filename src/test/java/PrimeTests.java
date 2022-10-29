import org.krif07.codewars.Prime;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PrimeTests {

    @Test
    public void testPrime(){
        assertFalse(Prime.isPrime(0), "0  is not prime");
        assertFalse(Prime.isPrime(1), "1  is not prime");
        assertTrue(Prime.isPrime(2), "2  is prime");
        assertFalse(Prime.isPrime(4), "4  not is prime");
        assertTrue(Prime.isPrime(73), "73 is prime");
        assertFalse(Prime.isPrime(75), "75 is not prime");
        assertFalse(Prime.isPrime(-1), "-1 is not prime");
        assertFalse(Prime.isPrime(1566949051), "1566949051 is not prime");
        assertFalse(Prime.isPrime(1047752161), "1047752161 is not prime");
    }
}
