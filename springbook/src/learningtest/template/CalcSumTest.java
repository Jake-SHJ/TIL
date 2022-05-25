package learningtest.template;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class CalcSumTest {

    Calculator calculator;
    String numFilePath;

    @Before public void setUp() {
        this.calculator = new Calculator();
        this.numFilePath = getClass().getResource("numbers.txt").getPath();
    }

    @Test
    public void sumOfNumbers() throws IOException {
        assertThat(calculator.calcSum(this.numFilePath), is(10));
    }

    @Test
    public void multiplyOfNumbers() throws IOException {
        assertThat(calculator.calcMultiply(this.numFilePath), is(24));
    }
}
