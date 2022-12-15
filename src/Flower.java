import java.text.DecimalFormat;

public class Flower {

    private final String flowerName;
    private final String country;
    private final double cost;
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

//  System.out.print(`dF.format(cost)`);
    @Override
    public String toString() {
        return "цыеток " + flowerName +", страна происхождения — " + country +
                ", стоимость штуки — " + dF.format(cost) +" рублей, срок стояния — " + lifeSpan + " дней";
    }
}