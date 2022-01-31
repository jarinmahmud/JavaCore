package mztech.classwork;

public class Dice {
    public static void main(String[] args) {
        //Modify dice game using while loop to continue playing until user wins
        // ( I should have to run the game once and then keep trying in console)
//check how many tries it needed

        boolean won = false;
        int rounds = 1;
        while (!won) {
            //generate two random numbers
            int randomInt = getRandomInRange(1, 6);
            int randomIntTwo = getRandomInRange(1, 6);

            System.out.println(randomInt + " and " + randomIntTwo);

            //condition for matching
            if (randomInt == randomIntTwo) {
                System.out.println("Number matched. You won! It took " + rounds + " rounds to win.  ");
                won = true;// this will break the loop so we have to set it when the number matches.
            }
            rounds++;


        }

    }

    public static int getRandomInRange(int min, int max) {
        return (int) (Math.floor(Math.random() * (max - min + 1) + min));
    }
}
