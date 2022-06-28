import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");

        //Initialising a variable to hold the value of position of player on the board
        int position = 0;
        String optionValue = "";
        int diceRolled = 0;

        // Using random method to generate a random number between 1 and 6
        Random r = new Random();

        while (position < 100) {
            // Using random method to generate a random number between 1 and 3
            int option = r.nextInt(1, 4);
            switch (option) {
                case 1:
                    optionValue = "No Play";
                    break;
                case 2:
                    optionValue = "Ladder";
                    break;
                case 3:
                    optionValue = "Snake";
                    break;
                default:
                    break;
            }


            // Using random method to generate a random number between 1 and 6
            int roll = r.nextInt(6) + 1;
            diceRolled++;
            System.out.println("The value of the die roll is " + roll);

            if (optionValue == "No Play") {
                System.out.println("No Play Option rolled. Skip this turn");
            } else if (optionValue == "Ladder") {
                System.out.println("Ladder Option rolled. Move Forward");
                position = position + roll;
                if (position >100){
                    System.out.println("Sorry Can't go forward");
                    position = position - roll;
                }
            } else {
                System.out.println("Snake Option rolled. Move Backwards");
                position = position - roll;
                if (position < 0){
                    position = 0;
                }
            }
            System.out.println("The Position of the Player is " + position);

        }
        System.out.println("Number of times dice rolled is " +diceRolled);
    }
}
