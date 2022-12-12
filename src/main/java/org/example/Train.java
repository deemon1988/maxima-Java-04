package org.example;

public class Train extends Transport{
    public Train(String name, int capacity, int speed, double costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    @Override
    float getPrice(City city) {
        return 0;
    }
}
// Д.з. использовать аннотации Lombok для всех геттеров сеттеров, метода toString
// и конструктора со всеми аргументами