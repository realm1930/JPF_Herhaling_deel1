package be.vdab;

public class PersoonMain {
    public static void main(String[] args) {
        var polleke = new Persoon("Pol","Polsen");
        System.out.println(polleke);
        var groen = new PolitiekePartij("Groen",500);
        System.out.println(groen);
        var joske = new Politieker("Jos", "Joskens",groen);
        System.out.println(joske);

    }
}
