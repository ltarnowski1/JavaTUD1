/**
 * Created by �ukasz on 2015-11-05.
 */
public class Adress {

        private int idAdress;
        private int idCity;
        private String Street;
        private int Number;

        public Adress() {
        }

        public Adress(int idAdress ,int idCity, String Street, int Number) {
            super();
            this.idAdress = idAdress;
            this.idCity = idCity;
            this.Street = Street;
            this.Number = Number;
        }

        public int getIdAdress() { return idAdress; }
        public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }
        public int getIdCity() { return idCity; }
        public void setIdCity(int idCity) {
            this.idCity = idCity;
        }
        public String getStreet() {
            return Street;
        }
        public void setStreet(String Street) {this.Street = Street;}
        public int getNumber() {
        return Number;
    }
        public void setNumber(int Number) {
        this.Number = Number;
    }

}
