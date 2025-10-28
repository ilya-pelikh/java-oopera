public class MusicalShow extends  Show {
    Person musicAuthor;
    String librettoText;

    public MusicalShow(Director director, int duration, String title, Person musicAuthor, String librettoText) {
        super(director, duration, title);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    void printLibretto () {
        System.out.println(librettoText);
    }
}
