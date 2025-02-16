import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUnitTests {

    @Test
    void sumNumbersTest() {
        //AAA - Arrange-> Act -> Assert
        int a = 3;
        int b = 2;

        int actualSum = a + b;
        int expectedSum = 5;

        assertEquals(expectedSum, actualSum);
    }
}
