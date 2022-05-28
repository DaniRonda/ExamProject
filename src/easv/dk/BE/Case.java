package easv.dk.BE;

public class Case {
    private int ID;
    private String casetext;
    private int citizen;

    public Case(int ID, String casetext, int citizen) {
        this.ID = ID;
        this.casetext = casetext;
        this.citizen = citizen;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCasetext() {
        return casetext;
    }

    public void setCasetext(String casetext) {
        this.casetext = casetext;
    }

    public int getCitizen() {
        return citizen;
    }

    public void setCitizen(int citizen) {
        this.citizen = citizen;
    }

    @Override
    public String toString() {
        return "Case{" +
                "ID=" + ID +
                ", casetext='" + casetext + '\'' +
                ", citizen=" + citizen +
                '}';
    }
}
