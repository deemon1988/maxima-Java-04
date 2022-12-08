package org.example;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args ) throws Exception {
        Cat murzik = new Cat("Мурзик",5,true);
        Cat barsik = new Cat("Барсик",6,true);
        Cat murka = new Cat("Мурка",8,false);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(murzik);
        cats.add(barsik);
        cats.add(murka);


        CatStatistics.sortByNameAscending(cats);
        CatStatistics.sortByWeightDescending(cats);
        CatStatistics.removeFirstAndLast(cats);
        cats.add(murzik);
        cats.add(murka);
        cats.add(barsik);
        CatStatistics.findFirstNonAngryCat(cats);
    }
}
