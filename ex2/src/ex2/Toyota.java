package ex2;


public class Toyota implements IVehicleMaker {
 private static Toyota instanciaUnica;

 private Toyota() {}

 public static Toyota getInstancia() {
     if (instanciaUnica == null) {
         instanciaUnica = new Toyota();
     }
     return instanciaUnica;
 }

 
 @Override
 public IVehicle makeVehicle(String modelo) {
     switch (modelo.toLowerCase()) {
         case "corolla": return new Corolla();
         case "hilux": return new Hilux();
         case "etios": return new Etios();
         default: return null;
     }
 }
}
