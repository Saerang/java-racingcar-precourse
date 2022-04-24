package racingcar.view;

import racingcar.RacingCar;
import racingcar.RacingCars;

import java.util.List;
import java.util.StringJoiner;

public class PrintView {
    public static void printErrorMessage(String message) {
        System.out.println("[ERROR] " + message);
    }

    public static void printWinnerNames(List<String> winnerNames) {
        StringJoiner stringJoiner = new StringJoiner(",");
        for (String winnerName : winnerNames) {
            stringJoiner.add(winnerName);
        }
        System.out.println("최종 우승자는 " + stringJoiner + " 입니다.");
    }

    public static void printGameResult(RacingCars racingCars) {
        for (RacingCar racingCar : racingCars.getRacingCars()) {
            System.out.println(racingCar.getName() + " : " + racingCar.getLocation());
        }

        printBlankLine();
    }

    private static void printBlankLine() {
        System.out.println();
    }

}
