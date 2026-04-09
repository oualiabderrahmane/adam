public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Bleu");

        hotel.ajouterChambre(FabriqueChambre.creerChambreDouble("D1"));
        hotel.ajouterChambre(FabriqueChambre.creerChambreStandard("S1"));

        Personne telissa = new Personne("telissa");
        Personne bahi = new Personne("bahi");
        Personne gtaya = new Personne("Gtaya");
        Personne jawed = new Personne("Jawed");
        Personne moha = new Personne("lm");
        Personne sara = new Personne("Sara");
        Personne yacine = new Personne("Yacine");

        telissa.seMarier(bahi);
        jawed.seMarier(moha);
        sara.seMarier(yacine);

        hotel.reserverPourCoupleMarie(telissa);
        hotel.reserverChambre("S1", gtaya);
        hotel.reserverPourCoupleMarie(jawed);
        hotel.reserverPourCoupleMarie(sara);

        System.out.println("\nEtat final des reservations :");
        for (Chambre chambre : hotel.getChambres()) {
            System.out.println("Chambre " + chambre.getCode() + " - " + chambre.getType());
            for (Personne occupant : chambre.getOccupants()) {
                System.out.println("- " + occupant.getNom());
            }
        }
    }
}
