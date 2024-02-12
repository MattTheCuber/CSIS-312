public class CarTest {
    public static void main(String[] args) {
        Car blueTruck = new Car();
        Car redVan = new Car();

        blueTruck.setColor("Blue");
        blueTruck.setType("Truck");

        redVan.setColor("Red");
        redVan.setType("Van");

        System.out.println("Blue Truck");
        System.out.printf("Color: %s\n", blueTruck.getColor());
        System.out.printf("Type: %s\n", blueTruck.getType());

        System.out.println("Red Van");
        System.out.printf("Color: %s\n", redVan.getColor());
        System.out.printf("Type: %s\n", redVan.getType());
    }
}
