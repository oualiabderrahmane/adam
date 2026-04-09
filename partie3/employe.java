package partie3;
import java.util.ArrayList;
import java.util.List;


public class employe extends personne{
    private int nbrProjets;
    private List<projet> projets;

    public employe(String nom){
        super(nom);
        this.projets = new ArrayList<>();
        this.nbrProjets = 0;
        
    }


    public void travailleSur(projet projet){
        if (!projets.contains(projet)){
            projets.add(projet);
            System.out.println(this.getNom() + " maintenant travaille Sur " + projet.getNom());
        }
    }


    public boolean estEmployeDe(manager m){
        List<projet> mangerProjet= new ArrayList<>();
        mangerProjet=m.getprojets();
        for (projet p:mangerProjet){
            if (projets.contains(p)){
                System.out.println(" le personne "+this.getNom()+" est deja un client de "+m.getNom());
                return true;
            }
        }
        System.out.println(" le manager "+m.getNom()+" ne supervise pas  "+this.getNom());

        return false;
    }


    public List<projet> getprojets(){
        return this.projets;
    }


    public String getNom() {
        return super.getNom();
    }

    public int getNbrProjets() {
        return nbrProjets;
    }



    
}
