import java.text.DecimalFormat;

public class Bouquet {
    private int[] numFlower;
    private final Flower[] flowers;

    public static double costOfBouquet(int[] numFlower, Flower[] flowers) {
        double bouquetCost = 0;
        for (int j = 0; j < flowers.length; j++) {
            bouquetCost += numFlower[j] * flowers[j].getCost();
        }
        return bouquetCost * 1.1;
    }

    public static int minLifeSpan(int[] numFlower, Flower[] flowers) {
        int minLife;
        int j;
        for (j = 0; j < numFlower.length; j++) {
            if (numFlower[j] > 0) break;
        }
        minLife = flowers[j].getLifeSpan();
        for (j++; j < flowers.length; j++) {
            if (numFlower[j] > 0) {

                if (minLife > flowers[j].getLifeSpan())
                    minLife = flowers[j].getLifeSpan();
            } else break;
        }
        return minLife;
    }

    public Bouquet(int[] numFlower, Flower[] flower) {
        this.flowers = flower;
        this.numFlower = numFlower;
        System.out.println("Состав букета: ");
        for (int i = 0; i < numFlower.length; i++) {
            if (numFlower[i] < 0) {
                System.out.println("!!!!! в букете указано отрицательное количество цветов !!!!!!!!!");
                System.out.println("\t\t\t" + flower[i].getFlowerName() + " - " + numFlower[i] + " щт.");
                break;
            }
            if (numFlower[i] > 0) {
                System.out.println("\t\t\t" + flower[i].getFlowerName() + " - " + numFlower[i] + " щт.");
            }
        }
    }

    DecimalFormat dF = new DecimalFormat("#.00");

    @Override
    public String toString() {
        return "финальная стоимость букета для покупателя " + dF.format(costOfBouquet(numFlower, flowers)) + " рублей.\n\t Срок стояния букета "
                + minLifeSpan(numFlower, flowers) + " дней";
    }
}
