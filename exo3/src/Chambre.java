import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chambre {
    private final String code;
    private final int nbPlaces;
    private final TypeChambre type;
    private final List<Lit> lits;
    private final List<Personne> occupants;

    public Chambre(String code, int nbPlaces, TypeChambre type, List<Lit> lits) {
        if (nbPlaces <= 0 || nbPlaces > 4) {
            throw new IllegalArgumentException("Le nombre de places doit etre compris entre 1 et 4.");
        }

        this.code = code;
        this.nbPlaces = nbPlaces;
        this.type = type;
        this.lits = new ArrayList<>(lits);
        this.occupants = new ArrayList<>();

        verifierContraintesStructure();
    }

    private void verifierContraintesStructure() {
        if (type == TypeChambre.DOUBLE && lits.size() != 2) {
            throw new IllegalArgumentException("Une chambre double doit contenir exactement 2 lits separes.");
        }

        if (type == TypeChambre.STANDARD && lits.size() != 4) {
            throw new IllegalArgumentException("Une chambre standard doit contenir exactement 4 lits.");
        }
    }

    public String getCode() {
        return code;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public TypeChambre getType() {
        return type;
    }

    public int getPlacesLibres() {
        return nbPlaces - occupants.size();
    }

    public boolean estComplete() {
        return getPlacesLibres() == 0;
    }

    public boolean convientPourCouple() {
        return (type == TypeChambre.DOUBLE || type == TypeChambre.STANDARD) && getPlacesLibres() >= 2;
    }

    public boolean contient(Personne personne) {
        return occupants.contains(personne);
    }

    public List<Personne> getOccupants() {
        return Collections.unmodifiableList(occupants);
    }

    public boolean ajouterOccupant(Personne personne) {
        if (personne == null) {
            System.out.println("Erreur : personne invalide.");
            return false;
        }

        if (contient(personne)) {
            System.out.println("Erreur : " + personne.getNom() + " a deja reserve la chambre " + code + ".");
            return false;
        }

        if (estComplete()) {
            System.out.println("La chambre " + code + " est complete.");
            return false;
        }

        occupants.add(personne);
        personne.ajouterReservation(this);
        return true;
    }
}
