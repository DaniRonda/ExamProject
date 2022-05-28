package easv.dk.BE;

public class FunctionalDiagnose {
    private  int ID;
    private String profnote;
    private String currentass;
    private String anticipatedlvl;
    private String followupdate;
    private String observenote;
    private int currlvl;
    private int expectedlvl;
    private String wishes;
    private int citizen;

    public FunctionalDiagnose(int ID, String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int currlvl, int expectedlvl, String wishes, int citizen) {
        this.ID = ID;
        this.profnote = profnote;
        this.currentass = currentass;
        this.anticipatedlvl = anticipatedlvl;
        this.followupdate = followupdate;
        this.observenote = observenote;
        this.currlvl = currlvl;
        this.expectedlvl = expectedlvl;
        this.wishes = wishes;
        this.citizen = citizen;
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

    public int getCurrlvl() {
        return currlvl;
    }

    public void setCurrlvl(int currlvl) {
        this.currlvl = currlvl;
    }

    public int getExpectedlvl() {
        return expectedlvl;
    }

    public void setExpectedlvl(int expectedlvl) {
        this.expectedlvl = expectedlvl;
    }

    public String getWishes() {
        return wishes;
    }

    public void setWishes(String wishes) {
        this.wishes = wishes;
    }


    public int getCitizen() {
        return citizen;
    }

    public void setCitizen(int citizen) {
        this.citizen = citizen;
    }

    @Override
    public String toString() {
        return "FunctionalDiagnose{" +
                "ID=" + ID +
                ", profnote='" + profnote + '\'' +
                ", currentass='" + currentass + '\'' +
                ", anticipatedlvl='" + anticipatedlvl + '\'' +
                ", followupdate='" + followupdate + '\'' +
                ", observenote='" + observenote + '\'' +
                ", currlvl=" + currlvl +
                ", expectedlvl=" + expectedlvl +
                ", wishes='" + wishes + '\'' +
                ", citizen=" + citizen +
                '}';
    }
}
