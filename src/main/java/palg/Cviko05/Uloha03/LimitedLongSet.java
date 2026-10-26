package palg.Cviko05.Uloha03;

public class LimitedLongSet implements LongSet {
    boolean[] data = new boolean[1_000_001];
    public void add(long value) {
        data[(int)value] = true;
    }

    public void remove(long value) {
        data[(int)value] = false;
    }

    public boolean contains(long value) {
        return data[(int)value];
    }
}
