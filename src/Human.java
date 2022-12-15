public class Human {
    private String name;
    private String town;
    private int yearOfBirth;
    private String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if(name == null || name.isEmpty()) name = "Информация не указана";
        this.name = name;
        if(town == null || town.isEmpty()) town = "Информация не указана";
        this.town = town;
        if (yearOfBirth < 0) yearOfBirth = 0;
        this.yearOfBirth = yearOfBirth;
        if(jobTitle == null || jobTitle.isEmpty()) jobTitle = "Информация не указана";
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". " +
                "Я родился в " + yearOfBirth + " году. Я работаю на должности " +jobTitle+ ". Будем знакомы!";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) yearOfBirth = 0;
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if(town == null || town.isEmpty()) town = "Информация не указана";
        this.town = town;
    }
}
