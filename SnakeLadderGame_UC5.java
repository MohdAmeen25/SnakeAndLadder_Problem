import java.util.Random;

public class SnakeLadderGame_UC5 {
    public static void main(String[] args) {
        final int Starting_position = 0;
        final int Win = 100;
        int checkCount;

        int Player_position = 0;
        System.out.println("Starting position is :" + Starting_position);

        while (Player_position <= Win) {

            Random random = new Random();
            int Rolling_Dice = random.nextInt(6) + 1;
            System.out.println("------------------------------------------");
            System.out.println("After Rolling dice " + Rolling_Dice);

            int PlayerCheck = random.nextInt(3);
            System.out.println("Player check, (0) No Play , (1) Ladder , (2) Snake " + PlayerCheck);

            if (PlayerCheck == 0) {
                System.out.println("Player stay at same position");
            } else if (PlayerCheck == 1) {
                int Check100=Player_position;
                Player_position = Player_position + Rolling_Dice;
                System.out.println(" 'Congratulation' you got the ladder your position will be increased by " + Rolling_Dice);
                if(Player_position>100){
                    Player_position=Check100;
                }
            } else if (PlayerCheck == 2) {
                Player_position = Player_position - Rolling_Dice;
                System.out.println(" 'OPPs' you got the Snake your position will be Decrease by " + Rolling_Dice);
                if (Player_position<0){
                    Player_position = 0;
                }
            }
            System.out.println("Position: " + Player_position);
        }
    }
}