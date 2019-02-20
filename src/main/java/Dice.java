public class Dice {
    private static Integer numberOfDice;

    public Dice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public static Integer tossAndSum(Integer numberOfDice) {
        Integer sum = 0;
        for (int i = 1; i <= numberOfDice; i++) {
            sum = sum + (int) Dice.randomDieToss();
        }
    return sum;
    }

    public static double randomDieToss() {
        return Math.floor((Math.random() * 60)/10) + 1;
    }
}
