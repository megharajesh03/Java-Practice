//Thread1
package week3;

public class FoodDeliveryApp {

    public static void main(String[] args) {

        // Thread 1 → Updates delivery status
        Thread statusUpdater = new Thread(() -> {
            String[] statuses = {
                "Order Received",
                "Preparing Food",
                "Out for Delivery",
                "Nearby",
                "Delivered"
            };

            try {
                for (String status : statuses) {
                    System.out.println("[STATUS] " + status);
                    Thread.sleep(5000); // wait 5 seconds
                }
            } catch (InterruptedException e) {
                System.out.println("Status thread interrupted.");
            }

        }, "StatusUpdater");


        // Thread 2 → Prints estimated delivery time every 3 seconds
        Thread etaPrinter = new Thread(() -> {

            int eta = 15;  // initial estimated time

            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("[ETA] Estimated delivery time: " + eta + " minutes");
                    eta -= 3;
                    Thread.sleep(3000); // wait 3 seconds
                }
            } catch (InterruptedException e) {
                System.out.println("ETA thread interrupted.");
            }

        }, "ETA_Printer");



        // Start both threads
        statusUpdater.start();
        etaPrinter.start();

        try {
            // Wait for both threads to finish before ending main
            statusUpdater.join();
            etaPrinter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFood Delivery Simulation Completed!");
    }
}

