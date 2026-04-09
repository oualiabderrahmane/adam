public class App {
    public static void main(String[] args){
        Personne p1 = new Personne("Alice");
        Personne p2 = new Personne("Bob");
        Personne p3 = new Personne("Charlie");
        Personne p4 = new Personne("David");
        Personne p5 = new Personne("Eve");
        ChambreSimple cs1 = new ChambreSimple("CS1");

        p1.reserverChambreSimple(cs1);
        p2.reserverChambreSimple(cs1);
        p3.reserverChambreSimple(cs1);
        p4.reserverChambreSimple(cs1);
        p5.reserverChambreSimple(cs1);
    }
}
