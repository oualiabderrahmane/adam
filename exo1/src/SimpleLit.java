public class SimpleLit extends Lit {

    private Boolean isOccupied = false;
    public static int count = 0;

    public SimpleLit() {
        super("lit" + count);
        count++;
    }

    public Boolean isOccupied() {
        return isOccupied;
    }   
    public void setisOccupied(Boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
    public String getCode() {
        return this.idLit;
    }
    
}
