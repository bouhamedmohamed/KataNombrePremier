import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

    private static final int MIN_VALUE = 2;
    private static final String ARGUMENT_MUST_BE_STRICTLY_HIGHER_THAN_1 = "Argument must be strictly higher than 1";

    public List<Integer> calculate(Integer max) {

        checkArgument(max);

        return IntStream
                .rangeClosed(MIN_VALUE, max)
                .filter(this::isPrime)
                .boxed()
                .collect(Collectors.toList());

    }

    private void checkArgument(Integer max) {
        Objects.requireNonNull(max);
        if (max < MIN_VALUE)
            throw new IllegalArgumentException(ARGUMENT_MUST_BE_STRICTLY_HIGHER_THAN_1);
    }

    private boolean isPrime(int currentNumber) {
        return IntStream
                .rangeClosed(MIN_VALUE, currentNumber / 2)
                .noneMatch(intervalNumber -> currentNumber % intervalNumber == 0);
    }
}
