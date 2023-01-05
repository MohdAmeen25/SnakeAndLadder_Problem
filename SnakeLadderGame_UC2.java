import java.util.Random;

public class SnakeLadderGame_UC2 {
    public static void main(String[] args) {
        int Starting_position = 0;
        System.out.println("Starting position is : " + Starting_position);

        Random random = new Random();
        int	Rolling_Die = random.nextInt(6)+1;
        System.out.println(Rolling_Die);
    }
}
