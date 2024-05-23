package src.test.java;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.main.java.Calculator;

public class CalculatorTest {
    private Calculator calc = new Calculator();
    public static int testCount = 0;

    @Before
    public void countTests(){
        System.out.println("Test No. "+testCount);
    }

    @Test
    public void checkAdd(){
        int res = calc.add(10,5);
        Assert.assertEquals(15,res);
    }

    @Test
    public void checkSubt(){
        int res = calc.subtract(90,100);
        Assert.assertEquals(10,res);
    }
}
