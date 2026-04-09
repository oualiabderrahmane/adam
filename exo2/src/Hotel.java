import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hotel {
    private final String nom;
    private final List<Chambre> chambres;

    public Hotel(String nom) {
        this.nom = nom;
        this.chambres = new ArrayList<>();
    }

    public void ajouterChambre(Chambre chambre) {
        if (chambre == null) {
            System.out.println("Erreur : chambre invalide.");
            return;
        }

        chambres.add(chambre);
    }

    public Chambre chercherChambreParCode(String code) {
        for (Chambre chambre : chambres) {
            if (chambre.getCode().equals(code)) {
                return chambre;
            }
        }
        return null;
    }

    public boolean reserverChambre(String code, Personne personne) {
        Chambre chambre = chercherChambreParCode(code);
        if (chambre == null) {
            System.out.println("Aucune chambre avec le code " + code + ".");
            return false;
        }

        boolean reservee = chambre.ajouterOccupant(personne);
        if (reservee) {
            System.out.println(personne.getNom() + " a reserve la chambre " + chambre.getCode() + ".");
        }
        return reservee;
    }

    public boolean reserverPourCoupleMarie(Personne personne) {
        if (personne == null || !personne.estMarie()) {
            System.out.println("Reservation impossible : la personne n'est pas mariee.");
            return false;
        }

        Personne conjoint = personne.getConjoint();
        if (aDejaUneReservationDansHotel(personne) || aDejaUneReservationDansHotel(conjoint)) {
            System.out.println("Reservation impossible : le couple possede deja une reservation.");
            return false;
        }

        Chambre chambre = chercherChambreLibrePourCouple(TypeChambre.DOUBLE);
        if (chambre == null) {
            chambre = chercherChambreLibrePourCouple(TypeChambre.STANDARD);
        }

        if (chambre == null) {
            System.out.println(
                "Aucune chambre double ou standard libre n'est disponible pour le couple "
                    + personne.getNom() + " / " + conjoint.getNom() + "."
            );
            return false;
        }

        chambre.ajouterOccupant(personne);
        chambre.ajouterOccupant(conjoint);
        System.out.println(
            "Le couple " + personne.getNom() + " / " + conjoint.getNom()
                + " a reserve la chambre " + chambre.getCode() + " (" + chambre.getType() + ")."
        );
        return true;
    }

    private boolean aDejaUneReservationDansHotel(Personne personne) {
        for (Chambre chambre : chambres) {
            if (chambre.contient(personne)) {
                return true;
            }
        }
        return false;
    }

    private Chambre chercherChambreLibrePourCouple(TypeChambre type) {
        for (Chambre chambre : chambres) {
            if (chambre.getType() == type && chambre.convientPourCouple()) {
                return chambre;
            }
        }
        return null;
    }

    public String getNom() {
        return nom;
    }

    public List<Chambre> getChambres() {
        return Collections.unmodifiableList(chambres);
    }
}
