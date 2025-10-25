package racingcar.service;

import racingcar.entity.racer;

import java.util.ArrayList;

public class stringDivider {
    private final static String divider = ",";

    public ArrayList<racer> dividerString(String racers){
        ArrayList<racer> racerContainer = new ArrayList<>();
        String[] racerList = racers.split(divider);

        for(String racerTemp : racerList){
            if(racerTemp.length() > 5) throw new IllegalArgumentException("racer name length can not be over than 5");

            racer temp = new racer(racerTemp.trim());
            racerContainer.add(temp);
        }
        return racerContainer;
    }
}
