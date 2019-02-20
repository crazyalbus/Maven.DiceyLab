import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Simulation {


    private Integer numberOfDice;
    private Integer numberOfTosses;

    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfDice = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        Dice dice = new Dice(this.numberOfDice);
        Bins bins = new Bins(this.numberOfDice);
    }

    public static void main (String[] args) {
        Scanner getSimulationParameters = new Scanner(System.in);
        System.out.println("How many dice do you want to throw?");
        Integer numberOfDies = getSimulationParameters.nextInt();
        System.out.println("How many times do you want to throw them?");
        Integer numberOfTosses = getSimulationParameters.nextInt();

        Simulation mySimulation = new Simulation(numberOfDies, numberOfTosses);
        HashMap<Integer, Integer> results = mySimulation.runSimulation(numberOfDies, numberOfTosses);

        mySimulation.printResults(results);
    }

    public HashMap<Integer, Integer>runSimulation(Integer numberOfDies, Integer numberOfTosses) {
        Bins simulation = new Bins(numberOfDies);
        HashMap<Integer, Integer> simulationBins = simulation.createBins();
        for (int i = 1; i <= numberOfTosses ; i++) {
            int sumOfToss = Dice.tossAndSum(numberOfDies);
            simulation.incrementBin(sumOfToss);
        }

        return simulationBins;

    }


    public void printResults(HashMap<Integer, Integer> results) {
        String allBins = "";
        for (int i = numberOfDice; i < numberOfDice + results.size(); i++) {
            Integer binTally = results.get(i);
            Float percent = (float) binTally / numberOfTosses;
            String toAdd = String.format("%2d %9d: %1.2f\n", i, binTally, percent);
            allBins = allBins + toAdd;
        }
        System.out.print(allBins);
    }

    public Integer getNumberOfDies() {
        return numberOfDice;
    }
}
