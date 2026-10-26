package palg.Cviko05.Uloha02;

import java.util.ArrayList;

public class Queue implements Waiting {
    ArrayList<Object> data = new ArrayList<>();
    public void add(Object object) {
        data.add(object);
    }

    public Object remove() {
        if(data.isEmpty())
            return null;
        return data.removeFirst();
    }

    public int count() {
        return data.size();
    }
}
