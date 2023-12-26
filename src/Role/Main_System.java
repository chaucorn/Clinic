package Role;

import java.util.List;

class Main_System {
    public static void main(String[] args) {
        DataStorage dataStorage = new DataStorage();
        Receptionist receptionist = new Receptionist(dataStorage);
        receptionist.registerPatient();
        System.out.println("\nPatient Database:");
        List<Patient> patientDatabase = dataStorage.getPatients();
        for (Patient patient : patientDatabase) {
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Address: " + patient.getAddress());
            System.out.println("Phone Number: " + patient.getPhoneNumber());
            System.out.println("Diagnosis: " + patient.getDiagnosis());
        }
    }
}
