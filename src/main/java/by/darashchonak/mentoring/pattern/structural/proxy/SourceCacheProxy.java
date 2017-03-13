package by.darashchonak.mentoring.pattern.structural.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import by.darashchonak.mentoring.pattern.structural.business.Phone;
import by.darashchonak.mentoring.pattern.structural.factory.SourceFactory;

public class SourceCacheProxy implements Source {

    final static Logger logger = Logger.getLogger(SourceCacheProxy.class);

    private final SourceFactory factory;
    private Source source;

    private final Map<String, List<Phone>> cache = new HashMap<>();

    public SourceCacheProxy(SourceFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<Phone> lookUp(String name) {

        List<Phone> phonesList = cache.get(name);

        if (null == phonesList) {
            if (null == source) {
                source = factory.getSource();
            }
            phonesList = source.lookUp(name);
            if (null != phonesList) {
                cache.put(name, phonesList);
            }

        } else {
            logger.info("Response from the cache proxy");
        }

        return phonesList;
    }
}
