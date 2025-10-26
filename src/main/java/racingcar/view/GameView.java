package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.entity.Racer;
import racingcar.service.StringDivider;

import java.util.ArrayList;
import java.util.List;

public class GameView {
    private final static String FIRST_MSG = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final static String TRIAL_MSG = "시도할 횟수는 몇 회인가요?";
    private final static String WINNER_MSG = "최종 우승자 : ";
    private final static String RACE_STRIDE = "-";
    private final static String RACE_RESULT = "실행 결과";

    public record GameInput(ArrayList<Racer> racers, Integer trial) {}

    public GameInput input(){
        System.out.println(FIRST_MSG);
        String racers = Console.readLine();

        System.out.println(TRIAL_MSG);
        int trial = Integer.parseInt(Console.readLine().trim());
        
        if(trial <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }

        StringDivider stringDivider = new StringDivider();
        ArrayList<Racer> racerList = stringDivider.dividerString(racers);

        System.out.println(RACE_RESULT);
        return new GameInput(racerList, trial);
    }

    public void raceStatus(ArrayList<Racer> racers){
        for(Racer player : racers){
            System.out.println(player.getName() + " : " + RACE_STRIDE.repeat(player.getStep()));
        }
        System.out.println();
    }

    public void output(List<String> winners){
        System.out.println(WINNER_MSG + String.join(", ", winners));
    }
}
