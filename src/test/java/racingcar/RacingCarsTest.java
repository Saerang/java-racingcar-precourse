package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarsTest {

    @Test
    void 자동차를_5대_생성() {
        RacingCars racingCars = new RacingCars("sae,rang,pro,free,pass");

        assertThat(racingCars.getRacingCars()).hasSize(5)
                                              .extracting("name")
                                              .containsExactly("sae", "rang", "pro", "free", "pass");
    }


}
