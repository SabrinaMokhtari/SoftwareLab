package test;

import org.junit.jupiter.api.Test;
import com.company.MyRect;
import static org.junit.jupiter.api.Assertions.*;

public class RecTest {
    @Test
    public void test1() {
        assertEquals(6, new MyRect(2, 3).ComputeArea());
    }
    @Test
    public void test2() {
        assertEquals(5.4, new MyRect(2.0, 2.7).ComputeArea());
    }
    @Test
    public void test3() {
        assertEquals(10, new MyRect(5, 2).ComputeArea());
    }
}