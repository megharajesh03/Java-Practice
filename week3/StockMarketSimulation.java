//Thread2
package week3;

import java.util.Random;

class Stock extends Thread {

 private String name;
 private double price;

 public Stock(String name, double initialPrice) {
     this.name = name;
     this.price = initialPrice;
 }

 public double getPrice() {
     return price;
 }

 public String getStockName() {
     return name;
 }

 @Override
 public void run() {
     Random rand = new Random();

     try {
         // Update price 5 times (no infinite loop)
         for (int i = 0; i < 5; i++) {
             double change = (rand.nextDouble() * 10) - 5; // price change between -5 and +5
             price += change;

             // Keep price positive
             price = Math.max(price, 1);

             System.out.println("[UPDATE] " + name + " new price: ₹" + String.format("%.2f", price));

             Thread.sleep(3000); // update every 3 seconds
         }

     } catch (InterruptedException e) {
         System.out.println(name + " price thread interrupted.");
     }
 }
}



public class StockMarketSimulation {

 public static void main(String[] args) throws InterruptedException {

     // Create stock threads
     Stock s1 = new Stock("TATA", 250.0);
     Stock s2 = new Stock("RELIANCE", 320.0);
     Stock s3 = new Stock("INFY", 150.0);

     // Start stock threads
     s1.start();
     s2.start();
     s3.start();

     // Main thread prints prices 6 times (not infinite)
     for (int i = 0; i < 6; i++) {
         System.out.println("\n------ CURRENT STOCK PRICES ------");
         System.out.println("TATA      : ₹" + String.format("%.2f", s1.getPrice()));
         System.out.println("RELIANCE  : ₹" + String.format("%.2f", s2.getPrice()));
         System.out.println("INFY      : ₹" + String.format("%.2f", s3.getPrice()));
         System.out.println("-----------------------------------");

         Thread.sleep(2000); // refresh every 2 seconds
     }

     // Wait for stock update threads to finish
     s1.join();
     s2.join();
     s3.join();

     System.out.println("\nStock Market Simulation Completed!");
 }
}
