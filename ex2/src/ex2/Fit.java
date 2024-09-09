package ex2;


public class Fit implements IVehicle {
 @Override
 public void start() {
     System.out.println("Fit ligado.");
 }

 @Override
 public void drive() {
     System.out.println("Fit está dirigindo.");
 }

 @Override
 public void stop() {
     System.out.println("Fit parado.");
 }
}

