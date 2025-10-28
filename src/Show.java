import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(Director director, int duration, String title) {
        this.director = director;
        this.duration = duration;
        this.title = title;
    }

    void printDirector () {
        System.out.println(director);
    }

    void printActors () {
        System.out.println(listOfActors);
    }


    void addActor (Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер уже учавствует в представлении");
        } else {
            listOfActors.add(actor);
        }
    }

    void replaceActor (Actor actor, String surnameForReplacing) {
        boolean hasActorReplaced = false;

        for (int index = 0; index < listOfActors.size(); index++) {
            Actor actorFromList = listOfActors.get(index);
            if (actorFromList.surname.contains(surnameForReplacing)) {
                listOfActors.set(index, actor);
                hasActorReplaced = true;
                break;
            }
        }

        if (!hasActorReplaced) {
            System.out.println("Актер не учавствует в представлении");
        }
    }
}
