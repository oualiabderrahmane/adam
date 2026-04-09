public class App {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Bleu");
        hotel.ajouterChambre(FabriqueChambre.creerChambreDouble("D1"));
        hotel.ajouterChambre(FabriqueChambre.creerChambreStandard("S1"));

        AgentAccueil hamid = new AgentAccueil("Hamid", hotel);
        AgentAccueil raouf = new AgentAccueil("Raouf", hotel);

        Personne bahi = new Personne("bahi");
        Personne telissa = new Personne("telissa");
        Personne samir = new Personne("Samir");

        bahi.seMarier(telissa);

        raouf.reserverPourCoupleMarie(bahi);
        raouf.getListeClient();
        hamid.reserverChambre("S1", samir);
        hamid.reserverPourCoupleMarie(bahi);
        hamid.getListeClient();
    }
}
