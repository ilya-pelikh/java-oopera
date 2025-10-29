package show;

import model.Actor;
import model.Director;

import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(Director director, int duration, String title) {
        this.director = director;
        this.duration = duration;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printDirector () {
        System.out.println(director);
    }

    public void printActors () {
        System.out.println(listOfActors);
    }


    public void addActor (Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер уже учавствует в представлении");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor (Actor actor, String surnameForReplacing) {
        boolean hasActorReplaced = false;

        for (int index = 0; index < listOfActors.size(); index++) {
            Actor actorFromList = listOfActors.get(index);
            if (actorFromList.getSurname().contains(surnameForReplacing)) {
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
