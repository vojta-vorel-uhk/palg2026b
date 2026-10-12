package palg.Cviko03;

import java.util.Scanner;

public class Uloha04 {
    public static void main(String[] args) {
    }

    public static void findValue(int[][] matrix, int find) {
        int foundInRow = -1;
        int foundInCol = -1;


        // TODO: Doplň cyklus, který se pokusí v poli najít hledanou hodnotu


        if (foundInRow >= 0 && foundInCol >= 0) {
            System.out.println("Nalezeno na pozici: X=" + (foundInCol + 1) + ", Y=" + (foundInRow + 1));
        } else {
            System.out.println("Nenalezeno");
        }
        System.out.println("Děkujeme, že jste využili tuto metodu, napište prosím zda jste byli spokojeni:");
        Scanner scanner = new Scanner(System.in);
        String feedback = scanner.nextLine();
    }
}