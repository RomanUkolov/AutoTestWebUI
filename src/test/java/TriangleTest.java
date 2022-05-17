import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    @DisplayName("Smoke-площадь треугольника")
    void triangleAreaPositiveTestWithValidaValue() throws Exception {
        double area = Triangle.calculateArea(2.0, 3.5,2.0);
        boolean result = false;
        if (area >= 0){
            result = true;
        }
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Не валидные данные")
    void incorrectValueThrowExeption() throws Exception {

    }


}
