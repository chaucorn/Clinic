package Role;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class CSVWriter {
    public static void writePatientToCSV (List<Patient> patients, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)){
            writer.append("Name , Age, Address, Phone Number, Diagnosis\n");

            for (Patient patient : patients){
                writer.append(String.format("%s, %s, %s, %s, %s\n", patient.getName(), patient.getAge(), patient.getAddress(), patient.getPhoneNumber(), patient.getDiagnosis()));
            }
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
            }
    }
}
