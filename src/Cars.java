
public class Cars {
    private String model;
    private String brand;
    private String color;
    private int price;
    private int year;
    private int quantity;

    public Cars(String model, String brand, String color, int price, int year, int quantity) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.year = year;
        this.quantity = quantity;
    }

    public String toString() {
        return "Cars{model='" + this.model + "', brand='" + this.brand + "', color='" + this.color + "', price=" + this.price + ", year=" + this.year + ", quantity=" + this.quantity + "}";
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
