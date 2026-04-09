import java.util.LinkedList;

public class ListeClients {
    private final LinkedList<Personne> clients;

    public ListeClients() {
        clients = new LinkedList<>();
    }

    public void ajouterClient(Personne newClient, String nomAgent) {
        if (!newClient.estClient(this, nomAgent)) {
            clients.add(newClient);
            System.out.println("- La personne \"" + newClient.getNom() + "\" est devenue client de l'agent \"" + nomAgent + "\".");
        }
    }

    public boolean contient(Personne personne) {
        return clients.contains(personne);
    }

    public boolean estVide() {
        return clients.isEmpty();
    }

    public LinkedList<Personne> getClients() {
        return new LinkedList<>(clients);
    }
}
