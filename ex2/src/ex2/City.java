package ex2;

public class City implements IVehicle {
 @Override
 public void start() {
     System.out.println("City ligado.");
 }

 @Override
 public void drive() {
     System.out.println("City está dirigindo.");
 }

 @Override
 public void stop() {
     System.out.println("City parado.");
 }
}

