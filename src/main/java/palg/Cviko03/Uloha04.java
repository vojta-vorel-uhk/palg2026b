package palg.Cviko03;

import java.util.Scanner;

public class Uloha04 {
    public static void main(String[] args) {
    }

    public static void findValue(int[][] matrix, int find) {
        int foundInRow = -1;
        int foundInCol = -1;

        // TODO: Doplň cyklus, který se pokusí v poli najít hledanou hodnotu
        boolean done = false;
        for(int row=0; row<matrix.length; row++)
        {
            for(int col=0;col<matrix[row].length; col++)
            {
                if(matrix[row][col] == find){
                    foundInRow = row;
                    foundInCol = col;
                    done = true;
                    break;
                    // Možnost 2: přeorganizovat a použít return
                    // Možnost 3: break s labelem
                }
            }
            //  Možnost 0: if (foundInRow >= 0 && foundInCol >= 0)
            //               break;
            if(done)
                break;
        }
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