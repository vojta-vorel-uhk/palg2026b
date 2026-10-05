package palg.Cviko02;

import java.io.IOException;

public class Uloha01 {
    // Vesmírné plavidlo stoupá k mezinárodní vermírné stanici.
    // Doplň metodu isAscending, která zkontroluje, zda data z výškoměru (spaceX.txt)
    // vykazují vždy stoupání.

    public static void main(String[] args)
    {
        try {
            var values = FileUtils.floatsFromFile("spaceX.txt");
            if(isAscending(values)) {
                System.out.println("OK");
            }
            else {
                System.out.println("NOT_OK");
            }
        } catch (IOException e) {
            System.out.println("Akce se nepovedla");
            return;
        }
    }

    public static boolean isAscending(float[] values)
    {
        for(int i=0; i<values.length-1; i++)
        {
            if(values[i] >= values[i+1]){
                return false;
            }
        }
        return true;
    }
}
