package racingcar;

public class RacingCarName {
    private final String name;

    public RacingCarName(String name) {
        if (name.length() >= 5) {
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
