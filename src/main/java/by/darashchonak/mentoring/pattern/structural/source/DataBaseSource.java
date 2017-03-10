package by.darashchonak.mentoring.pattern.structural.source;

import java.util.ArrayList;
import java.util.List;

import by.darashchonak.mentoring.pattern.structural.business.Phone;
import by.darashchonak.mentoring.pattern.structural.proxy.Source;

public class DataBaseSource implements Source {

    @Override
    public List<Phone> lookUp(String name) {
        return new ArrayList<>();
    }

}
