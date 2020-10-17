package ro.siit.homework.w07;

import java.util.Comparator;

public class ComparatorVarsta implements Comparator<Persoana> {

    @Override
    public int compare(Persoana o1, Persoana o2) {
        return o1.varsta.compareTo(o2.varsta);
    }
}
