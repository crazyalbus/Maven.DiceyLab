import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class SimulationTests {


    @Test

    public void testSimulationConstructor() {

        //Given
        Integer numberOfDies = 2;
        Integer numberOfTosses = 4;

        //When
        Simulation testSimulation = new Simulation(numberOfDies, numberOfTosses);

        //Then
        Assert.assertEquals(numberOfDies, testSimulation.getNumberOfDies());

    }

    @Test

    public void testSimulation() {
        //Given
        Integer numberOfDies = 2;
        Integer numberOfTosses = 10000;

        //When
        Simulation testSimulation = new Simulation(numberOfDies, numberOfTosses);
        HashMap<Integer, Integer> results = testSimulation.runSimulation(numberOfDies, numberOfTosses);

        //Then
        testSimulation.printResults(results);
    }
}


//    Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run
//
//        Create a simulation where two dies are thrown one million times. Keep track of all results.
//
//        Simulation sim = new Simulation(2, 10000);
//
//        sim.runSimulation();
//
//        sim.printResults();
//
//        You can use a main() to run the simulations.