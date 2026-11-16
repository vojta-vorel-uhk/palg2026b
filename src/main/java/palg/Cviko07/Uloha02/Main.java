package palg.Cviko07.Uloha02;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        var r = search(new File("C:\\Program Files"), "cef.pak");
        System.out.println(r);
    }

    // TODO: Doplň metodu tak, aby ve složce "startDir" a jejích podsložkách
    //       hledala soubor s názvem "fileName". Pokud ho najde, vrátí celou cestu k němu.
    public static String search(File startDir, String fileName) {
        for(var child : startDir.listFiles())
        {
            if(child.isDirectory())
            {
                var subResult = search(child,fileName);
                if(subResult != null)
                    return subResult;
            }
            else
            {
                if(child.getName().equals(fileName))
                    return child.getAbsolutePath();
            }
        }
        return null;
    }
}
