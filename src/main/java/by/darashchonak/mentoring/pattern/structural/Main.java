package by.darashchonak.mentoring.pattern.structural;

import org.apache.log4j.Logger;

import by.darashchonak.mentoring.pattern.structural.factory.DataBaseSourceFactory;
import by.darashchonak.mentoring.pattern.structural.factory.FileSourceFactory;
import by.darashchonak.mentoring.pattern.structural.proxy.Source;
import by.darashchonak.mentoring.pattern.structural.proxy.SourceCacheProxy;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Source fileClient = new SourceCacheProxy(new FileSourceFactory());
        logger.info("Request storage for the first time");
        fileClient.lookUp("Jane Doe");
        logger.info("Request storage for the second time");
        fileClient.lookUp("Jane Doe");
        logger.info("Request storage for the third time");
        fileClient.lookUp("Jane Doe");

        Source dbClient = new SourceCacheProxy(new DataBaseSourceFactory());
        dbClient.lookUp("John Doe");

    }

}
