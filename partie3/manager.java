/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partie3;
import java.util.ArrayList;

import java.util.List;
/**
 *
 * @author ilyes
 */
public class manager extends personne {
    private int nbrProjets;
    private List<projet> projets;

    public  manager(String nom){
        super(nom);
        this.projets = new ArrayList<>();
        this.nbrProjets = 0;
    }


    public void assignerProjet(projet projet){
        if ((nbrProjets<2)) {
            if((!projets.contains(projet))){
                nbrProjets++;
                projets.add(projet);
                System.out.println(projet.getNom() + " est assigne a  " + this.getNom());
            }
            else System.out.println("projet assigner deja");
        }
        else{
            System.out.println("ce manager est relier deja a deux projets");
        }
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
