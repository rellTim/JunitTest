import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;

public class MainTests {
    Main sut;
    @BeforeEach
    public void beforeEach() {
        sut = new Main();
    }
    @Test
    public void discriminantTest (){
        double a = 1, b = -6, c = 9;
        List<Double> expected = new ArrayList<>();
        expected.add(3.0);

        List<Double> actual = sut.discriminant(a, b, c);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void discriminantTestByZero (){
        double a = 3, b = -4, c = 2;

        Assertions.assertThrows(RuntimeException.class, ()-> sut.discriminant(a, b, c));
    }
}
