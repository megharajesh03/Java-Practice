//Map3 TreeMap

package week3;

import java.util.TreeMap;

public class AppointmentScheduler {
    public static void main(String[] args) {
        TreeMap<String, String> appointments = new TreeMap<>();

        appointments.put("2025-11-20", "John Doe");
        appointments.put("2025-11-18", "Jane Smith");
        appointments.put("2025-11-19", "Michael Johnson");

        System.out.println("Appointments (Sorted by Date):");
        for (String date : appointments.keySet()) {
            System.out.println("Date: " + date + ", Patient: " + appointments.get(date));
        }

        System.out.println("\nFirst Appointment Date: " + appointments.firstKey());
        System.out.println("Last Appointment Date: " + appointments.lastKey());
    }
}

