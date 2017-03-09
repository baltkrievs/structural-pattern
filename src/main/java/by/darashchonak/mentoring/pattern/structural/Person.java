package by.darashchonak.mentoring.pattern.structural;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Person {

    public Person(String name) {
        this.name = name;
    }

    private String name;
    private Set<Phone> phones = new HashSet<>();

    public String getName() {
        return name;
    }

    public List<Phone> getPhones() {
        return phones.stream().map(p -> new Phone(p.getNumber(), p.getType())).collect(Collectors.toList());
    }

    public boolean addPhone(Phone phone) {
        return phones.add(phone);
    }

}
