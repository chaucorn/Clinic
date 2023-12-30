package Role;
import java.util.UUID;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Patient {
    private final String patientId;
    private final String name;
    private final String familyName;
    private final int age;
    private final String address;
    private final String phoneNumber;
    private final Date dateOfBirth;
    private String diagnosis;

    public Patient(String name, String familyName, int age, String dateOfBirth, String address, String phoneNumber) {
        this.familyName = familyName;
        this.patientId = generateUniqueId();
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = parseDateOfBirth(String.valueOf(dateOfBirth));
    }
    private String generateUniqueId() {
        return UUID.randomUUID().toString();
    }
    public String getPatientId() {
        return patientId;
    }

    private Date parseDateOfBirth(String dateOfBirth) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(dateOfBirth);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date of birth format. Use yyyy-MM-dd.", e);
        }
    }
    public static String formatToMonthDayYear(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy");
        return dateFormat.format(date);
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return formatToMonthDayYear(dateOfBirth);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}


