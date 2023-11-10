package org.example;

public class Main {

    /**
     *tep 1: Create a class 'Medication' with the methods 'getName', 'getPrice', and 'getAvailability'.
     * Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name
     * as the key and its information as the value.
     * Step 3: Create a method 'int getCount()' in the class Pharmacy. This method should return
     * the number of Medications in the pharmacy.
     * Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy. This
     * method should insert the Medication indexed by its name into the pharmacy.
     * Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy.
     * This method should return the requested Medication with this name. If no Medication with this name is found, the method should return null.
     * Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy.
     * This method should delete the Medication with this name.
     * Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.
     *
     */



    public static void main(String[] args) {

        Apotheke apotheke = new Apotheke();


        Medication paracetamol = new Medication("Paracetamol", 5.33, true);
        Medication aspirin = new Medication("Aspirin", 7.50, true);

        apotheke.save(paracetamol);
        apotheke.save(aspirin);
        System.out.println(apotheke);

        System.out.println(apotheke.getCount());

        System.out.println(apotheke.findMedication("Aspirin"));

//        apotheke.deleteMedication("Aspirin");
//        System.out.println(apotheke.getCount());

        //apotheke.showAllMedication();

        apotheke.printMedications();



    }
}