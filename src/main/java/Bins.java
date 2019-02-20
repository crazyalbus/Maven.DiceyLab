import java.util.HashMap;

public class Bins {
    private static Integer lowestBinNumber;
    private static Integer highestBinNumber;
    private static HashMap<Integer, Integer> workingBins;

    public Bins(Integer numberOfDice) {
        lowestBinNumber = numberOfDice;
        highestBinNumber = lowestBinNumber * 6;
    }

    public static Integer getLowestBinNumber() {
        return lowestBinNumber;
    }

    public static Integer getHighestBinNumber() {
        return highestBinNumber;
    }

    public HashMap<Integer, Integer> createBins() {
        workingBins = new HashMap<>();

        for (int binNumber = lowestBinNumber; binNumber <= highestBinNumber; binNumber++) {
            workingBins.put(binNumber, 0);
        }

        return workingBins;
    }

    public void incrementBin(Integer binNumber) {
        Integer currentBinValue = workingBins.get(binNumber);
        currentBinValue = currentBinValue + 1;
        workingBins.replace(binNumber, currentBinValue);
    }

}
