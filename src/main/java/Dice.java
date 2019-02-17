public class Dice {
    private Integer numberOfDice;

    public Dice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public static Integer tossAndSum(Integer numberOfDice) {
        Integer die1 = (int) Dice.randomDieToss();
        Integer die2 = (int) Dice.randomDieToss();

    return die1 + die2;
    }

    public static double randomDieToss() {
        return Math.floor((Math.random() * 60)/10) + 1;
    }
}
