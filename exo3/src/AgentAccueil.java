public class AgentAccueil {
    private final String nom;
    private final Hotel hotel;
    private final ListeClients listeClient;

    public AgentAccueil(String nom, Hotel hotel) {
        this.nom = nom;
        this.hotel = hotel;
        this.listeClient = new ListeClients();
    }

    public boolean reserverChambre(String code, Personne personne) {
        boolean reservee = hotel.reserverChambre(code, personne);
        if (reservee) {
            listeClient.ajouterClient(personne, nom);
        }
        return reservee;
    }

    public boolean reserverPourCoupleMarie(Personne personne) {
        boolean reservee = hotel.reserverPourCoupleMarie(personne);
        if (reservee) {
            listeClient.ajouterClient(personne, nom);
            listeClient.ajouterClient(personne.getConjoint(), nom);
        }
        return reservee;
    }

    public void getListeClient() {
        if (listeClient.estVide()) {
            System.out.println("- La liste de client de l'agent \"" + nom + "\" est vide.");
            return;
        }

        System.out.println("- Liste des clients de l'agent \"" + nom + "\" :");
        for (Personne client : listeClient.getClients()) {
            System.out.println("  - " + client.getNom());
        }
    }
}
