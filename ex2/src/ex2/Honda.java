package ex2;


public class Honda implements IVehicleMaker {
 private static Honda instanciaUnica;


 private Honda() {}

 public static Honda getInstancia() {
     if (instanciaUnica == null) {
         instanciaUnica = new Honda();
     }
     return instanciaUnica;
 }


 @Override
 public IVehicle makeVehicle(String modelo) {
     switch (modelo.toLowerCase()) {
         case "city": return new City();
         case "civic": return new Civic();
         case "fit": return new Fit();
         default: return null;
     }
 }
}

