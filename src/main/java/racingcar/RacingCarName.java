package racingcar;

public class RacingCarName {
    public static final int MAX_NAME_LENGTH = 5;
    private final String name;

    public RacingCarName(String name) {
        if (name.length() >= MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 5글자를 넘길 수 없습니다.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "RacingCarName{" +
                "name='" + name + '\'' +
                '}';
    }
}
