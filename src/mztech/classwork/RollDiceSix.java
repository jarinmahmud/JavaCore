package mztech.classwork;

public class RollDiceSix {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;

        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("You roll " + randomInt + ".");

        if (randomInt == 6) {
            System.out.println("You won!");
        } else {
            System.out.println("Game over. Better Luck next time.");
        }
    }
}

