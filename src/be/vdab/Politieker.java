package be.vdab;

public class Politieker extends Persoon {
    private PolitiekePartij politiekePartij;

    public Politieker(String voornaam, String familienaam, PolitiekePartij politiekePartij) {
        super(voornaam, familienaam);
        setPolitiekePartij(politiekePartij);
    }

    public final void setPolitiekePartij(PolitiekePartij politiekePartij) {
        this.politiekePartij = politiekePartij;
    }

    public PolitiekePartij getPolitiekePartij() {
        return politiekePartij;
    }

    @Override
    public String toString(){
        return getNaam()+" "+politiekePartij.getNaam()+" "+politiekePartij.getAantalLeden();
    }

}
