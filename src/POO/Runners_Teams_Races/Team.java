package POO.Runners_Teams_Races;

public class Team {

    private String name;
    private Runner[] runners;
    private int numRunners;
    private boolean international;

    public Team(String name, boolean international) {
        this.name = name;
        this.international = international;
        this.runners = new Runner[5];
        this.numRunners = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public void addRunner(Runner r){
    }

    public float averageTimes(){
        return 0;
    }
}
