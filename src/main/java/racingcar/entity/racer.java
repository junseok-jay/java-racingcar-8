package racingcar.entity;

public class racer {
    private final String name;
    private Integer step;

    public racer(String name){
        this.name = name;
        this.step = 0;
    }

    public String getName(){
        return this.name;
    }
    public Integer getStep(){
        return this.step;
    }

    public void setStep(Integer step){
        this.step = step;
    }
}
