package model;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected final GenderEnum gender;

    public Person(String name, String surname, GenderEnum gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public GenderEnum getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return  name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return  Objects.equals(name, person.name)
                && Objects.equals(surname, person.surname)
                && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }
}
