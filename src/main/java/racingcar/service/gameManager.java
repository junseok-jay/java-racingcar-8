package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.entity.racer;
import racingcar.view.gameView;

import java.util.ArrayList;
import java.util.Random;

public class gameManager {
    private static gameView gameview;
    private static Randoms randoms;

    public gameManager(gameView gameview){
        this.gameview = gameview;
    }

    public ArrayList<racer> raceRun(ArrayList<racer> racers, int trial){
        while(0 < trial--){
            for(racer player : racers){
                run(player);
            }
            gameview.raceStatus(racers);
        }
        return racers;
    }

    public void run(racer player){
        if(randoms.pickNumberInRange(0, 9) >= 4){
            player.setStep(player.getStep() + 1);
        }
    }
}
