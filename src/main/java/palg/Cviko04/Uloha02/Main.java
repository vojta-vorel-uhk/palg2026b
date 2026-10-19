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
            sum += castkaKProplaceni(v);
        }
        System.out.println("Pracovníkům bude proplaceno celkem: " + sum + " Kč");
    }

    // TODO: Vylepši třídy CestaAutem, NakupMaterialu a ZvlastniVydaje tak,
    //       aby metoda castkaKProplaceni z tohoto souboru mohla zmizet

    public static double castkaKProplaceni(Object vydaj) {
        if (vydaj instanceof CestaAutem v) {
            return v.getCastkaZaLitr() * v.getSpotrabaNa100km() * v.getUjetoKm() / 100d + v.getAmortizaceNaKm() * v.getUjetoKm();
        } else if (vydaj instanceof NakupMaterialu v) {
            if (v.isObsahujeDph())
                return v.getCastka();
            else
                return v.getCastka() * 1.21;
        } else if (vydaj instanceof ZvlastniVydaje v) {
            return v.getCastka();
        } else {
            throw new RuntimeException("Neznámý druh výdaje");
        }
    }
}
