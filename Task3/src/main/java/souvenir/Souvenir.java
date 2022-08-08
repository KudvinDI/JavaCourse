package souvenir;

import java.time.LocalDate;

public class Souvenir {
    private final String name;
    private final Manufacturer manufacturer;
    private final LocalDate dateOfManufacture;
    private final double price;

    public Souvenir(String name, Manufacturer manufacturer, LocalDate dateOfManufacture, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }
    public static Souvenir of(String s) {
        String[] split = s.split("_");
        return SouvenirFabric.createSouvenir(split[0], Manufacturer.of(split[1], split[2]),
                LocalDate.of(Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5])),
                Double.parseDouble(split[6]));

    }

    public String getName() {
        return name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Souvenir{" +
                "name='" + name + '\'' +
                ", manufacturer=" + manufacturer +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}
