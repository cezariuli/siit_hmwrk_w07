package ro.siit.homework.w07;

import java.util.Comparator;
import java.util.Objects;

public class Persoana {

    final String nume;
    final Integer varsta;

    public Persoana(String nume, Integer varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(nume, persoana.nume) &&
                Objects.equals(varsta, persoana.varsta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume) + Objects.hash(varsta);
    }
}

