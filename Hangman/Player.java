import java.util.Scanner;
public class Player {
    private String name = "";
    private int score = 500;
    public Player() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();

    }

    public void addScore(Spinner s) {
        int spinValue;
        spinValue = s.spin();
        System.out.println("You rolled " + spinValue + "!");
        score += spinValue;
        System.out.println();
        System.out.println("Your current total is " + score + ".");
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


}
