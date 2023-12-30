package Role;

import java.util.List;

class Main_System {
    public static void main(String[] args) {
        DataStorage dataStorage = new DataStorage();
//        DataStorage dataStorageMedInterne = new DataStorage() ;
//        DataStorage dataStorageChirurgie = new DataStorage();
//        DataStorage dataStorageObstetrique = new DataStorage();
        Receptionist receptionist = new Receptionist(dataStorage);
        receptionist.registerPatient();
        System.out.println("\nPatient Database:");
        List<Patient> patientDatabase = dataStorage.getPatients();
        CSVWriter.writePatientToCSVs(patientDatabase, "Patient_DataBase.csv","DatabaseMedInterne.csv", "DatabaseChirurgie.csv", "DatabaseObstertrique.csv");
    }
}
