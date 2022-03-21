
import java.io.IOException;

public class Car {
    public Car() {
    }

    public static void main(String[] args) throws IOException {
        Cars car1 = new Cars("RAM", "Dodge", "Black", 190000, 2017, 8);
        System.out.println(car1.toString());
        System.out.println(car1.getColor());
        int year = car1.getYear();
        car1.setColor("Dark Blue");
        System.out.println(car1.toString());
        System.out.println(year);
    }
}
