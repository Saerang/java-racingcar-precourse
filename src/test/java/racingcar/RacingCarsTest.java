package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class RacingCarsTest {

    @Test
    void 자동차를_5대_생성() {
        RacingCars racingCars = new RacingCars("sae,rang,pro,free,pass");

        assertThat(racingCars.getRacingCars()).hasSize(5)
                                              .extracting("name")
                                              .containsExactly("sae", "rang", "pro", "free", "pass");
    }

    @Test
    void 자동차_경주_2명_시작() {
        RacingCars racingCars = new RacingCars("sae,rang");
        racingCars.start(3, new TestRandomNumberGenerator(Arrays.asList(4, 1, 4, 2, 3, 5)));

        assertThat(racingCars.getRacingCars()).hasSize(2)
                                              .extracting("name", "location")
                                              .containsExactly(tuple("sae", "--"), tuple("rang", "-"));
    }

    @Test
    void 자동차_경주_3명_시작() {
        RacingCars racingCars = new RacingCars("sae,rang,free");
        racingCars.start(2, new TestRandomNumberGenerator(Arrays.asList(4, 1, 4, 2, 3, 5)));

        assertThat(racingCars.getRacingCars()).hasSize(3)
                                              .extracting("name", "location")
                                              .containsExactly(tuple("sae", "-"),
                                                               tuple("rang", ""),
                                                               tuple("free", "--"));
    }

}
