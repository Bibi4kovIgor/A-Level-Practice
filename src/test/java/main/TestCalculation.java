package main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCalculation {

    private static Calculation calculation;

    @BeforeAll
    static void initialize(){
        calculation = new Calculation(6, 5);
    }

    @Test
    void Calculate_CalculateSum_ReturnIntResult() {
        // Arrange - Act - Assert
        //Arrange

        int expected = 11;


        // Act
        int actual = calculation.calculate("+");

        // Assert
        assertEquals(expected, actual, "Wrong calculations");
    }

    @Test
    void Calculate_CalculateSub_ReturnIntResult() {
        // Arrange - Act - Assert
        //Arrange
        int expected = 1;

        // Act
        int actual = calculation.calculate("-");

        // Assert
        assertEquals(expected, actual, "Wrong calculations");
    }
}