package by.darashchonak.mentoring.pattern.structural.proxy;

import java.util.List;

import by.darashchonak.mentoring.pattern.structural.business.Phone;

public interface Source {

    public List<Phone> lookUp(String name);

}
