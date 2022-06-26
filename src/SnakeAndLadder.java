import java.util.Random;
public class SnakeAndLadder {

    //Initialising a variable to hold the value of position of player on the board
    public static final int position = 0;
    // Using random method to generate a random number between 1 and 6
    static Random r = new Random();
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");

        // Using random method to generate a random number between 1 and 6
        int roll = r.nextInt(6)+1;
        System.out.println("The Starting Position of the Player is "+position);
        System.out.println("The value of the die roll is "+roll);


    }
}
