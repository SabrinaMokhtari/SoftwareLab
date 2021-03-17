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

    @Test
    public void SetIntWidthTest() throws Exception {
        MyRect myRect = new MyRect(2, 3);
        myRect.setWidth(7);
        assertEquals(7, myRect.getWidth());
    }

    @Test
    public void SetFloatWidthTest() throws Exception {
        MyRect myRect = new MyRect(2, 3);
        myRect.setWidth(2.3);
        assertEquals(2.3, myRect.getWidth());
    }

    @Test
    public void SetNegativeWidthTest() throws Exception {
        MyRect myRect = new MyRect(2, 3);
        myRect.setWidth(-3);
        assertEquals(-3, myRect.getWidth());
    }

    @Test
    public void SetZeroWidthTest() throws Exception {
        MyRect myRect = new MyRect(2, 3);
        myRect.setWidth(0);
        assertEquals(0, myRect.getWidth());
    }

    @Test
    public void SetIntHeightTest() throws Exception {
        MyRect myRect = new MyRect(2, 3);
        myRect.setHeight(7);
        assertEquals(7, myRect.getHeight());
    }

    @Test
    public void SetFloatHeightTest() throws Exception {
        MyRect myRect = new MyRect(2, 3);
        myRect.setHeight(2.3);
        assertEquals(2.3, myRect.getHeight());
    }

    @Test
    public void SetNegativeHeightTest() throws Exception {
        MyRect myRect = new MyRect(2, 3);
        myRect.setHeight(-3);
        assertEquals(-3, myRect.getHeight());
    }

    @Test
    public void SetZeroHeightTest() throws Exception {
        MyRect myRect = new MyRect(2, 3);
        myRect.setHeight(0);
        assertEquals(0, myRect.getHeight());
    }
}