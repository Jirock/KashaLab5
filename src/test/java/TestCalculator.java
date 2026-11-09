import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

class TestCalculator {

    @org.junit.jupiter.api.Test
    public void calcClassCreationTest(){
        Calculator calc = new Calculator();
        Assertions.assertNotNull(calc);
    }

    @org.junit.jupiter.api.Test
    public void calcAdd2and1Test(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(3, calc.add(2,2));
    }

}