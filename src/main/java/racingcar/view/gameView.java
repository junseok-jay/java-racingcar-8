package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.entity.racer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gameView {
    private final static String FIRST_MSG = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final static String TRIAL_MSG = "시도할 횟수는 몇 회인가요?";
    private final static String WINNER_MSG = "최종 우승자 : ";
    private final static String RACE_STRIDE = "-";

    public Map<String, Integer> input(){
        System.out.println(FIRST_MSG);
        String racer = Console.readLine();
        System.out.println(TRIAL_MSG);
        Integer trial = Integer.parseInt(Console.readLine());

        Map<String, Integer> input = new HashMap<>();
        input.put(racer, trial);
        return input;
    }

    public void raceStatus(ArrayList<racer> racers){
        for(racer player : racers){
            System.out.println(player.getName() + " : " + RACE_STRIDE.repeat(player.getStep()));
        }
        System.out.println();
    }

    public void output(List<String> winners){
        System.out.println(WINNER_MSG + String.join(", ", winners));
    }
}
