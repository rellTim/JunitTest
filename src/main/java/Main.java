import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        discriminant(1, -6, 9);
    }

    public static List<Double> discriminant(double a, double b, double c) {
        List<Double> roots = new ArrayList<>();
        double q = b * b;
        double w = 4 * a * c;
        double d = q - w;
        if (d < 0) {
            throw new RuntimeException("No roots");
        }
        if (d == 0) {
            roots.add(-b / 2 * a);
            System.out.println(roots);
            return roots;
        }
        if (d > 0) {
            if (b < 0) {
                roots.add(((Math.abs(b) + Math.sqrt(d)) / 2 * a));
                roots.add(((Math.abs(b) - Math.sqrt(d)) / 2 * a));
            }else {
                roots.add(((-b + Math.sqrt(d)) / 2 * a));
                roots.add(((-b - Math.sqrt(d)) / 2 * a));
            }
            System.out.println(roots);
            return roots;
        }
        return roots;
    }
}