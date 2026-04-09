package partie4;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Ordinateur extends Materiel {
    private int ramGo;
    private String processeur;
    private List<Composant> composants;
    private List<Logiciel> logicielsInstalle;

    public Ordinateur(String id, String marque, String modele, Date dateAchat,
                      int ramGo, String processeur) {
        super(id, marque, modele, dateAchat);
        this.ramGo = ramGo;
        this.processeur = processeur;
        this.composants = new ArrayList<>();
        this.logicielsInstalle = new ArrayList<>();
    }
    public boolean estInstalle(Logiciel l){
        return logicielsInstalle.contains(l);

    }

    public void supprimeOrdinateur(){
        composants.clear();
        System.out.println("toutes lordinateur et ces composantes sont detruits ");
    }


    public void ajouterComposant(String type, String reference, int capacite) {
        Composant c=new Composant(type,reference,capacite);
        if ( !composants.contains(c)) {
            composants.add(c);
        }
    }

    public void installerLogiciel(Logiciel l) {
        if ( l != null &&!logicielsInstalle.contains(l)) {
            logicielsInstalle.add(l);
        }
    }

    public int getRamGo() { return ramGo; }
    public void setRamGo(int ramGo) { this.ramGo = ramGo; }
    public String getProcesseur() { return processeur; }
    public void setProcesseur(String processeur) { this.processeur = processeur; }
    public List<Composant> getComposants() { return composants; }
    public List<Logiciel> getLogicielsInstalle() { return logicielsInstalle; }

    @Override
    public String toString() {
        return getId() + " " + getMarque() + " " + getModele() + " " + ramGo + " Ram " + processeur;
    }
}