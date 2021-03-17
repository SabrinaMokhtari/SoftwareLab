package test;

import org.junit.jupiter.api.Test;
import com.company.MyRect;
import static org.junit.jupiter.api.Assertions.*;

public class RecTest {
    @Test
    public void PositiveFloatWidthIntHeight() throws Exception {
        assertEquals(6, new MyRect(2, 3).ComputeArea());
    }
    @Test
    public void PositiveFloatWidthFloatHeight() throws Exception {
        assertEquals(5.4, new MyRect(2.0, 2.7).ComputeArea());
    }
    @Test
    public void PositiveIntWidthFloatHeight() throws Exception {
        assertEquals(10.5, new MyRect(5, 2.1).ComputeArea());
    }

    @Test
    public void throwsExceptionWhenZeroNumbersAreGiven() throws Exception {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            new MyRect(0, 2).ComputeArea();
        });

        String expectedMessage = "width or height are not positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void throwsExceptionWhenNonNegativeNumbersAreGiven() throws Exception {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            new MyRect(2, -1).ComputeArea();
        });

        String expectedMessage = "width or height are not positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}