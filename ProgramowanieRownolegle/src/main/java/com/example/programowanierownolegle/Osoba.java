package com.example.programowanierownolegle;

public class Osoba {
    String imie,nazwisko;
    int year;

    public Osoba(String imie, String nazwisko, int year) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.year = year;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", year=" + year +
                '}';
    }
}
