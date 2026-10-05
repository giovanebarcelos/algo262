package class27;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class MathTest {
    private Math math;
    @BeforeEach
    void setup(){
        // Arrange - Preparar
        math = new Math();
    }

    @Test
    void shouldAddTwoNumbers(){
        // Action - Executar
        int result = math.add(6, 4);

        // Assert - Verificar
        assertEquals(10, result);
    }

    @Test
    void shouldSubtractTwoNumbers(){
        assertEquals(2, math.subtract(6,4));
    }

    @Test
    void shouldMulplyTwoNumbers(){
        assertEquals(24, math.multiply(6,4));
    }

    @Test
    void shouldDivideTwoNumbers(){
        assertEquals(new BigDecimal(3), math.divide(
                new BigDecimal(6),
                new BigDecimal(2)));
    }
}

