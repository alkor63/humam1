public class Human {
    private String name;
    private String town;
    private int yearOfBirth;
    private String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if(name == null || name.equals("")) name = "Информация не указана";
        this.name = name;
        if(town == null || town.equals("")) town = "Информация не указана";
        this.town = town;
        if (yearOfBirth < 0) yearOfBirth = 0;
        this.yearOfBirth = yearOfBirth;
        if(jobTitle == null || jobTitle.equals("")) jobTitle = "Информация не указана";
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". " +
                "Я родился в " + yearOfBirth + " году. Я работаю на должности " +jobTitle+ ". Будем знакомы!";
    }
}
