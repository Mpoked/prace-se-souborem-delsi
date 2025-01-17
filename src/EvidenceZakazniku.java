import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class EvidenceZakazniku {
    private ArrayList<Zakaznik> kolekce;

    public EvidenceZakazniku() {
        this.kolekce = new ArrayList<>();
    }

    public void pridatZakaznika(Zakaznik zakaznik){
        kolekce.add(zakaznik);
    }

    public void odebratZakaznika(Zakaznik zakaznik){
        kolekce.remove(zakaznik);
    }

    public void zobrazitZakazniky() {
        kolekce.forEach(System.out::println);
    }

    public void ulozitDoSouboru(String soubor) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(soubor))) {
            for (Zakaznik zakaznik : kolekce) {
                writer.write(zakaznik.toString());
                writer.newLine();
            }
        }
    }

    public void nactiZeSouboru(String soubor) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(soubor))) {
            String line;
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(":");
                String jmeno = parts[0];
                LocalDate datumNarozeni = LocalDate.parse(parts[1]);
                String mesto = parts[2].trim();
                int pocetProdeju = Integer.parseInt(parts[3]);
                Zakaznik zakaznik = new Zakaznik(jmeno, datumNarozeni, mesto, pocetProdeju);
                kolekce.add(zakaznik);
            }
        }

    }
}
