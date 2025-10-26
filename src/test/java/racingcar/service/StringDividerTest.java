package racingcar.service;

import org.junit.jupiter.api.Test;
import racingcar.entity.Racer;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringDividerTest {

    @Test
    void 입력구분자_테스트() {
        StringDivider divider = new StringDivider();
        ArrayList<Racer> racers = divider.dividerString("pobi,woni,jun");

        assertThat(racers).hasSize(3);
        assertThat(racers.get(0).getName()).isEqualTo("pobi");
        assertThat(racers.get(1).getName()).isEqualTo("woni");
        assertThat(racers.get(2).getName()).isEqualTo("jun");
    }

    @Test
    void 이름길이_예외_테스트() {
        StringDivider divider = new StringDivider();

        assertThatThrownBy(() -> divider.dividerString("pobi,verylongname"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름은 5글자 이상이여야 합니다.");
    }

    @Test
    void 공백이름_처리_테스트() {
        StringDivider divider = new StringDivider();
        ArrayList<Racer> racers = divider.dividerString(" pobi , woni , jun ");

        assertThat(racers).hasSize(3);
        assertThat(racers.get(0).getName()).isEqualTo("pobi");
        assertThat(racers.get(1).getName()).isEqualTo("woni");
        assertThat(racers.get(2).getName()).isEqualTo("jun");
    }

}