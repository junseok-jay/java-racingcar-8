package racingcar.entity;

public class racer {
    private String name;
    private Integer step;

    public racer(String name, Integer step){
        this.name = name;
        this.step = step;
    }

    public String getName(){
        return this.name;
    }
    public Integer getStep(){
        return this.step;
    }
}
