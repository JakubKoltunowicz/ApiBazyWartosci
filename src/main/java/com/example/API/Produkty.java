package com.example.API;

public class Produkty {

    private int ID;
    private String nazwaProduktu;
    private int kalorycznosc;
    private int bialko;
    private int weglowodany;
    private int tluszcze;
    private int wagaProduktu;

    public Produkty(int ID, String nazwaProduktu, int kalorycznosc, int bialko, int weglowodany, int tluszcze, int wagaProduktu) {
        this.ID = ID;
        this.nazwaProduktu = nazwaProduktu;
        this.kalorycznosc = kalorycznosc;
        this.bialko = bialko;
        this.weglowodany = weglowodany;
        this.tluszcze = tluszcze;
        this.wagaProduktu = wagaProduktu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public int getKalorycznosc() {
        return kalorycznosc;
    }

    public void setKalorycznosc(int kalorycznosc) {
        this.kalorycznosc = kalorycznosc;
    }

    public int getBialko() {
        return bialko;
    }

    public void setBialko(int bialko) {
        this.bialko = bialko;
    }

    public int getWeglowodany() {
        return weglowodany;
    }

    public void setWeglowodany(int weglowodany) {
        this.weglowodany = weglowodany;
    }

    public int getTluszcze() {
        return tluszcze;
    }

    public void setTluszcze(int tluszcze) {
        this.tluszcze = tluszcze;
    }

    public int getWagaProduktu() {
        return wagaProduktu;
    }

    public void setWagaProduktu(int wagaProduktu) {
        this.wagaProduktu = wagaProduktu;
    }
}
