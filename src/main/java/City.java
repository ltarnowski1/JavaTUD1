/**
 * Created by £ukasz on 2015-11-04.
 */
public class City
{
        private int idCity;
        private String Name;

        public City() {
        }

        public City(String Name) {
            super();
            this.Name = Name;
        }
        public int getIdCity() { return idCity; }
        public void setIdCity(int idCity) {
            this.idCity = idCity;
        }
        public String getName() {
            return Name;
        }
        public void setName(String Name) {
            this.Name = Name;
        }
}
