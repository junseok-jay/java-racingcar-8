package racingcar;

import racingcar.controller.GameController;
import racingcar.service.GameManager;
import racingcar.view.GameView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        final GameView gv = new GameView();
        GameController gameController = new GameController(gv, new GameManager(gv));
        gameController.gameRun();
    }
}
