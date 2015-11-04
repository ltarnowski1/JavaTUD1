
public class Miasto {

    private int id_Miasto;
    private String Nazwa;

    public Miasto() {
    }

    public Miasto(String Nazwa) {
        super();
        this.Nazwa = Nazwa;
    }
    public int getId_Miasto() { return id_Miasto; }
    public void setId_Miasto(int id_Miasto) {
        this.id_Miasto = id_Miasto;
    }
    public String getNazwa() {
        return Nazwa;
    }
    public void setNazwa(String Nazwa) {
        this.Nazwa = Nazwa;
    }

}
