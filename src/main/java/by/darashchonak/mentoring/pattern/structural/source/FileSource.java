package by.darashchonak.mentoring.pattern.structural.source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.darashchonak.mentoring.pattern.structural.business.Phone;
import by.darashchonak.mentoring.pattern.structural.proxy.Source;

public class FileSource implements Source {

    private final Map<String, List<Phone>> fakeStorage = new HashMap<>();

    public FileSource() {
        this.fakeStorage.put("Jane Doe", new ArrayList<Phone>() {

            private static final long serialVersionUID = -6805558739055796464L;

            {
                add(new Phone(1111122222L));
                add(new Phone(2222224444L));
            }
        });
    }

    @Override
    public List<Phone> lookUp(String name) {
        System.out.println("From storage");
        return fakeStorage.get(name);

    }

}
