package model;

public class Director extends Person  {
    private final int numberOfShows;

    public Director(String name, String surname, GenderEnum gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }
}
