package racingcar.controller;

import racingcar.service.GameManager;
import racingcar.view.GameView;

public class GameController {
    private GameView gameView;
    private GameManager gameManager;

    public GameController(GameView gameView, GameManager gameManager){
        this.gameView = gameView;
        this.gameManager = gameManager;
    }

    public void gameRun(){
        GameView.GameInput newGame = gameView.input();
        var racers = gameManager.raceRun(newGame.racers(), newGame.trial());
        gameView.output(gameManager.whoRacerWin(racers));
    }
}
