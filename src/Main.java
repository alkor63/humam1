public class Main {
    public static void main(String[] args) {

        Human[] humans = new Human[4];
        humans[0] = new Human("Максим","Минск", 1988, "бренд-менеджер");
        System.out.println(humans[0]);

        humans[1] = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        System.out.println(humans[1]);

        humans[2] = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        System.out.println(humans[2]);

        humans[3] = new Human("Артем", "Москва", 1995,"директор по развитию бизнеса");
        System.out.println(humans[3]);

    }
}