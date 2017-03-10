package by.darashchonak.mentoring.pattern.structural.factory;

import by.darashchonak.mentoring.pattern.structural.proxy.Source;
import by.darashchonak.mentoring.pattern.structural.source.FileSource;

public class FileSourceFactory extends SourceFactory {

    @Override
    public Source getSource() {
        return new FileSource();
    }

}
