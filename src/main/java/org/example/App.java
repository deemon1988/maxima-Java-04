package org.example;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main( String[] args ) throws Exception {
        Cat murzik = new Cat("Мурзик",5,true);
        Cat barsik = new Cat("Барсик",6,true);
        Cat murka = new Cat("Мурка",8,false);
        Cat aurka = new Cat("Aурка",8,false);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(aurka);
        cats.add(murzik);
        cats.add(barsik);
        cats.add(murka);



        CatStatistics.sortByNameAscending(cats);
       // CatStatistics.sortByWeightDescending(cats);
        //CatStatistics.removeFirstAndLast(cats);
        //CatStatistics.findFirstNonAngryCat(cats);
        //CatStatistics.getCommonWeight(cats, false);  // с помощью метода .reduce
        CatStatistics.groupCatByFirstLetter(cats);
    Train train = new Train("s",1,1,1,"1",4,false);
    train.toString();


    }
}
