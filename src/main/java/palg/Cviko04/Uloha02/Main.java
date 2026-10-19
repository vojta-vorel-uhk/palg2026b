package palg.Cviko04.Uloha02;

import palg.Cviko04.Uloha02.DataModel.CestaAutem;
import palg.Cviko04.Uloha02.DataModel.NakupMaterialu;
import palg.Cviko04.Uloha02.DataModel.ZvlastniVydaje;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        var vydaje = DataSource.getData();
        var sum = 0d;
        for (var v : vydaje) {
            sum += v.castkaKProplaceni();
        }
        System.out.println("Pracovníkům bude proplaceno celkem: " + sum + " Kč");
    }

    // TODO: Vylepši třídy CestaAutem, NakupMaterialu a ZvlastniVydaje tak,
    //       aby metoda castkaKProplaceni z tohoto souboru mohla zmizet

}
