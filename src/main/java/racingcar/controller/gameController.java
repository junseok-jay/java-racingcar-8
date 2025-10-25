package racingcar.controller;

import racingcar.service.gameManager;
import racingcar.view.gameView;

public class gameController {
    private gameView gameview;
    private gameManager gamemanager;

    public gameController(gameView gameview, gameManager gamemanager){
        this.gameview = gameview;
        this.gamemanager = gamemanager;
    }

    public void gameRun(){
        gameView.GameInput newGame = gameview.input();
        var racers = gamemanager.raceRun(newGame.racers(), newGame.trial());
        gameview.output(gamemanager.whoRacerWin(racers));
    }
}
