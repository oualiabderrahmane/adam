package partie3;


public class main {
    public static void main(String[] args) {
        projet p = new projet(" web");

        manager m = new manager("So");
        m.assignerProjet(p);

        employe e = new employe("Lu");
        e.travailleSur(p);

        System.out.println("vrification superv");
        e.estEmployeDe(m);

        manager m2 = new manager("Marc");
        e.estEmployeDe(m2);
    }
}