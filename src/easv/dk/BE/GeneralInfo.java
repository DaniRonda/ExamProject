package easv.dk.BE;

public class GeneralInfo {
    private int ID;
    private String coping;
    private String motevation;
    private String resources;
    private String roles;
    private String habits;
    private String education;
    private String lifestory;
    private String healthinfo;
    private String aid;
    private String furnishing;
    private String network;

    public GeneralInfo(int id, String coping, String motevation, String resources, String roles, String habits, String education, String lifestory, String healthinfo, String aid, String furnishing, String network) {
        ID = id;
        this.coping = coping;
        this.motevation = motevation;
        this.resources = resources;
        this.roles = roles;
        this.habits = habits;
        this.education = education;
        this.lifestory = lifestory;
        this.healthinfo = healthinfo;
        this.aid = aid;
        this.furnishing = furnishing;
        this.network = network;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCoping() {
        return coping;
    }

    public void setCoping(String coping) {
        this.coping = coping;
    }

    public String getMotevation() {
        return motevation;
    }

    public void setMotevation(String motevation) {
        this.motevation = motevation;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getHabits() {
        return habits;
    }

    public void setHabits(String habits) {
        this.habits = habits;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getLifestory() {
        return lifestory;
    }

    public void setLifestory(String lifestory) {
        this.lifestory = lifestory;
    }

    public String getHealthinfo() {
        return healthinfo;
    }

    public void setHealthinfo(String healthinfo) {
        this.healthinfo = healthinfo;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getFurnishing() {
        return furnishing;
    }

    public void setFurnishing(String furnishing) {
        this.furnishing = furnishing;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "GeneralInfo{" +
                "ID=" + ID +
                ", coping='" + coping + '\'' +
                ", motevation='" + motevation + '\'' +
                ", resources='" + resources + '\'' +
                ", roles='" + roles + '\'' +
                ", habits='" + habits + '\'' +
                ", education='" + education + '\'' +
                ", lifestory='" + lifestory + '\'' +
                ", healthinfo='" + healthinfo + '\'' +
                ", aid='" + aid + '\'' +
                ", furnishing='" + furnishing + '\'' +
                ", network='" + network + '\'' +
                '}';
    }
}
