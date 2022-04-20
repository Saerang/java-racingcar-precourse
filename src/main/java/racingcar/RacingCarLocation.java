package racingcar;

public class RacingCarLocation {
    private String location = "";

    public void moveOnCondition(int number) {
        if (number < 1 || number > 9) {
            throw new IllegalArgumentException("[ERROR] 숫자는 1~9사이만 입력이 가능합니다.");
        }

        if (number >= 4) {
            this.location += "-";
        }
    }

    public String getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "RacingCarLocation{" +
                "location='" + location + '\'' +
                '}';
    }
}
