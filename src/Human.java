public class Human {
    public String name;
    public String town;
    public int yearOfBirth;
    public String jobTitle;

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". " +
                "Я родился в " + yearOfBirth + " году. Я работаю на должности " +jobTitle+ ". Будем знакомы!";
    }
}
