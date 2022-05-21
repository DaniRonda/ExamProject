package easv.dk.BE;

public class CitizenStudent {
    private int id;
    private int studentID;
    private int citizenID;

    public CitizenStudent(int citizenID, int studentID) {
        this.citizenID = citizenID;
        this.studentID = studentID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(int citizenID) {
        this.citizenID = citizenID;
    }
}

