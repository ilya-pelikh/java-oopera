package show;

import model.Director;
import model.Person;

public class MusicalShow extends  Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(Director director, int duration, String title, Person musicAuthor, String librettoText) {
        super(director, duration, title);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibretto () {
        System.out.println(librettoText);
    }
}
