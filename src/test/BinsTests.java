import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class BinsTests {

    @Test
    public void testBinsConstructor() {
        //Given
        Integer numberOfDice = 2;

        //When
        Bins newBins = new Bins(numberOfDice);
        HashMap<Integer, Integer> bins = newBins.createBins();
        Integer expectedSize = 11;
        Integer actualSize = bins.size();

        //
        Assert.assertEquals(expectedSize, actualSize);

    }


    @Test
    public void testBinsGetBin() {
        //Given
        Bins newBins = new Bins(2);
        HashMap<Integer, Integer> testBins = newBins.createBins();
        Integer binToGet = 10;
        Integer expectedCount = 0;


        //When
        Integer actualCount = testBins.get(10);

        //Then
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testBinsIncrementBin() {
//Given
        Bins newBins = new Bins(2);
        HashMap<Integer, Integer> testBins = newBins.createBins();
        Integer binToIncrement = 10;
        Integer expectedCount = 1;

        //When
        newBins.incrementBin(10);
        Integer actualCount = testBins.get(binToIncrement);

                //Then
        Assert.assertEquals(expectedCount, actualCount);
    }
}