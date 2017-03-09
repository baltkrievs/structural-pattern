package by.darashchonak.mentoring.pattern.structural;

import java.util.Objects;

public class Phone implements Cloneable {

    public Phone(long number, PhoneType type) {
        this.number = number;
        this.type = type;
    }

    public Phone(long number) {
        this(number, PhoneType.GENERAL);
    }

    private long number;
    private PhoneType type;

    public long getNumber() {
        return number;
    }

    public PhoneType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.number);
    }

    @Override
    public String toString() {
        return "[Phone: " + this.number + ", Type: " + type + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
