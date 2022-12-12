public class Main {
    public static void main(String[] args) {

        Human[] humans = new Human[4];
        humans[0] = new Human();
        humans[0].name = "Максим";
        humans[0].town = "Минск";
        humans[0].yearOfBirth = 1988;
        System.out.println(humans[0]);

        humans[1] = new Human();
        humans[1].name = "Аня";
        humans[1].town = "Москва";
        humans[1].yearOfBirth = 1993;
        System.out.println(humans[1]);

        humans[2] = new Human();
        humans[2].name = "Катя";
        humans[2].town = "Калининград";
        humans[2].yearOfBirth = 1992;
        System.out.println(humans[2]);

        humans[3] = new Human();
        humans[3].name = "Артем";
        humans[3].town = "Москва";
        humans[3].yearOfBirth = 1995;
        System.out.println(humans[3]);

    }
}