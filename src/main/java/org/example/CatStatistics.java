package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CatStatistics {
   public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {
       cats = (ArrayList<Cat>) cats.stream().sorted((x,y)-> x.getName().compareTo(y.getName()))
         .collect(Collectors.toList());
       System.out.println(cats);
       return cats;
    }

    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats){
      cats= (ArrayList<Cat>) cats.stream().sorted((x, y)-> y.getWeight()- x.getWeight())
              .collect(Collectors.toList());
      System.out.println(cats);
      return cats;
    }

    public static ArrayList<Cat> removeFirstAndLast(ArrayList<Cat> cats){
        int lastIndex = cats.size() - 1;
        cats.remove(lastIndex);
        cats.remove(0);
        System.out.println(cats);
        return cats;
    }

    public static ArrayList<Cat> findFirstNonAngryCat(ArrayList<Cat> cats){
        Cat first = cats.stream().filter(x-> !x.isAngry()).findFirst().get();
        cats.removeAll(cats);
        cats.add(first);
        System.out.println(cats);
       return cats;
    }
}
