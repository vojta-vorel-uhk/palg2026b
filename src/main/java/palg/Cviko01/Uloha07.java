package palg.Cviko01;

import java.util.Arrays;
import java.util.Scanner;

public class Uloha07 {
    public static void main(String[] args) {
        int int1 = 20;
        String string1 = "1FA6P8CF0H5123456";
        Car car1 = new Car();

        System.out.println("BEFORE:");
        System.out.println(int1);
        System.out.println(string1);
        System.out.println(car1);

        repairInt(int1);
        repairString(string1);
        repairCar(car1);

        System.out.println("AFTER:");
        System.out.println(int1); // TODO: Doplň metodu repairInt tak, aby se výstup lišil
        System.out.println(string1); // TODO: Doplň metodu repairString tak, aby se výstup lišil
        System.out.println(car1); // TODO: Doplň metodu repairCar tak, aby se výstup lišil
    }

    public static void repairInt(int input)
    {
        // Nejde, protože int je primitivní
        // datový typ, do metody putuje
        // jen jeho holá číselná hodnota
    }
    public static void repairString(String input)
    {
        // Nejde, protože String nemá žádnou
        // metodu, která by ho vnitřně změnila
        // (např. nějaký setter)
        // Takové třídě říkáme, že je "immutable"
    }
    public static void repairCar(Car input)
    {
        input.SetDrivingProblemsCount(0);
    }
}
