package Role;

import java.util.List;
import java.util.Scanner;

public class Receptionist {

    private final DataStorage dataStorage;

    public Receptionist(DataStorage dataStorage){
        this.dataStorage = dataStorage;
    }

    public void registerPatient() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter patient details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Select diagnosis type: ");
        System.out.println("1. Chirurgie");
        System.out.println("2. Medicine Interne");
        System.out.println("3. Obstetrique");
        int choice = scanner.nextInt();

        String diagnosis = "";
        switch (choice) {
            case 1:
                diagnosis = "Chirurgie";
                break;
            case 2:
                diagnosis = "Medicine Interne";
                break;
            case 3:
                diagnosis = "Obstetrique";
                break;
            default:
                System.out.println("Invalid choice");
        }

        Patient patient = new Patient(name, age, address, phoneNumber);
        patient.setDiagnosis(diagnosis);
        dataStorage.addPatient(patient);

        System.out.println("src.Role.Patient registered successfully!");
    }

    public List<Patient> getPatientDatabase() {
        return dataStorage.getPatients();
    }
}
