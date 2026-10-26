package palg.Cviko05.Uloha03;

import java.util.ArrayList;

public class NaiveLongSet implements LongSet {

    private ArrayList<Long> data = new ArrayList<>();
    public void add(long value) {
        if(!data.contains(value))
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
