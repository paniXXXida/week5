package com.example.week5_class.data;

import com.example.week5_class.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Person> people;

    public Database() {
        people = new ArrayList<>();
        people.addAll(List.of(new Person("Jack", "Smith", LocalDate.of(1992, 2, 2))));

    }

    public List<Person> getPeople() {
        return people;
    }
}
