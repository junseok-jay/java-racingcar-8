package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.entity.Racer;
import racingcar.view.GameView;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static GameView gameView;

    public GameManager(GameView gameView){
        this.gameView = gameView;
    }

    public ArrayList<Racer> raceRun(ArrayList<Racer> racers, int trial){
        while(trial-- > 0){
            for(Racer player : racers){
                run(player);
            }
            gameView.raceStatus(racers);
        }
        return racers;
    }

    public List<String> whoRacerWin(ArrayList<Racer> racers){
        racers.sort((r1, r2) -> - (r1.getStep() - r2.getStep()));

        List<String> winRacers = new ArrayList<>();
        for(Racer player : racers){
            if(player.getStep() < racers.getFirst().getStep()) break;

            winRacers.add(player.getName());
        }
        return winRacers;
    }

    public void run(Racer player){
        if(Randoms.pickNumberInRange(0, 9) >= 4){
            player.setStep(player.getStep() + 1);
        }
    }
}
