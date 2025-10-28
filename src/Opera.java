public class Opera extends MusicalShow{
    int choirSize;

    public Opera(Director director, int duration, String title, Person musicAuthor, String librettoText, int choirSize) {
        super(director, duration, title, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
