import java.time.LocalDate;

public class Zakaznik {
    private String jmeno;
    private LocalDate datumNarozeni;
    private String mesto;
    private int pocetProdejcu;

    public Zakaznik(String jmeno, LocalDate datumNarozeni, String mesto, int pocetProdejcu) {
        this.jmeno = jmeno;
        this.datumNarozeni = datumNarozeni;
        this.mesto = mesto;
        this.pocetProdejcu = pocetProdejcu;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public int getPocetProdejcu() {
        return pocetProdejcu;
    }

    public void setPocetProdejcu(int pocetProdejcu) {
        this.pocetProdejcu = pocetProdejcu;
    }
}
