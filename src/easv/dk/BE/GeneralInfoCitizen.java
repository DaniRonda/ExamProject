package easv.dk.BE;

public class GeneralInfoCitizen {
    private int infocitizen_id;
    private int generalinfo_id;
    private int citizen_id;

    public GeneralInfoCitizen(int generalinfo_id, int citizen_id) {
        this.generalinfo_id = generalinfo_id;
        this.citizen_id = citizen_id;
    }




    public int getInfocitizen_id() {
        return infocitizen_id;
    }

    public void setInfocitizen_id(int infocitizen_id) {
        this.infocitizen_id = infocitizen_id;
    }

    public int getGeneralinfo_id() {
        return generalinfo_id;
    }

    public void setGeneralinfo_id(int generalinfo_id) {
        this.generalinfo_id = generalinfo_id;
    }

    public int getCitizen_id() {
        return citizen_id;
    }

    public void setCitizen_id(int citizen_id) {
        this.citizen_id = citizen_id;
    }
}
