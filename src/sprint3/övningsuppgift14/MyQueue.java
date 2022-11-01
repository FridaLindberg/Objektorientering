package sprint3.övningsuppgift14;

import java.util.ArrayList;

public class MyQueue {
    ArrayList<QueueElement> list = new ArrayList<>();
    public int size() {  // ger antalet element i kön
        return list.size();
    }

    public synchronized void put(QueueElement obj) {
        int p = Thread.currentThread().getPriority();
        //alternativt sätt att ta fram prioriteten:
        //int p = obj.getPri();
        int i;

        //leta baklänges i kön tills rätt prio hittas
        // i kommer att tilldelas värdet på den plats före där vi vill lägga in vårt obj
        for (i=size()-1; i>=0 && p > list.get(i).prio; i--)
            ;
        list.add(i+1, obj);
        notify();

    }
    public synchronized QueueElement take() {
        while (list.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException exception) {
                return null;
            }
        }
        QueueElement firstElement = list.get(0);
        list.remove(0);
        return firstElement;
    }
}
