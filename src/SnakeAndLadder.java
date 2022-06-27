import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");

        //Initialising a variable to hold the value of position of player on the board
        int position = 0;
        String optionValue = "";

        // Using random method to generate a random number between 1 and 6
        Random r = new Random();

        // Using random method to generate a random number between 1 and 3
        int option = r.nextInt(1,4);
        switch (option){
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
        int roll = r.nextInt(6)+1;
        System.out.println("The Starting Position of the Player is "+position);
        System.out.println("The value of the die roll is "+roll);

        if(optionValue == "No Play")
        {
            System.out.println("No Play Option rolled. Skip this turn");
        }else if (optionValue == "Ladder")
        {
            System.out.println("Ladder Option rolled. Move Forward");
            position = position + roll;
            System.out.println("New position is " +position);
        }
        else
        {
            System.out.println("Snake Option rolled. Move Backwards");
            position = position - roll;
            System.out.println("New position is " +position);
        }


    }
}
