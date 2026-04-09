package partie4;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Imprimante extends Materiel {
    private String type;
    private String resolution;

    public Imprimante(String id, String marque, String modele, Date dateAchat,
                      String type, String resolution) {
        super(id, marque, modele, dateAchat);
        this.type = type;
        this.resolution = resolution;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }

    @Override
    public String toString() {
        return getId() + " " + getMarque() + " " + getModele() + " " + resolution + " " + type;
    }
}

