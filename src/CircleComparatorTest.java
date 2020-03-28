import java.util.Comparator;
import java.util.Arrays;


public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.2, "red", false);
        circles[2] = new Circle(1.8);

        System.out.println("Pre-sorted: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After sorted: ");
        for (Circle circle: circles) {
            System.out.println(circle);
        }
    }

}
