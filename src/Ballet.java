public class Ballet extends MusicalShow {
    Person choreographer;

    public Ballet(Director director, int duration, String title, Person musicAuthor, String librettoText, Person choreographer) {
        super(director, duration, title, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
