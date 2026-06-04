public class Car {
    String brand;
    int price;

    static String company = "hello motors";

    Car(String b, int p) {
        brand = b;
        price = p;
    }

    void display() {
        
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Company: " + company);
        Car car1 = new Car("Honda", 80000);
        Car car2 = new Car("Hyundai", 90000);
        Car car3 = new Car("Toyota", 120000);

        car1.display();
        car2.display();
        car3.display();
    }
}