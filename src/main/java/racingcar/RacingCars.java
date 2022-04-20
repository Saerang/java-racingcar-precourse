package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private final List<RacingCar> racingCars = new ArrayList<>();

    public RacingCars(String carNames) {
        this.carNameSetting(carNames);
    }

    private void carNameSetting(String carNames) {
        for (String carName : carNames.split(",")) {
            racingCars.add(new RacingCar(carName));
        }
    }

    public List<RacingCar> getRacingCars() {
        return this.racingCars;
    }

    @Override
    public String toString() {
        return "RacingCars{" +
                "racingCars=" + racingCars +
                '}';
    }
}
