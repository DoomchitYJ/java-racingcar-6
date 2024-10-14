package view;

import javax.xml.validation.Validator;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    private static final String CAR_NAMES_INPUT = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
    private static final String NAME_SEPARATOR = ",";

    public static List<String> getCarNames() {
        System.out.println(CAR_NAMES_INPUT);
        return List.of(readLine().trim().split(NAME_SEPARATOR));
    }
}
