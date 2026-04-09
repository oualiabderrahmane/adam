package partie4;

class Composant {
    private String type;
    private String reference;
    private int capacite;

    public Composant(String type, String reference, int capacite) {
        this.type = type;
        this.reference = reference;
        this.capacite = capacite;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }
    public int getCapacite() { return capacite; }
    public void setCapacite(int capacite) { this.capacite = capacite; }

    @Override
    public String toString() {
        return "Composant{type='" + type + "', reference='" + reference + "', capacite=" + capacite + '}';
    }
}