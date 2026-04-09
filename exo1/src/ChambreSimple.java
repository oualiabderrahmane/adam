
public class ChambreSimple extends Chambre {

    public ChambreSimple(String code) {
        super(code);
        this.nbPlaces = 4;
        Lit lit1 = new SimpleLit();
        Lit lit2 = new SimpleLit();
        Lit lit3 = new SimpleLit();
        Lit lit4 = new SimpleLit();
        Lit[] lits = new Lit[4];
        lits[0] = lit1;
        lits[1] = lit2;
        lits[2] = lit3;
        lits[3] = lit4;
        this.SetLits(lits);
    }
    public Boolean isAvalable() {
        for (Lit lit : this.getLits()) {
            if (!((SimpleLit) lit).isOccupied()) {
                return true;   
            }
        }
        return false;
    }

    public boolean reserver(Personne p) {
        for (Lit lit : this.getLits()) {
            if (!((SimpleLit) lit).isOccupied()) {
                ((SimpleLit) lit).setisOccupied(true);
                this.personnes.add(p);
                this.nbPlaces--;
                System.out.println("Le lit " + ((SimpleLit) lit).getCode() + " de la chambre " + this.code + " a été réservé par " + p.getNom() + ".");
                return true;   
            }
        }
        System.out.println("La chambre " + this.code + " n'est pas disponible.");
        return false;
    }
   
}
