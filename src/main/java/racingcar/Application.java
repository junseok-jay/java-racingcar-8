package racingcar;

import racingcar.controller.gameController;
import racingcar.service.gameManager;
import racingcar.view.gameView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        final gameView gv = new gameView();
        gameController gamecontroller = new gameController(gv, new gameManager(gv));
        gamecontroller.gameRun();
    }
}
