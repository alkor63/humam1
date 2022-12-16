public class Bouquet extends Flower {
    private int numFlower1;
    private int numFlower2;
    private int numFlower3;
    private int numFlower4;
    private int minLifeSpan;
    private double bouquetCost;
    Flower f1 = new Flower();

    public Bouquet(int numFlower1, Flower f1)    {
        minLifeSpan = f1.getLifeSpan();
        bouquetCost = numFlower1 * f1.getCost() * 1.1;
        this.numFlower1 = numFlower1;
        System.out.println("Состав букета: "+numFlower1+" "+f1.getFlowerName());
    }

    public Bouquet(int numFlower1, Flower f1, int numFlower2, Flower f2)    {
        minLifeSpan = f1.getLifeSpan();
        if (minLifeSpan > f2.getLifeSpan()) minLifeSpan = f2.getLifeSpan();
        bouquetCost = (numFlower1 * f1.getCost() + numFlower2 * f2.getCost())*1.1;
        this.numFlower1 = numFlower1;
        this.numFlower2 = numFlower2;
        System.out.println("Состав букета: \t"+f1.getFlowerName()+" "+numFlower1+" штук\n\t\t\t\t"
                +f2.getFlowerName()+" "+numFlower2+" штук");
    }

    public Bouquet(int numFlower1, Flower f1, int numFlower2, Flower f2, int numFlower3, Flower f3)
    {
        minLifeSpan = f1.getLifeSpan();
        if (minLifeSpan > f2.getLifeSpan()) minLifeSpan = f2.getLifeSpan();
        if (minLifeSpan > f3.getLifeSpan()) minLifeSpan = f3.getLifeSpan();
        bouquetCost = (numFlower1 * f1.getCost() + numFlower2 * f2.getCost() + numFlower3 * f3.getCost())*1.1;
        this.numFlower1 = numFlower1;
        this.numFlower2 = numFlower2;
        this.numFlower3 = numFlower3;
        System.out.println("Состав букета: \t"+f1.getFlowerName()+" "+numFlower1+" штук\n\t\t\t\t"
            +f2.getFlowerName()+" "+numFlower2+" штук\n\t\t\t\t" +
                f3.getFlowerName()+" "+numFlower3+" штук");
    }

    public Bouquet(int numFlower1, Flower f1, int numFlower2, Flower f2, int numFlower3, Flower f3, int numFlower4, Flower f4)
    {
        minLifeSpan = f1.getLifeSpan();
        if (minLifeSpan > f2.getLifeSpan()) minLifeSpan = f2.getLifeSpan();
        if (minLifeSpan > f3.getLifeSpan()) minLifeSpan = f3.getLifeSpan();
        if (minLifeSpan > f4.getLifeSpan()) minLifeSpan = f4.getLifeSpan();
        bouquetCost = 1.1*(numFlower1 * f1.getCost() + numFlower2 * f2.getCost() + numFlower3 * f3.getCost() + numFlower4 * f4.getCost());
        this.numFlower1 = numFlower1;
        this.numFlower2 = numFlower2;
        this.numFlower3 = numFlower3;
        this.numFlower4 = numFlower4;
        System.out.println("Состав букета: \t"+f1.getFlowerName()+" "+numFlower1+" штук\n\t\t\t\t"
                +f2.getFlowerName()+" "+numFlower2+" штук\n\t\t\t\t" +
                f3.getFlowerName()+" "+numFlower3+" штук\n\t\t\t\t" +
                f4.getFlowerName()+" "+numFlower4+" штук");
    }

    @Override
    public String toString() {
        return "финальная стоимость букета для покупателя " + dF.format(bouquetCost) +" рублей. Срок стояния букета "
                + minLifeSpan + " дней";
    }
//
//    private void printCost(double costOfBouquet, int minLifeSpan) {
//                System.out.println("финальная стоимость букета для покупателя " + costOfBouquet +
//                "рублей. Срок стояния букета " + minLifeSpan + " дней");
//    }
}
