package palg.Cviko04.Uloha01;

import java.io.IOException;
import java.util.Scanner;

// TODO 2: Oprav kód

public class Todo2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Zvolte úroveň uživatele (Guest:1, Employee:2, Admin:3)");
            int level = scanner.nextInt();
            String message = "";
            switch (level) {
                case 1:
                    message = "Zvolil jste úroveň Guest";
                case 2:
                    message = "Zvolil jste úroveň Employee";
                case 3:
                    message = "Zvolil jste úroveň Admin";
            }
            System.out.println(message);
        }
    }
}
