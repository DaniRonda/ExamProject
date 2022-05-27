package easv.dk.BE;

public class HealthDiagnose {
    private  int ID;
    private String profnote;
    private String currentass;
    private String anticipatedlvl;
    private String followupdate;
    private String observenote;
    private int citizen;
    private int healthtype;

    public HealthDiagnose(int ID, String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int citizen, int healthtype) {
        this.ID = ID;
        this.profnote = profnote;
        this.currentass = currentass;
        this.anticipatedlvl = anticipatedlvl;
        this.followupdate = followupdate;
        this.observenote = observenote;
        this.citizen = citizen;
        this.healthtype = healthtype;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProfnote() {
        return profnote;
    }

    public void setProfnote(String profnote) {
        this.profnote = profnote;
    }

    public String getCurrentass() {
        return currentass;
    }

    public void setCurrentass(String currentass) {
        this.currentass = currentass;
    }

    public String getAnticipatedlvl() {
        return anticipatedlvl;
    }

    public void setAnticipatedlvl(String anticipatedlvl) {
        this.anticipatedlvl = anticipatedlvl;
    }

    public String getFollowupdate() {
        return followupdate;
    }

    public void setFollowupdate(String followupdate) {
        this.followupdate = followupdate;
    }

    public String getObservenote() {
        return observenote;
    }

    public void setObservenote(String observenote) {
        this.observenote = observenote;
    }

    public int getCitizen() {
        return citizen;
    }

    public void setCitizen(int citizen) {
        this.citizen = citizen;
    }

    public int getHealthtype() {
        return healthtype;
    }

    public void setHealthtype(int healthtype) {
        this.healthtype = healthtype;
    }

    @Override
    public String toString() {
        return "HealthDiagnose{" +
                "ID=" + ID +
                ", profnote='" + profnote + '\'' +
                ", currentass='" + currentass + '\'' +
                ", anticipatedlvl='" + anticipatedlvl + '\'' +
                ", followupdate='" + followupdate + '\'' +
                ", observenote='" + observenote + '\'' +
                ", citizen=" + citizen +
                ", healthtype=" + healthtype +
                '}';
    }
}
