package easv.dk.BE;

import java.util.Date;

public class Citizen {
    private String firstName;
    private String lastName;
    private String adress;
    private java.util.Date birthDate;
    private int phoneNumber;
    private boolean isTemplate;
    private int schoolID;
    private int ID;


    public Citizen(String firstName, String lastName, String adress, Date birthDate, int phoneNumber, boolean isTemplate, int schoolID, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

}
