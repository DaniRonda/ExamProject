package easv.dk.GUI.Controller;

import easv.dk.BE.Citizen;

public final class CitizenHolder {
    private Citizen citizen;
    private final static CitizenHolder INSTANCE = new CitizenHolder();

    private CitizenHolder() {}

    public static CitizenHolder getInstance() {
        return INSTANCE;
    }

    public void setCitizen(Citizen u) {
        this.citizen = u;
    }

    public Citizen getCitizen() {
        return this.citizen;
    }






}
