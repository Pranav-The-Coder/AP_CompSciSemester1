
public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int totalDays;
    private int activeDays;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        this.totalSteps = 0;
        this.totalDays = 0;
        this.activeDays = 0;
    }


    public void addDailySteps(int steps) {
        totalSteps = totalSteps + steps;
        totalDays = totalDays + 1;
        if (steps >= minSteps) {
            activeDays = activeDays + 1;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        }
        
        double average = totalSteps/totalDays;
        return average;
    }
}
