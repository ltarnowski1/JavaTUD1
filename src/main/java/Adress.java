/**
 * Created by £ukasz on 2015-11-05.
 */
public class Adress {

        private int idAdress;
        private int idCity;
        private String Street;
        private int Number;

        public Adress() {
        }

        public Adress(int idCity, String Street, int Number) {
            super();
            this.idCity = idCity;
            this.Street = Street;
            this.Number = Number;
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
        public void setNumer(int Number) {
        this.Number = Number;
    }

}
