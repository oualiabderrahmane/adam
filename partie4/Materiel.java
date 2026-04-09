package partie4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

abstract class Materiel {
    private String id;
    private String marque;
    private String modele;
    private Date dateAchat;
    private boolean bonEtat;

    public Materiel(String id, String marque, String modele, Date dateAchat) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
        this.bonEtat = true;

    }


    public boolean verifierEtat(){
        if (bonEtat) {System.out.println("letat de "+this.id+" toutes les composantes on bon etat ");
        return true;}
        else
            System.out.println("toutes les composantes on bon etat ");
            return false;

    }



    public void setBonEtat(boolean bonEtat) {
        this.bonEtat = bonEtat;
    }


    @Override
    public String toString() {
        return String.format("%s{id='%s', marque='%s', modele='%s', dateAchat=%s, bonEtat=%s}",
                getClass().getSimpleName(), id, marque, modele, dateAchat, bonEtat);
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }
    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }
    public Date getDateAchat() { return dateAchat; }
    public void setDateAchat(Date dateAchat) { this.dateAchat = dateAchat;  }

}
