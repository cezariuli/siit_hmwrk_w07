package ro.siit.homework.w07;

import java.util.Comparator;

public class ComparatorNume implements Comparator<Persoana> {

    @Override
    public int compare(Persoana o1, Persoana o2) {
        return o1.nume.compareTo(o2.nume);
    }
}
