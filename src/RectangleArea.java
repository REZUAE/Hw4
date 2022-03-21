
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectangleArea {
    double a;
    double b;
    double area;

    RectangleArea() {
    }

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program calculates area of rectangle");
        System.out.printf("Enter value for side a: ");
        this.a = Double.parseDouble(br.readLine());
        System.out.printf("Enter value for side b: ");
        this.b = Double.parseDouble(br.readLine());
    }

    void computeField() {
        this.area = this.a * this.b;
    }

    void fieldDisplay() {
        System.out.print("Area of rectangle: ");
        System.out.printf("%2.2f. ", this.area);
        System.out.print("Where a = ");
        System.out.printf("%2.2f ", this.a);
        System.out.print("and b = ");
        System.out.printf("%2.2f", this.b);
    }

    static void allCalculation() throws IOException {
        RectangleArea ra = new RectangleArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();
    }
}
