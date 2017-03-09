package by.darashchonak.mentoring.pattern.structural;

import java.util.HashMap;
import java.util.List;

public class SourceCacheProxy implements Retrievable {

    public SourceCacheProxy(Source source) {
        this.source = source;
    }

    private Source source;

    private final HashMap<String, List<Phone>> cache = new HashMap<>();

    @Override
    public List<Phone> lookUp(String name) {

        List<Phone> phonesList = cache.get(name);

        if (null == phonesList) {
            phonesList = source.lookUp(name);
        }

        return phonesList;
    }

}
