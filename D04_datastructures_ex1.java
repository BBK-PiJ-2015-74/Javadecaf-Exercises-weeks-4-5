
import java.util.Scanner;

public class D04_datastructures_ex1 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Ex 1 stack and heap diagrams

        Car myOldFord = new Car(); 
myOldFord.model = "Ford Ka"; 
myOldFord.price = 2000; 
Car fancyRacer = new Car(); 
fancyRacer.model = "911"; 
fancyRacer.price = 300000; 
int myBudget = 10000;
            // Point 2

            System.out.println("Lets exchange cars! Deal?"); 
trade(fancyRacer, myOldFord, myBudget);
            // Point 3

            System.out.println("After the exchange, the new car is" + myOldFord.model);
        System.out.println ("After the exchange, the old car is" + fancyRacer.model);
        System.out.println("The old car has become " + fancyRacer.model); 
System.out.println("And the new car has become " + myOldFord.model); 
trade(fancyRacer, myOldFord, myBudget);
    }

    private static void trade (Car newCar, Car oldCar, int myFund) { 
	if (newCar.price <= oldCar.price + myFund) {
            System.out.println("we have a deal");
        } else {
            System.out.println("forget about it...");
        }
        System.out.println("Now we try to be naughty"); 
Car temp = new Car();
        temp = newCar;
        newCar = oldCar;
        oldCar = temp;
    }
    // Point 1

    static class Car {
        String model;
        double price;
    }
}