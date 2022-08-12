package souvenir;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract class SouvenirFabric {
    static final List<Manufacturer> MANUFACTURERS = new ArrayList<>();
    public static Souvenir createSouvenir(String name, Manufacturer manufacturer, LocalDate dateOfManufacture, double price){
        Souvenir souvenir = new Souvenir(name, manufacturer, dateOfManufacture, price);
        for(Manufacturer manufacturerInList : MANUFACTURERS){
            if(manufacturerInList.equals(manufacturer)){
                manufacturerInList.addSouvenir(souvenir);
                return souvenir;
            }
        }
        MANUFACTURERS.add(manufacturer);
        manufacturer.addSouvenir(souvenir);
       return souvenir;
    }



}
