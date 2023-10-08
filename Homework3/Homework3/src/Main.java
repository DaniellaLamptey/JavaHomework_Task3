import java.util.ArrayList;
import java.util.List;

public classMain {
    public static void main(String[] args) {
        // Create some Manufacture and Engine objects
        Manufacture ford = new Manufacture("Ford", "USA");
        Manufacture toyota = new Manufacture("Toyota", "Japan");

        Engine hybridEngine = new HybridEngine();

        // Create an array of Vehicles and display their characteristics
        Vehicle[] vehicles = new Vehicle[]{
                new ICEV(ford, new CombustionEngine()),
                new BEV(ford, new ElectricEngine()),
                new HybridV(toyota, hybridEngine)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
        }
    }
}