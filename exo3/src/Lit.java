public class Lit {
    private final String idLit;

    public Lit(String idLit) {
        this.idLit = idLit;
    }

    public String getIdLit() {
        return idLit;
    }

    @Override
    public String toString() {
        return "Lit[" + idLit + "]";
    }
}
