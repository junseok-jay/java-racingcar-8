package racingcar.service;

import racingcar.entity.Racer;

import java.util.ArrayList;

public class StringDivider {
    private final static String divider = ",";

    public ArrayList<Racer> dividerString(String racers){
        ArrayList<Racer> racerContainer = new ArrayList<>();
        String[] racerList = racers.split(divider);

        for(String racerTemp : racerList){
            Racer newRacer = new Racer(racerTemp.trim());
            if(newRacer.getName().length() > 5) throw new IllegalArgumentException("자동차의 이름은 5글자 이상이여야 합니다.");

            racerContainer.add(newRacer);
        }
        return racerContainer;
    }
}
