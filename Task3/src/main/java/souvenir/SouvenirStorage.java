package souvenir;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

//TODO Добавлять, редактировать, просматривать всех производителей и все сувениры.
//    • Удалить заданного производителя и его сувениры.
public class SouvenirStorage {

    List<Souvenir> souvenirs;
    Set<Manufacturer> manufacturers;
    public SouvenirStorage(){
        souvenirs = getSouvenirsFromFile();
        manufacturers = souvenirs.stream().map(Souvenir::getManufacturer).collect(Collectors.toSet());
    }

    public void printSouvenirsOfGivenManufacturer(Manufacturer manufacturer){
        souvenirs.stream()
                .filter(souvenir -> souvenir.getManufacturer().equals(manufacturer))
                .forEach(System.out::println);
    }
    public void printSouvenirsOfGivenCountry(String country){
        souvenirs.stream()
                .filter(souvenir -> souvenir.getManufacturer().getCountry().equals(country))
                .forEach(System.out::println);
    }
    public void printManufacturersSouvenirsLessThenGivenNumber(double price){
        souvenirs.stream()
                .filter(souvenir -> souvenir.getPrice()<price)
                .map(Souvenir::getManufacturer)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
    public void printSouvenirsOfAllManufacturers(){
        for(Manufacturer manufacturer : manufacturers){
            System.out.println(manufacturer);
            System.out.println(manufacturer.getSouvenirsOfManufacturer());
            System.out.println("------------------------------------------------------------------------------------------------------------");

        }
    }
    public void printSouvenirManufacturersGivenYear(String name, int year){
        souvenirs.stream()
                .filter(souvenir -> souvenir.getName().equals(name) & souvenir.getDateOfManufacture().getYear() == year)
                .map(Souvenir::getManufacturer)
                .forEach(System.out::println);

    }
    public void printYearCreatedSouvenir(){
        souvenirs.stream()
                .collect(Collectors.groupingBy(Souvenir::getDateOfManufacture))
                .forEach((localDate, souvenirs1) -> System.out.println(localDate + " " +souvenirs1));
    }

    public void deleteManufacturerWithSouvenirs(Manufacturer manufacturer){
        manufacturers.remove(manufacturer);
       //TODO

    }

    public List<Souvenir> getSouvenirs() {
        return souvenirs;
    }

    public Set<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void printSouvenirs(){
        System.out.println(souvenirs);
    }

    public void printManufacturers(){
        System.out.println(manufacturers);
    }

    private static List<Souvenir> getSouvenirsFromFile(){
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/souvenirs.txt"))) {
            return reader.lines().map(Souvenir::of).toList();
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}
