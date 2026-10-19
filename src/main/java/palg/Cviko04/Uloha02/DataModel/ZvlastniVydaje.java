package palg.Cviko04.Uloha02.DataModel;

public class ZvlastniVydaje implements Vydaj {
    private final String duvod;
    private final int castka;

    public ZvlastniVydaje(String duvod, int castka) {
        this.duvod = duvod;
        this.castka = castka;
    }

    public String getDuvod() {
        return duvod;
    }

    public int getCastka() {
        return castka;
    }

    @Override
    public double castkaKProplaceni() {
        return getCastka();
    }
}
