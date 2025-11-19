//Map1 HashMap
package week3;

import java.util.HashMap;

public class DoctorDirectory {
    public static void main(String[] args) {
        HashMap<Integer, String> doctorMap = new HashMap<>();

        doctorMap.put(101, "Dr. Smith");
        doctorMap.put(102, "Dr. Johnson");
        doctorMap.put(103, "Dr. Williams");

        System.out.println("Doctor Directory:");
        for (Integer id : doctorMap.keySet()) {
            System.out.println("Doctor ID: " + id + ", Name: " + doctorMap.get(id));
        }

        int doctorIdToCheck = 102;
        if (doctorMap.containsKey(doctorIdToCheck)) {
            String doctorName = doctorMap.get(doctorIdToCheck);
            System.out.println("\nDoctor with ID " + doctorIdToCheck + " exists: " + doctorName);
        } else {
            System.out.println("\nDoctor with ID " + doctorIdToCheck + " does not exist.");
        }
    }
}

