public class Personne {
    private String nom;
    private int nbRes = 0;
    private Chambre[] lesChambres;
    private Boolean ismarrierd = false;

    public Personne(String nom){
        lesChambres = new Chambre[10];
        this.nom = nom;
    }

    public Personne me(){
        return this;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNbRes() {
        return nbRes;
    }
    public void setNbRes(int nbRes) {
        this.nbRes = nbRes;
    }
    public Chambre[] getLesChambres() {
        return lesChambres;
    }
    public void setLesChambres(Chambre[] lesChambres) {
        this.lesChambres = lesChambres;
    }

    public Boolean reserverChambreDouble(Chambre c){
        lesChambres[nbRes] = c;
        nbRes++;
        return c.reserver(this.me());
    }

    public Boolean reserverChambreSimple(Chambre c){
        lesChambres[nbRes] = c;
        nbRes++;
        return c.reserver(this.me());
    }

    public Boolean isIsmarrierd() {
        return ismarrierd;
    }
    public void setIsmarrierd(Boolean ismarrierd) {
        this.ismarrierd = ismarrierd;
    }
    public boolean marier(Personne p) {
        if (this.isIsmarrierd() || p.isIsmarrierd()) {
            return false;
        }
        this.setIsmarrierd(true);
        p.setIsmarrierd(true);
        return true;
    }
   
}
