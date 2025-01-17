import java.io.*;
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

    public void ulozitDoSouboru(String soubor) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(soubor))) {
            for (Zakaznik zakaznik : kolekce) {
                writer.write(zakaznik.toString());
                writer.newLine();
            }
        }
    }

    public void NactiZeSouboru(String soubor) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(soubor))) {
        }

    }
}
