import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumbersTest {


    /**
     * Implement PrimeNumbers Class
     */
    @Test
    public void should_return_first_30_prime_numbers() throws Exception {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        List<Integer> actualPrimeNumbers = primeNumbers.calculate(30);
        assertThat(actualPrimeNumbers).containsExactly(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    }

    /**
     * Add a UT which checks that the argument of the calculate method is strictly higher than 1
     */


    /**
     * Add a UT which checks that the argument of the calculate method isn't null
     */

}
