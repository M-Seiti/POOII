package ex2;

public class Main {
    public static void main(String[] args) {

        IVehicleMaker toyota = Toyota.getInstancia();
        IVehicle corolla = toyota.makeVehicle("corolla");
        corolla.start();
        corolla.drive();
        corolla.stop();

        IVehicleMaker honda = Honda.getInstancia();
        IVehicle civic = honda.makeVehicle("civic");
        civic.start();
        civic.drive();
        civic.stop();
    }
}

