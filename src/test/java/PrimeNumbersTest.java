import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumbersTest {


    private PrimeNumbers primeNumbers;

    @Before
    public void setUp() throws Exception {
        primeNumbers = new PrimeNumbers();
    }


    @Test
    public void should_return_first_30_prime_numbers() throws Exception {
        List<Integer> actualPrimeNumbers = primeNumbers.calculate(30);
        assertThat(actualPrimeNumbers).containsExactly(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    }


    @Test(expected = IllegalArgumentException.class)
    public void should_argument_be_strictly_higher_than_1() throws Exception {
        primeNumbers.calculate(0);
    }


    @Test(expected = NullPointerException.class)
    public void should_argument_be_not_null() throws Exception {
        primeNumbers.calculate(null);
    }

}
