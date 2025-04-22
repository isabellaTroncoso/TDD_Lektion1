import static org.junit.jupiter.api.Assertions.*;

import com.isabella.lektion1.CalculatorService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    @DisplayName("Adderar 2 tal med double")
    @Test
    void addingTwoPositivenumberwithDouble_returnSumOfTwoPositiveNumbers () {
        CalculatorService calculatorService = new CalculatorService();
        double result = calculatorService.addition(0.1, 1.4);
        System.out.println(result);
        assertEquals(1.5, result);

    }

    @DisplayName("Subtrahera två tal med int")
    @Test
    void subractTwoNumbersAndReturnSumOfTwoNumbers () {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.subtract(6,2);
        System.out.println(result);
        assertEquals(4, result);
    }

    @DisplayName("Multiplicera två talen och gångrar resultatet")
    @Test
    void multiplyTwoNumbersAndReturnSumOfTwoNumbers () {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.multiply(10, 2);
        System.out.println(result);
        assertEquals(20, result);
    }

    @DisplayName("Dividerar två tal med den ena 0")
    @Test
    void divideTwoNumbersWithTheOneZero_returnSumOfTwoNumbers () {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.divide(10,0);
        System.out.println(result);
        assertEquals(0, result);
    }


}
