package eu.asgardschmiede.io.json;

import java.util.Arrays;

public class Held {
    private String vorname;
    private String nachname;
    private String[] stadt;
    private int alter;
    private boolean raucher;

    public Held(){

    }

    public Held(String vorname, String nachname, String[] stadt, int alter, boolean raucher) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.stadt = stadt;
        this.alter = alter;
        this.raucher = raucher;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String[] getStadt() {
        return stadt;
    }

    public void setStadt(String[] stadt) {
        this.stadt = stadt;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public boolean isRaucher() {
        return raucher;
    }

    public void setRaucher(boolean raucher) {
        this.raucher = raucher;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Held{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", stadt=").append(Arrays.toString(stadt));
        sb.append(", alter=").append(alter);
        sb.append(", raucher=").append(raucher);
        sb.append('}');
        return sb.toString();
    }
}
