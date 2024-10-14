package domain;

public class Car {
    private final String name;

    private final int NAME_MIN = 1;
    private final int NAME_MAX = 5;

    public Car(String name) {
        this.name = name;
        validateRange();
    }

    public void validateRange() {
        if (name.isEmpty() || name.length() > NAME_MAX) {
            throw new IllegalArgumentException();
        }
    }
}
