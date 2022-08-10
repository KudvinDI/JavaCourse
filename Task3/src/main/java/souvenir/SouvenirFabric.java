package souvenir;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract class SouvenirFabric {
    private static final List<Manufacturer> existedManufacturers = new ArrayList<>();
    public static Souvenir createSouvenir(String name, Manufacturer manufacturer, LocalDate dateOfManufacture, double price){
        Souvenir souvenir = new Souvenir(name, manufacturer, dateOfManufacture, price);
        for(Manufacturer manufacturerInList : existedManufacturers){
            if(manufacturerInList.equals(manufacturer)){
                manufacturerInList.addSouvenir(souvenir);
                return souvenir;
            }
        }
        existedManufacturers.add(manufacturer);
        manufacturer.addSouvenir(souvenir);
       return souvenir;
    }


}
