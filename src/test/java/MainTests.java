import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTests {

    @Test
    public void discriminantTest() {
        double a = 1, b = -6, c = 9;
        List<Double> expected = new ArrayList<>();
        expected.add(3.0);

        List<Double> actual = Main.discriminant(a, b, c);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void discriminantTestByZero() {
        double a = 3, b = -4, c = 2;

        Assertions.assertThrows(RuntimeException.class, () -> Main.discriminant(a, b, c));
    }
}
