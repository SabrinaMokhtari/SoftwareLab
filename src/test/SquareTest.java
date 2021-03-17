package test;

import com.company.MyRect;
import com.company.MySquare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {
    @Test
    public void PositiveIntWidth() throws Exception {
        assertEquals(4, new MySquare(2).ComputeArea());
    }

    @Test
    public void PositiveFloatWidth() throws Exception {
        assertEquals(1.21, new MySquare(1.1).ComputeArea());
    }


    @Test
    public void throwsExceptionWhenZeroNumbersAreGiven() throws Exception {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            new MySquare(0).ComputeArea();
        });

        String expectedMessage = "width or height are not positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void throwsExceptionWhenNonNegativeNumbersAreGiven() throws Exception {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            new MySquare( -1).ComputeArea();
        });

        String expectedMessage = "width or height are not positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void SetIntWidthTest() throws Exception {
        MySquare mySquare = new MySquare(2);
        mySquare.setWidth(7);
        assertEquals(7, mySquare.getWidth());
    }

    @Test
    public void SetFloatWidthTest() throws Exception {
        MySquare mySquare = new MySquare(2);
        mySquare.setWidth(7.5);
        assertEquals(7.5, mySquare.getWidth());
    }

    @Test
    public void SetNegativeWidthTest() throws Exception {
        MySquare mySquare = new MySquare(2);
        mySquare.setWidth(-3);
        assertEquals(-3, mySquare.getWidth());
    }

    @Test
    public void SetZeroWidthTest() throws Exception {
        MySquare mySquare = new MySquare(2);
        mySquare.setWidth(0);
        assertEquals(0, mySquare.getWidth());
    }

    @Test
    public void Test(){
        MyRect myRect = new MySquare(8);
        myRect.setWidth(4);
        assertEquals(32, myRect.ComputeArea());
    }


}
