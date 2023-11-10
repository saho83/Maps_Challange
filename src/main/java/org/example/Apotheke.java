package org.example;

import java.util.HashMap;
import java.util.Map;

public class Apotheke {



   Map<String,Medication> medicationMap = new HashMap<>();



    // getter
    public int getCount() {
        return medicationMap.size();
    }

    //methods

    // method save medication
    public void save(Medication medication) {
        medicationMap.put(medication.getName(), medication);
    }

    // method find medication
    public Medication findMedication(String medication) {
            return medicationMap.get(medication);
    }

    // method delete medication
    public void deleteMedication(String medication) {
        medicationMap.remove(medication);
    }

    // method show all medication
    public void showAllMedication() {
        System.out.println("List of all medikation: " + medicationMap);
    }

    public void printMedications() {
        for (String name : medicationMap.keySet()) {
            Medication medication = medicationMap.get(name);
            System.out.println(
                    "name: " + medication.getName() +
                            ", price: " + medication.getPrice() +
                            ", availability: " + medication.isAvailability());
        }
    }


    // toString
    @Override
    public String toString() {
        return "Apotheke{" +
                "medicationMap=" + medicationMap +
                '}';
    }
}
