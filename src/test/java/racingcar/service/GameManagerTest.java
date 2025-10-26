package racingcar.service;

import org.junit.jupiter.api.Test;
import racingcar.entity.Racer;
import racingcar.view.GameView;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameManagerTest {
    private final GameManager gameManager = new GameManager(new GameView());

    @Test
    void 우승자1명_판별_테스트() {
        ArrayList<Racer> racers = new ArrayList<>();
        for(int i=0;i<5;i++){
            Racer testRacer = new Racer("racer" + Integer.toString(i));
            testRacer.setStep(i);
            racers.add(testRacer);
        }
        List<String> winners = gameManager.whoRacerWin(racers);

        assertEquals(1, winners.size());
        assertEquals("racer4", winners.getFirst());
    }

    @Test
    void 공동우승자_판별_테스트() {
        ArrayList<Racer> racers = new ArrayList<>();
        for(int i=0;i<5;i++){
            Racer testRacer = new Racer("racer" + Integer.toString(i));
            testRacer.setStep(3);
            racers.add(testRacer);
        }

        List<String> winners = gameManager.whoRacerWin(racers);

        assertEquals(List.of("racer0", "racer1", "racer2", "racer3", "racer4"), winners);
    }
}
