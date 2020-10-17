package ro.siit.homework.w07;

import org.junit.Test;

import java.util.*;

public class PersoaneTest {


    @Test
    public void testOrderByNume() {
        Set<Persoana> persoane = new TreeSet<Persoana>(new ComparatorNume());

        persoane.add(new Persoana("Andrei", 13));
        persoane.add(new Persoana("Zaharia", 34));
        persoane.add(new Persoana("Jean", 29));
        persoane.add(new Persoana("Dacian", 51));
        persoane.add(new Persoana("Clotilde", 47));
        persoane.add(new Persoana("Cosette", 42));
        persoane.add(new Persoana("Nicusor", 50));
        persoane.add(new Persoana("Adina", 14));
        persoane.add(new Persoana("Dominic", 37));

        for (Persoana p: persoane) {
            System.out.println("Nume: " + p.nume);
            System.out.println("Varsta: " + p.varsta);
            System.out.println("-----------");
        }

    }

    @Test
    public void testOrderByVarsta() {
        Set<Persoana> persoane = new TreeSet<Persoana>(new ComparatorVarsta());

        persoane.add(new Persoana("Andrei", 13));
        persoane.add(new Persoana("Zaharia", 34));
        persoane.add(new Persoana("Jean", 29));
        persoane.add(new Persoana("Dacian", 51));
        persoane.add(new Persoana("Clotilde", 47));
        persoane.add(new Persoana("Cosette", 42));
        persoane.add(new Persoana("Nicusor", 50));
        persoane.add(new Persoana("Adina", 14));
        persoane.add(new Persoana("Dominic", 37));

        for (Persoana p: persoane) {
            System.out.println("Nume: " + p.nume);
            System.out.println("Varsta: " + p.varsta);
            System.out.println("-----------");
        }
    }

    @Test
    public void testHobbies() {

        Set<Persoana> persoane = new TreeSet<Persoana>(new ComparatorNume());
        Map<Persoana, ArrayList<Hobby>> hobbies = new HashMap<Persoana, ArrayList<Hobby>>();


        persoane.add(new Persoana("Dacian", 51));
        persoane.add(new Persoana("Clotilde", 47));
        persoane.add(new Persoana("Cosette", 42));
        persoane.add(new Persoana("Nicusor", 50));

        Iterator<Persoana> it = persoane.iterator();

        hobbies.put(it.next(), new ArrayList<Hobby>(){
            {
                add(new Hobby("Swimming", 2));
                add(new Hobby("Cycling", 2));
            }
        });



        hobbies.put(it.next(), new ArrayList<Hobby>(){
            {
                add(new Hobby("Hiking", 1));
                add(new Hobby("Beach Volley", 2));
            }
        });



        hobbies.put(it.next(), new ArrayList<Hobby>(){
            {
                add(new Hobby("Swimmming", 4));
                add(new Hobby("Hiking", 2));
            }
        });


        hobbies.put(it.next(), new ArrayList<Hobby>(){
            {
                add(new Hobby("Football", 1));
                add(new Hobby("Beach Volley", 2));
            }
        });

        it = persoane.iterator();

        for (Persoana p: persoane) {
            System.out.println(p.nume + " likes to do: ");
            if (hobbies.get(p).iterator().hasNext() ) {
                System.out.println("\t" + hobbies.get(p).iterator().next().hobbyName + " in: ");
                System.out.print("\t\t");
                hobbies.get(p).iterator().next().showListaAdrese();
                System.out.println();
                hobbies.get(p).iterator().next();
            }

            }

        }
}
