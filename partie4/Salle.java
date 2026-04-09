package partie4;

import java.util.ArrayList;
import java.util.List;

class Salle {
    private String codeSalle;
    private String nom;
    private int etage;
    private List<Materiel> materiels;

    public Salle(String codeSalle, String nom, int etage) {
        this.codeSalle = codeSalle;
        this.nom = nom;
        this.etage = etage;
        this.materiels = new ArrayList<>();
    }

    public void ajouterMateriel(Materiel m) {
        if (m != null && !materiels.contains(m)) {
            materiels.add(m);
        }
    }

    public void retirerMateriel(Materiel m) {
        materiels.remove(m);
    }


    public List<Materiel> listeMateriels(){
        return materiels;
    }



    public String getCodeSalle() { return codeSalle; }
    public void setCodeSalle(String codeSalle) { this.codeSalle = codeSalle; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public int getEtage() { return etage; }
    public void setEtage(int etage) { this.etage = etage; }
    public List<Materiel> getMateriels() { return materiels; }

    @Override
    public String toString() {
        return "Salle{codeSalle='" + codeSalle + "', nom='" + nom + "', etage=" + etage + ", materiels=" + materiels + '}';
    }
}