package racingcar;

public class RacingCar {
    private final RacingCarName name;
    private final RacingCarLocation location = new RacingCarLocation();

    public RacingCar(String name) {
        this.name = new RacingCarName(name);
    }

    public void start(int number) {
        location.start(number);
    }

    public String getName() {
        return this.name.getName();
    }

    public String getLocation() {
        return this.location.getLocation();
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "name=" + name +
                ", location=" + location +
                '}';
    }
}
