public class Human {
    public String name;
    public String town;
    public int yearOfBirth;

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". " +
                "Я родился в " + yearOfBirth + " году. Будем знакомы!";
    }
}
