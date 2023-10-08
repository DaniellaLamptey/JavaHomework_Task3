
public abstract class Vehicle {
    private Manufacture manufacture;
    private Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public void showCharacteristics() {
        System.out.println("Vehicle Type: " + this.getClass().getSimpleName());
        System.out.println("Manufacture Details: " + manufacture);
        System.out.println("Engine Type: " + engine);
        System.out.println("----------------------------------");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public String getMake() {
        return this.make;
    }
    private String make;
    private String model;
    private int yearOfManufacture;
    private String color;
    private double price;
    private String registrationNumber;

    @Override
    public String toString() {
        return id + ", " + make + ", " + model + ", " + yearOfManufacture + ", " + color + ", " + price + ", " + registrationNumber;
    }
}

