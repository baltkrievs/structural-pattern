package by.darashchonak.mentoring.pattern.structural;

import by.darashchonak.mentoring.pattern.structural.factory.DataBaseSourceFactory;
import by.darashchonak.mentoring.pattern.structural.factory.FileSourceFactory;
import by.darashchonak.mentoring.pattern.structural.proxy.Source;
import by.darashchonak.mentoring.pattern.structural.proxy.SourceCacheProxy;

public class Main {

    public static void main(String[] args) {

        Source fileClient = new SourceCacheProxy(new FileSourceFactory());
        fileClient.lookUp("Jane Doe");
        fileClient.lookUp("Jane Doe");

        Source dbClient = new SourceCacheProxy(new DataBaseSourceFactory());
        dbClient.lookUp("John Doe");

    }

}
