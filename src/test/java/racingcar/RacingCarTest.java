package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {
    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar("sae");
    }

    @Test
    void 자동차에_이름생성_1번_전진() {
        racingCar.start(4);

        assertThat(racingCar.getName()).isEqualTo("sae");
        assertThat(racingCar.getLocation()).isEqualTo("-");
    }

    @Test
    void 자동차에_이름생성_멈춤() {
        racingCar.start(1);

        assertThat(racingCar.getName()).isEqualTo("sae");
        assertThat(racingCar.getLocation()).isEqualTo("");
    }
}
