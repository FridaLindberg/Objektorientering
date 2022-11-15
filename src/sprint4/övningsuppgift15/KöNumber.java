package sprint4.övningsuppgift15;

import java.util.ArrayList;
import java.util.List;

public class KöNumber <E extends Number> implements KöInterface <E>{
    List<E> list = new ArrayList<>();

    @Override
    public void put(E e) {
        list.add(e);
    }
    @Override
    public E take() {
        E element = list.get(0);
        list.remove(0);
        return element;
    }
    @Override
    public int size() {
        return list.size();
    }
    public double summera() { //funkar men kanske inte perfekt
        double summa = 0;
        for (E number: list) {
            summa += number.doubleValue();
        }
        return summa;
    }
}
