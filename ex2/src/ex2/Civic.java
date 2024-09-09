package ex2;

//Classe concreta para o modelo Civic
public class Civic implements IVehicle {
 @Override
 public void start() {
     System.out.println("Civic ligado.");
 }

 @Override
 public void drive() {
     System.out.println("Civic está dirigindo.");
 }

 @Override
 public void stop() {
     System.out.println("Civic parado.");
 }
}
