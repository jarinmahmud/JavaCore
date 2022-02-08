package mztech.Dice;

public class RollDiceGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;

        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Dice 1: " + randomInt);
        int randomIntTwo = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Dice 2: " + randomIntTwo);
        if (randomInt == randomIntTwo) {
            System.out.println("You won!");
        } else {
            System.out.println("Better Luck next time.");
        }
    }
}
