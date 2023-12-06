package com.alexandre.automation;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();

        assertThat(calculator.sum(2, 2)).isEqualTo(4);
    }
}
