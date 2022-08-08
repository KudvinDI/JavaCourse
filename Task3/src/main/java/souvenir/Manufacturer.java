package souvenir;

import java.util.ArrayList;
import java.util.List;

public class Manufacturer {
   private final String name;
   private final String country;

   private final List<Souvenir> souvenirsOfManufacturer;

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
        souvenirsOfManufacturer = new ArrayList<>();
    }

    public static Manufacturer of(String name, String country) {
       return new Manufacturer(name, country);
    }
    public void addSouvenir(Souvenir souvenir){
        souvenirsOfManufacturer.add(souvenir);
    }

    public List<Souvenir> getSouvenirsOfManufacturer() {
        return souvenirsOfManufacturer;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manufacturer that = (Manufacturer) o;

        if (!name.equals(that.name)) return false;
        return country.equals(that.country);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
