package partie4;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        MiniOrm parc = new MiniOrm();

// Salles
        Salle s301 = new Salle("S301", "Informatique", 3);
        Salle s202 = new Salle("S202", "Direction", 2);
        parc.enregistrerSalle(s301);
        parc.enregistrerSalle(s202);

// Employés
        Employee omar = new Employee("E001", "Omar Belkacem");
        Employee karim = new Employee("E002", "Karim Hadji");
        Employee wassim = new Employee("E003", "Wassim Cherif");
        omar.ajouterSubordonne(karim);
        omar.ajouterSubordonne(wassim);
        parc.enregistrerEmployee(omar);
        parc.enregistrerEmployee(karim);
        parc.enregistrerEmployee(wassim);

// Matériels
        Ordinateur pcl = new Ordinateur("PC-001", "Dell", "Latitude 5540", new Date(), 32, "i7-13700H");
        pcl.ajouterComposant("RAM", "Kingston", 32);
        pcl.ajouterComposant("SSD", "Samsung", 1024);

        Imprimante impl = new Imprimante("IMP-001", "HP", "LaserJet Pro M404", new Date(), "Laser", "1200 dpi");

        parc.enregistrerMateriel(pcl);
        parc.enregistrerMateriel(impl);

// Affectations
        s301.ajouterMateriel(pcl);
        s301.ajouterMateriel(impl);

        parc.affecterMaterielAMployee(pcl, omar);
        parc.affecterMaterielAMployee(impl, karim);

// Logiciels
        Logiciel win11 = new Logiciel("Windows 11 Pro", "23H2", "Microsoft");
        Logiciel office = new Logiciel("Microsoft 365", "2024", "Microsoft");
        parc.enregistrerLogiciel(win11);
        parc.enregistrerLogiciel(office);

        parc.installerLogicielSurOrdinateur(win11, pcl);
        parc.installerLogicielSurOrdinateur(office, pcl);

// Tests et affichages
        System.out.println("Matériels dans la salle S301 :");
        parc.getMaterielsDansSalle(s301).forEach(System.out::println);

        System.out.println("\nMatériels assignés à Omar :");
        parc.getMaterielsAssignesA(omar).forEach(System.out::println);

        pcl.verifierEtat();
        omar.afficherSubordonnes();
        parc.afficherEtatGlobal();
    }
}