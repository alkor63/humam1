import java.text.DecimalFormat;

public class Flower {

    private  String flowerName;
    private  String country;
    private  double cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if(flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) flowerName = "Тип цветка не указан";
        this.flowerName = flowerName;
        if(country == null || country.isEmpty() || country.isBlank()) country = "Россия";
        this.country = country;
        if (cost <= 0) cost = 1;
        this.cost = cost;
        if (lifeSpan <= 0) lifeSpan = 3;
        this.lifeSpan = lifeSpan;
    }
    DecimalFormat dF = new DecimalFormat( "#.00" );

    public Flower() {

    }
//
//    public Flower(String flowerName, String country) {
//        if(flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) flowerName = "Тип цветка не указан";
//        this.flowerName = flowerName;
//        if(country == null || country.isEmpty() || country.isBlank()) country = "Россия";
//        this.country = country;
//    }

    //  System.out.print(`dF.format(cost)`);
    @Override
    public String toString() {
        return "цветок " + flowerName +", страна происхождения — " + country +
                ", стоимость штуки — " + dF.format(cost) +" рублей, срок стояния — " + lifeSpan + " дней";
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public double getCost() {
        return cost;
    }

    public String getFlowerName() {
        return flowerName;
    }
}