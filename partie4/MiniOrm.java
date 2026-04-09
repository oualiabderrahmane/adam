package partie4;

import java.util.ArrayList;
import java.util.List;

public class MiniOrm {
    private List<Materiel> tousLesMateriels = new ArrayList<>();
    private List<Employee> tousLesEmployees = new ArrayList<>();
    private List<Salle> toutesLesSalles = new ArrayList<>();
    private List<Logiciel> tousLesLogiciels = new ArrayList<>();


    public void enregistrerMateriel(Materiel m) {
        if (!tousLesMateriels.contains(m)){
            tousLesMateriels.add(m);
        }
    }



    public void enregistrerEmployee(Employee e) {
        if (!tousLesEmployees.contains(e)){
            tousLesEmployees.add(e);
        }
    }


    public void enregistrerSalle(Salle s) {
        if (!toutesLesSalles.contains(s)){
            toutesLesSalles.add(s);
        }
    }


    public void enregistrerLogiciel(Logiciel l) {
        if (!tousLesLogiciels.contains(l)){
            tousLesLogiciels.add(l);
        }
    }


    public List<Materiel> getMaterielsDansSalle(Salle s) {

        return s.listeMateriels();
    }

    public List<Materiel> getMaterielsAssignesA(Employee e) {
        return e.getMaterielsAssigne();

    }

    public List<Ordinateur> getOrdinateursAvecLogiciel(Logiciel l) {
        List<Ordinateur> ordinateurs=new ArrayList<>();
        Ordinateur ordinateur1;
        for (Materiel m:tousLesMateriels){
            if (m instanceof Ordinateur && ((Ordinateur) m).estInstalle(l)){
                ordinateur1 = (Ordinateur) m;
                ordinateurs.add(ordinateur1);
            }
        }
        return ordinateurs;
    }


    public void affecterMaterielAMployee(Materiel m, Employee e) {
        e.affecterMateriel(m);
    }
    public void installerLogicielSurOrdinateur(Logiciel l, Ordinateur o) {
        o.installerLogiciel(l);
    }
    public void afficherEtatGlobal() {
        int o=0;
        int i=0;
        int l=0;
        for (Materiel m:tousLesMateriels){
            if(m instanceof Ordinateur) {o++;l+=((Ordinateur) m).getLogicielsInstalle().size();}
            else i++;}
        System.out.println("letat globale du parc :");
        System.out.println(toutesLesSalles.size()+" salles actives ");
        System.out.println(tousLesEmployees.size()+" employes enregistres ");
        System.out.println(tousLesMateriels.size()+" materiels actifs ("+o+" ordinateurs et "+i+" imprimantes )");
        System.out.println(l+" logicieles installes sur "+o+" ordinateurs");
    }
}