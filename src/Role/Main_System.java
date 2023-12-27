package Role;

import java.util.List;

class Main_System {
    public static void main(String[] args) {
        DataStorage dataStorage = new DataStorage();
        Receptionist receptionist = new Receptionist(dataStorage);
        receptionist.registerPatient();
        System.out.println("\nPatient Database:");
        List<Patient> patientDatabase = dataStorage.getPatients();
        CSVWriter.writePatientToCSV(patientDatabase, "Patient_DataBase.csv");
    }
}
