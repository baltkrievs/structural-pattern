package by.darashchonak.mentoring.pattern.structural.factory;

import by.darashchonak.mentoring.pattern.structural.proxy.Source;
import by.darashchonak.mentoring.pattern.structural.source.DataBaseSource;

public class DataBaseSourceFactory implements SourceFactory {

    @Override
    public Source getSource() {
        return new DataBaseSource();
    }

}
