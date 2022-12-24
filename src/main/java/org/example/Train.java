package org.example;

public class Train extends Transport{
    String id;
    int carriageCount;
    boolean isExpress;
    public Train(String name, int capacity, int speed, double costOfKm, String id, int carriageCount, boolean isExpress) {
        super(name, capacity, speed, costOfKm);
        this.id = id;
        this.carriageCount = carriageCount;
        this.isExpress = isExpress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = carriageCount;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public String toString() {
        System.out.println(id+isExpress+carriageCount);
        return super.toString();
    }

    @Override
    float getPrice(City city) {
        return 0;
    }
}
// Д.з. использовать аннотации Lombok для всех свойств, геттеров сеттеров, метода toString
// и конструктора со всеми аргументами