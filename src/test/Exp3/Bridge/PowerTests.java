package test.Exp3.Bridge;

import com.company.EXP3.Bridge.*;
import com.company.EXP3.StarBuzzCoffee.Beverage;
import com.company.EXP3.StarBuzzCoffee.HouseBlend;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerTests {

    @Test
    void test_RecursivePower_AddMultiplication() {
        Power power = new RecursivePower(new AddMultiplication());
        assertEquals(81, power.operation(3, 4));
    }
    @Test
    void test_RecursivePower_RecursivePower() {
        Power power2 = new RecursivePower(new RecursiveMultiplication());
        assertEquals(81, power2.operation(3, 4));
    }
    @Test
    void test_WhilePower_AddMultiplication() {
        Power power3 = new WhilePower(new AddMultiplication());
        assertEquals(81, power3.operation(3, 4));
    }
    @Test
    void test_WhilePower_RecursiveMultiplication() {
        Power power4 = new WhilePower(new RecursiveMultiplication());
        assertEquals(81, power4.operation(3, 4));
    }
}
