package show;

import model.Director;
import model.Person;

public class Opera extends MusicalShow{
    private final int choirSize;

    public Opera(Director director, int duration, String title, Person musicAuthor, String librettoText, int choirSize) {
        super(director, duration, title, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
