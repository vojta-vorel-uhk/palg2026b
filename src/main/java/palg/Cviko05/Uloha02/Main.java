package palg.Cviko05.Uloha02;

import java.io.IOException;
import java.util.Random;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        // 1) Přidej třídy Queue a Stack implementující rozhraní Waiting

        // 2) Na jedné z nich otestuj, jaký je průměrný počet čekajících,
        //   pokud 100_000 krát provedeme add nebo remove s pravděpodobností 1:1
        Queue q = new Queue();
        Random r = new Random();
        for(int i=0;i<100_000;i++){
            if(r.nextBoolean())
                q.add("STRING"+i);
            else
                q.remove();
            System.out.println(q.count());
        }
        // NA DOMA: v každém kroku započítat aktuální počet
        // a tím spočítat průměrný počet
    }
}
