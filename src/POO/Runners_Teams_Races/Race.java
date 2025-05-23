package POO.Runners_Teams_Races;

public class Race {

    private String raceID;
    private Runner[] runners;
    private float[] times;
    private boolean isFinals;
    private int numRunners;
    private float classificationTime;

    public Race(String raceID) {
        this.raceID = raceID;
        this.runners = new Runner[8];
        this.times = new float[8];
    }

    public Race (String raceID, boolean finals, float classificationTime){
        this(raceID);
        this.isFinals = finals;
        this.classificationTime = classificationTime;
    }

    public String getRaceID() {
        return raceID;
    }

    public boolean isFinals() {
        return isFinals;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public float getClassificationTime() {
        return classificationTime;
    }

    public void setRaceID(String raceID) {
        this.raceID = raceID;
    }

    public void setFinals(boolean finals) {
        isFinals = finals;
    }

    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    public void setClassificationTime(float classificationTime) {
        this.classificationTime = classificationTime;
    }

    public void addRunner(Runner r){
    }

    public void addTimeToRunner(Runner r, float time){ }

    public float bestTime(){ return 0; }

    public String bestRunner(){ return null; }

    public float averageTimes(){ return 0; }
}
