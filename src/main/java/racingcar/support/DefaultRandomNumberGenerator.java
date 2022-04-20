package racingcar.support;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class DefaultRandomNumberGenerator implements RandomNumberGenerator {
    private final List<Integer> numbers = new ArrayList<>();

    @Override
    public List<Integer> generate(int count) {
        while (numbers.size() < count) {
            addNumber();
        }

        return numbers;
    }

    private void addNumber() {
        int number = Randoms.pickNumberInRange(1, 9);

        if (numbers.contains(number)) {
            return;
        }

        numbers.add(number);
    }

}
