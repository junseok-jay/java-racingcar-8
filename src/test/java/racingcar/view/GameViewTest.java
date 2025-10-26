package racingcar.view;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameViewTest {
    private String INPUT_NAMES = "pobi, woni";

    @Test
    void 시도횟수입력_음수_테스트(){
        InputStream in = makeInput(INPUT_NAMES, "-1");
        System.setIn(in);

        GameView gameView = new GameView();

        assertThrows(
                IllegalArgumentException.class,
                gameView::input
        );
    }

    @Test
    void 시도횟수입력_문자_테스트(){
        InputStream in = makeInput(INPUT_NAMES, "a");
        System.setIn(in);

        GameView gameView = new GameView();

        assertThrows(
                IllegalArgumentException.class,
                gameView::input
        );
    }

    private InputStream makeInput(String names,String num){
        String input = names + "\n" + num + "\n";
        return new ByteArrayInputStream(input.getBytes());
    }
}
