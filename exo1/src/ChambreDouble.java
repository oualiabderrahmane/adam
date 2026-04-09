public class ChambreDouble extends Chambre {

    public ChambreDouble(String code, int nbPlaces) {
        super(code);
        this.nbPlaces = 2;
        Lit lit = new GrandLit();
        Lit[] lits = new Lit[1];
        lits[0] = lit;
        this.SetLits(lits);
        this.setIsAvalable(true);
    }

    public void addPersonne(Personne p) {
        this.personnes.add(p);
    }
    
    public boolean reserver(Personne p){
        if (this.isAvailable()) {
            this.setIsAvalable(false);
            this.addPersonne(p);
            System.out.println("La chambre " + this.code + " a été réservée par " + p.getNom() + ".");
            return true;
        }
        System.out.println("La chambre " + this.code + " n'est pas disponible.");
        return false;

    }
    
}
