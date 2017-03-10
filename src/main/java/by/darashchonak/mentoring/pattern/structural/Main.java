package by.darashchonak.mentoring.pattern.structural;

import by.darashchonak.mentoring.pattern.structural.factory.DataBaseSourceFactory;
import by.darashchonak.mentoring.pattern.structural.factory.FileSourceFactory;
import by.darashchonak.mentoring.pattern.structural.proxy.Source;
import by.darashchonak.mentoring.pattern.structural.proxy.SourceCacheProxy;

public class Main {

    public static void main(String[] args) {

        Source fileClinet = new SourceCacheProxy(new FileSourceFactory());
        fileClinet.lookUp("John Doe");

        Source dbClinet = new SourceCacheProxy(new DataBaseSourceFactory());
        dbClinet.lookUp("Jane Doe");

    }

}
