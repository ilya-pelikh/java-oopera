public class Director extends Person  {
    int numberOfShows;

    public Director(String name, String surname, GenderEnum gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
