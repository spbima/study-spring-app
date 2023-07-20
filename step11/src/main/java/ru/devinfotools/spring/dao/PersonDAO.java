package ru.devinfotools.spring.dao;

import org.springframework.stereotype.Component;
import ru.devinfotools.spring.models.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivanko Mike 20.07.2023
 */
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Tom", 34, "tom@goole.com"));
        people.add(new Person(++PEOPLE_COUNT, "Alex", 21, "alex@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Anna", 28, "anna@vl.com"));
        people.add(new Person(++PEOPLE_COUNT, "Egor", 43, "egor@yandex.ru"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people
                .stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person person) {
        Person updatePerson = show(id);
        updatePerson.setName(person.getName());
        updatePerson.setAge(person.getAge());
        updatePerson.setEmail(person.getEmail());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }

}
