//Map2 LinkedHashMap
package week3;

import java.util.LinkedHashMap;
import java.util.Map;

public class PatientRegistry {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> patientMap = new LinkedHashMap<>();

        patientMap.put(101, "John Doe");
        patientMap.put(102, "Jane Smith");
        patientMap.put(103, "Michael Johnson");

        System.out.println("Patient Registry (Insertion Order):");
        for (Map.Entry<Integer, String> entry : patientMap.entrySet()) {
            System.out.println("Patient ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        int patientIdToRemove = 102;
        patientMap.remove(patientIdToRemove);
        System.out.println("\nPatient with ID " + patientIdToRemove + " has been removed.");

        System.out.println("\nUpdated Patient Registry:");
        for (Map.Entry<Integer, String> entry : patientMap.entrySet()) {
            System.out.println("Patient ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

