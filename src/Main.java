public class Main {
    public static void main(String[] args) {

        Human[] humans = new Human[5];
        humans[0] = new Human("","Минск", 1988, "бренд-менеджер");
        humans[1] = new Human("Аня", "", 1993, "методист образовательных программ");
        humans[2] = new Human("Катя", "Калининград", 1992, null);
        humans[3] = new Human("Артем", "Москва", -1995,"директор по развитию бизнеса");
        humans[4] = new Human("Владимир", "Казань", 2001, "безработный");

        for (Human hp:humans)
        System.out.println(hp);
    }
}