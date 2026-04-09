import java.util.ArrayList;
public abstract class Chambre {
    protected String code;
    protected int nbPlaces;
    // protected String type;
    protected Lit[] lits;
    protected Boolean available;
    protected ArrayList<Personne> personnes = new ArrayList<Personne>();
 
    public Chambre(String code) {
        this.code = code;   
    }
    
    public void setIsAvalable(Boolean available) {
        this.available = available;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    public int getNbPlaces() {
        return nbPlaces;
    }
    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }
    public boolean isAvailable() {
        return available;
    }
    public void SetLits(Lit[] lits) {
        this.lits = lits;
    }
    public Lit[] getLits() {
        return lits;    
    }
    public void setLits(Lit[] lits) {
        this.lits = lits;
    }

    public abstract boolean reserver(Personne p);

}
