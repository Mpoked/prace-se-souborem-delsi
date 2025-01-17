import java.util.ArrayList;

public class EvidenceZakazniku {
    private ArrayList<Zakaznik> kolekce;

    public EvidenceZakazniku(ArrayList<Zakaznik> zakaznik) {
        this.kolekce = zakaznik;
    }

    public void pridaniZakaznika(Zakaznik zakaznik){
        kolekce.add(zakaznik);
    }

    public void odebratZakaznika(Zakaznik zakaznik){
        kolekce.remove(zakaznik);
    }


}
