package ro.siit.homework.w07;

import ro.siit.homework.w07.Tara;

public class Adresa {

    private final Tara address;

    public Adresa(Tara country) {
        this.address = country;
    }

    public String showCountry() {
        return String.valueOf(this.address);
    }
}
