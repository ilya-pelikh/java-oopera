package show;

import model.Director;
import model.Person;

public class Ballet extends MusicalShow {
    private final Person choreographer;

    public Ballet(Director director, int duration, String title, Person musicAuthor, String librettoText, Person choreographer) {
        super(director, duration, title, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }
}
