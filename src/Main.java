import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       EvidenceZakazniku evidence = new EvidenceZakazniku();

       evidence.pridatZakaznika(new Zakaznik("Karel Dvořák", LocalDate.of(2005, 12, 31), "Uherské Hradiště", 45));

        String soubor = "data";
        try {
            evidence.ulozitDoSouboru(soubor);
            System.out.println("Zákazníci byli uloženi do souboru.");
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}