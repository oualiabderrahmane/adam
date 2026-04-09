import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Personne {
    private final String nom;
    private final List<Chambre> chambresReservees;
    private Personne conjoint;

    public Personne(String nom) {
        this.nom = nom;
        this.chambresReservees = new ArrayList<>();
    }
    public void ajouterReservation(Chambre chambre) {
        if (chambre != null && !chambresReservees.contains(chambre)) {
            chambresReservees.add(chambre);
        }
    }

    public List<Chambre> getChambresReservees() {
        return Collections.unmodifiableList(chambresReservees);
    }

    public void seMarier(Personne personne) {
        if (personne == null || personne == this) {
            System.out.println("Mariage invalide.");
            return;
        }

        if (conjoint == null && personne.conjoint == null) {
            conjoint = personne;
            personne.conjoint = this;
            System.out.println(nom + " est marie avec " + personne.nom + ".");
            return;
        }

        System.out.println("L'un des deux est deja marie.");
    }

    public boolean estMarie() {
        return conjoint != null;
    }

    public String getNom() {
        return nom;
    }

    public Personne getConjoint() {
        return conjoint;
    }

    @Override
    public String toString() {
        return nom;
    }
}
