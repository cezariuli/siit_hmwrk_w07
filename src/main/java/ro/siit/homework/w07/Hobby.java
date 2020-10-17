package ro.siit.homework.w07;

import java.util.ArrayList;
import java.util.List;

import static ro.siit.homework.w07.Tara.*;

public class Hobby {

    final String hobbyName;
    final Integer frequency;
    private List<Adresa> listaAdrese = new ArrayList<Adresa>();

    public Hobby ( String name, Integer freq) {
        this.hobbyName = name;
        this.frequency = freq;
        findAddressOfHobby(name);

    }

    public void showListaAdrese() {
        for (Adresa a: listaAdrese) {
            System.out.print(" " + a.showCountry());
        }
    }

    private void findAddressOfHobby(String name) {
        switch (name) {
            case "Swimming":
                listaAdrese.add(new Adresa(ARUBA));
                listaAdrese.add(new Adresa(AUSTRALIA));
                listaAdrese.add(new Adresa(JAMAICA));
                break;
            case "Cycling":
                listaAdrese.add(new Adresa(FRANCE));
                listaAdrese.add(new Adresa(ITALY));
                listaAdrese.add(new Adresa(SPAIN));
                break;
            case "Hiking":
                listaAdrese.add(new Adresa(BERMUDA));
                listaAdrese.add(new Adresa(BAHAMAS));
                listaAdrese.add(new Adresa(KEY_LARGO));
                listaAdrese.add(new Adresa(AUSTRIA));
                break;
            case "Football":
                listaAdrese.add(new Adresa(GERMANY));
                listaAdrese.add(new Adresa(ROMANIA));
                listaAdrese.add(new Adresa(MONTEGO));
                break;
            case "Beach volley":
                listaAdrese.add(new Adresa(KOKOMO));
                listaAdrese.add(new Adresa(AUSTRALIA));
                break;
            default:
                listaAdrese.add(new Adresa(OTHER));
        }
    }

}
