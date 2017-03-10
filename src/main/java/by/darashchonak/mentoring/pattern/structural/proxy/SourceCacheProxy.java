package by.darashchonak.mentoring.pattern.structural.proxy;

import java.util.HashMap;
import java.util.List;

import by.darashchonak.mentoring.pattern.structural.business.Phone;
import by.darashchonak.mentoring.pattern.structural.factory.SourceFactory;

public class SourceCacheProxy implements Source {

    public SourceCacheProxy(SourceFactory factory) {
        this.factory = factory;
    }

    private final SourceFactory factory;
    private Source source;

    private final HashMap<String, List<Phone>> cache = new HashMap<>();

    @Override
    public List<Phone> lookUp(String name) {

        List<Phone> phonesList = cache.get(name);

        if (null == phonesList) {
            if (null == source) {
                source = factory.getSource();
            }
            phonesList = source.lookUp(name);
        }

        return phonesList;
    }
}
