import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        // Просьба: очень интересно, как бы выглядели директории, если бы это был реальный проект.
        // Если не трудно, поделитесь пожалуйста :)
        Actor actor1 = new Actor("Петр", "Артистов", GenderEnum.MALE, 199);
        Actor actor2 = new Actor("Елена", "Петрова", GenderEnum.FEMALE, 120);
        Actor actor3 = new Actor("Джек", "Воробей", GenderEnum.MALE, 230);

        Director director1 = new Director("Петр", "Директоров", GenderEnum.MALE, 2);
        Director director2 = new Director("Елена", "Директоровна", GenderEnum.FEMALE, 3);

        Person musicAuthor = new Person("Дмитрий", "Музыкалов", GenderEnum.MALE);
        Person choreographer = new Person("Елена", "Хореографовна", GenderEnum.FEMALE);

        Show show = new Show(director1, 120, "Смешное шоу");
        show.addActor(actor1);

        System.out.print("Список актеров SHOW: ");
        show.printActors();

        Opera opera = new Opera(director1, 180, "Смешная опера", musicAuthor, "Либретто для оперы", 2);
        opera.addActor(actor1);
        opera.addActor(actor2);

        System.out.print("Список актеров Opera: ");
        opera.printActors();

        Ballet ballet = new Ballet(director2, 220, "Смешной балет", musicAuthor, "Либретто для балета", choreographer);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.print("Список актеров Ballet: ");
        ballet.printActors();

        ballet.replaceActor(actor1, "Петрова");

        System.out.print("Список актеров Ballet после замены: ");
        ballet.printActors();

        ballet.replaceActor(actor3, "Пожилой");

        opera.printLibretto();
        ballet.printLibretto();
    }
}
