package racingcar;

public class RacingCarName {
    private final String name;

    public RacingCarName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 이름은 5글자를 넘길 수 없습니다.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
