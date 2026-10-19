package palg.Cviko04.Uloha01;

import java.io.IOException;
import java.util.Scanner;

public class Todo1 {

    // TODO 1: Najdi způsob, jak dosáhnout skóre přesně 50

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        while (true) {
            System.out.println("Vstup:");
            String level = scanner.nextLine();
            switch (level) {
                case "STONE":
                    score += 10;
                case "GOLD":
                    score += 30;
                case "WOOD":
                case "GLASS":
                case "IRON":
                    score += 4;
                case "SILVER":
                    score += 20;
                default:
                    score += 3;
            }
            System.out.println("Aktuální skóre: "+ score);
        }
    }
}
