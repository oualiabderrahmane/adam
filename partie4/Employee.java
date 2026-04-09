package partie4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Employee {
    private String matricule;
    private String nomComplet;
    private Employee superviseur;
    private List<Employee> subordonnes;
    private List<Materiel> materielsAssigne;

    public Employee(String matricule, String nomComplet) {
        this.matricule = matricule;
        this.nomComplet = nomComplet;
        this.superviseur = null;
        this.subordonnes = new ArrayList<>();
        this.materielsAssigne = new ArrayList<>();
    }

    public void affecterMateriel(Materiel m) {
        if (m != null && !materielsAssigne.contains(m)) {
            materielsAssigne.add(m);
        }
    }
    public void afficherSubordonnes(){
        System.out.println("les subordonnes de "+this.getNomComplet());
        for (Employee e:subordonnes){
            System.out.println("-> "+e.nomComplet);
        }
    }

    public void retirerMateriel(Materiel m) {
        materielsAssigne.remove(m);
    }

    public void ajouterSubordonne(Employee e) {
        if (e != null && e != this && !subordonnes.contains(e)) {
            subordonnes.add(e);
            e.superviseur = this;
        }
    }

    public boolean estSupervisePar(Employee sup) {
        return superviseur != null && superviseur.equals(sup);
    }

    // Getters et setters
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }
    public String getNomComplet() { return nomComplet; }
    public void setNomComplet(String nomComplet) { this.nomComplet = nomComplet; }
    public Employee getSuperviseur() { return superviseur; }
    // Pour éviter de casser la relation, on préfère utiliser ajouterSubordonne, mais setter simple est fourni
    public void setSuperviseur(Employee superviseur) {
        this.superviseur = superviseur;
    }
    public List<Employee> getSubordonnes() { return subordonnes; }
    public List<Materiel> getMaterielsAssigne() { return materielsAssigne; }

    @Override
    public String toString() {
        return "matricule='" + matricule + "', nomComplet='" + nomComplet +
                "', superviseur=" + (superviseur != null ? superviseur.getMatricule() : "null") +
                ", subordonnes=" + subordonnes.size() +
                ", materielsAssigne=" + materielsAssigne.size() ;
    }
}