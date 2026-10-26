package palg.Cviko05.Uloha03;

import java.util.HashSet;

public class FastLongSet implements LongSet {
    HashSet<Long> data = new HashSet<>();
    @Override
    public void add(long value) {
        data.add(value);
    }

    @Override
    public void remove(long value) {
        data.remove(value);
    }

    @Override
    public boolean contains(long value) {
        return data.contains(value);
    }
}
