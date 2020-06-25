package be.vdab;

public class Persoon {


    private String voornaam;
    private String familienaam;

    public Persoon(String voornaam, String familienaam) {
        setVoornaam(voornaam);
        setFamilienaam(familienaam);
    }

    public String getVoornaam() {
        return voornaam;
    }

    public final void setVoornaam(String voornaam) {
        if (voornaam != null) {
            this.voornaam = voornaam;
        }
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public final void setFamilienaam(String familienaam) {
        if (familienaam != null) {
            this.familienaam = familienaam;
        }
    }

    public String getNaam(){
        return voornaam + " " + familienaam;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "voornaam='" + voornaam + '\'' +
                ", familienaam='" + familienaam + '\'' +
                '}';
    }
}
