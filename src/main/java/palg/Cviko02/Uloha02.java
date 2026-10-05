package palg.Cviko02;

import java.io.IOException;
import java.util.Arrays;

public class Uloha02
{
    // Doplň metodu sumOfSmall (se dvěma vstupy), která vrátí součet čísel v daném poli,
    // která jsou nižší než daný limit.
    // Ze souboru southMoravia.txt zjisti, kolik lidí žije v obcích s méně než 1000 obyvatel.

    public static void main(String[] args)
    {
        try {
            System.out.println(
                sumOfSmall(
                    FileUtils.integersFromFile("southMoravia.txt"),
                    1000
                )
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int sumOfSmall( int[] values , int limit)
    {
       return Arrays.stream(values)
                .filter(x -> x < limit)
                .sum();
    }
}
