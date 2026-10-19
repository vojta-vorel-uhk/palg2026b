package palg.Cviko04.Uloha02.DataModel;

public class CestaAutem implements Vydaj  {
    private final double castkaZaLitr;
    private final int ujetoKm;
    private final double spotrabaNa100km;
    private final int amortizaceNaKm;

    public CestaAutem(double castkaZaLitr, int ujetoKm, double spotrabaNa100km, int amortizaceNaKm) {
        this.castkaZaLitr = castkaZaLitr;
        this.ujetoKm = ujetoKm;
        this.spotrabaNa100km = spotrabaNa100km;
        this.amortizaceNaKm = amortizaceNaKm;
    }

    public double getCastkaZaLitr() {
        return castkaZaLitr;
    }

    public int getUjetoKm() {
        return ujetoKm;
    }

    public double getSpotrabaNa100km() {
        return spotrabaNa100km;
    }

    public int getAmortizaceNaKm() {
        return amortizaceNaKm;
    }

    @Override
    public double castkaKProplaceni() {
        return getCastkaZaLitr() * getSpotrabaNa100km() * getUjetoKm() / 100d
                + getAmortizaceNaKm() * getUjetoKm();
    }
}
