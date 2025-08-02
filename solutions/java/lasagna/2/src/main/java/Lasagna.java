public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        return (expectedMinutesInOven() - actualMinutesInOven);        
    }

    public int preparationTimeInMinutes(int noOfLayers) {
        return (noOfLayers * PREPARATION_TIME_PER_LAYER);
    }

    public int totalTimeInMinutes(int noOfLayers, int actualMinutesInOven) {
        return (preparationTimeInMinutes(noOfLayers) + actualMinutesInOven);
    }
}
