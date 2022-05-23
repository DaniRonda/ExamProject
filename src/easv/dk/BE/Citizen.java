package easv.dk.BE;

import java.util.Date;
import java.util.List;
import java.time.LocalDate;

public class Citizen {
    private String firstName;
    private String lastName;
    private String address;
    private java.util.Date birthDate;
    private int phoneNumber;
    private boolean isTemplate;
    private int schoolID;
    private int ID;
    private int studentCount = 0;
    private List<Student> studentsInCitizen;


    public Citizen(String firstName, String lastName, String address, Date birthDate, int phoneNumber, boolean isTemplate, int schoolID, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.isTemplate = isTemplate;
        this.schoolID = schoolID;
        this.ID = ID;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isTemplate() {
        return isTemplate;
    }

    public void setTemplate(boolean template) {
        isTemplate = template;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public List<Student> getStudentsInCitizen() {
        return studentsInCitizen;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void setStudentsInCitizen(List<Student> studentsInCitizen) {
        this.studentsInCitizen = studentsInCitizen;
    }

}
