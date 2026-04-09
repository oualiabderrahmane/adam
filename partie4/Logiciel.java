package partie4;

class Logiciel {
    private String nom;
    private String version;
    private String editeur;

    public Logiciel(String nom, String version, String editeur) {
        this.nom = nom;
        this.version = version;
        this.editeur = editeur;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
    public String getEditeur() { return editeur; }
    public void setEditeur(String editeur) { this.editeur = editeur; }

    @Override
    public String toString() {
        return "Logiciel{nom='" + nom + "', version='" + version + "', editeur='" + editeur + "'}";
    }
}
