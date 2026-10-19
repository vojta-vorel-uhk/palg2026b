package palg.Cviko04.Uloha02;

import palg.Cviko04.Uloha02.DataModel.CestaAutem;
import palg.Cviko04.Uloha02.DataModel.NakupMaterialu;
import palg.Cviko04.Uloha02.DataModel.ZvlastniVydaje;

public class DataSource {
    public static Object[] getData() {
        return new Object[]{
                new ZvlastniVydaje("Pokuta", 1000),
                new CestaAutem(45.5, 150, 7.2, 2),
                new NakupMaterialu(45000, false),
                new NakupMaterialu(32600, true),
                new CestaAutem(46.5, 251, 7.2, 2),
        };
    }
}
