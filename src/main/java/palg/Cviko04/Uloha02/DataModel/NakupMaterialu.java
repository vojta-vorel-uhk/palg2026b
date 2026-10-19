package palg.Cviko04.Uloha02.DataModel;

public class NakupMaterialu implements Vydaj {
    private final int castka;
    private final boolean obsahujeDph;

    public NakupMaterialu(int castka, boolean obsahujeDph) {
        this.castka = castka;
        this.obsahujeDph = obsahujeDph;
    }

    public int getCastka() {
        return castka;
    }

    public boolean isObsahujeDph() {
        return obsahujeDph;
    }

    @Override
    public double castkaKProplaceni() {
        if (isObsahujeDph())
            return getCastka();
        else
            return getCastka() * 1.21;
    }
}
