/*
In this program there are 2 player and the first one to reach 100 will win the game
 */
public class SnakeAndLadder {

    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");

        //Initialising a variable to hold the value of position of player on the board
        boolean player1Win = false;
        boolean player2Win = false;
        int player1position = 0;
        int player2position = 0;
        int player1RollCount = 0;
        int player2RollCount = 0;
        String optionValue = "";
        boolean chance = true;
        boolean temp = true;
        while (player1Win != true && player2Win != true) {
            int player1 = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("The value of the die roll is " + player1);
            if ((player1position != 100) && (player1position >= 0) && (player2position != 100) && (player2position >= 0)) {
                if (chance == true) {
                    player1RollCount += 1;
                    temp = true;
                    chance = false;
                    if ((player1position + player1) <= 100) {

                        int option = (int) (Math.floor(Math.random() * 10) % 3 + 1);
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
                        switch (optionValue) {
                            case "No Play":
                                System.out.println("No Play Option rolled. Skip this turn");
                                chance = false;
                                break;
                            case "Snake":
                                player1position -= player1;
                                if (player1position >= 0) {
                                    System.out.println("Snake Option rolled. Move Backwards");
                                } else {
                                    player1position = 0;
                                    System.out.println("Snake Option moved to Zero");
                                }
                                break;
                            case "Ladder":
                                player1position += player1;
                                if (player1position <= 100) {
                                    System.out.println("Ladder Option rolled. Move Forward");
                                } else {
                                    System.out.println("Sorry! Cant move forward");
                                    player1position -= player1;
                                }
                                chance = true;
                                break;
                        }
                    }
                }else {
                    temp = false;
                    player2RollCount += 1;
                    chance = true;
                    if ((player2position + player1) <= 100) {
                        int option = (int) (Math.floor(Math.random() * 10) % 3 + 1);
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
                        switch (optionValue) {
                            case "No Play":
                                System.out.println("No Play Option rolled. Skip this turn");
                                chance = true;
                                break;
                            case "Snake":
                                player2position -= player1;
                                if ((player2position - player1) >= 0) {
                                    System.out.println("Snake Option rolled. Move Backwards");
                                } else {
                                    player2position = 0;
                                    System.out.println("Snake Option moved to Zero");
                                }
                                break;
                            case "Ladder":
                                player2position += player1;
                                if ((player2position + player1) <= 100) {
                                    System.out.println("Ladder Option rolled. Move Forward");
                                } else {
                                    System.out.println("Sorry! Cant move forward");
                                    player2position -= player1;
                                }
                                chance = false;
                                break;
                            default:
                                break;
                        }
                    }
                }
            } else if (player1position == 100) {
                player1Win = true;
                break;
            } else if (player2position == 100) {
                player2Win = true;
                break;
            }
            if (temp == true) {
                System.out.println(player1 + "rolled and player1 position changed/remained in " + player1position);
                System.out.println("No Play for player 2 position is " + player2position);
                System.out.println("\n");
            } else {
                System.out.println(player1 + "rolled came and player1 position changed/remained in " + player2position);
                System.out.println("No Play for player 1 position is " + player1position);
                System.out.println("\n");
            }

        }if (player1Win == true) {
            System.out.println("Player1 Won the Game with" + player1RollCount + " rolls");
        } else if (player2Win) {
            System.out.println("Player2 Won the Game with" + player2RollCount + " rolls");
        }
    }
}