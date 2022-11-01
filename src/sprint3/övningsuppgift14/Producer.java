package sprint3.övningsuppgift14;

public class Producer implements Runnable{
    Thread tråd = new Thread(this);
    QueueElement element;
    int time;
    MyQueue queue;
    int prio;

    public Producer(QueueElement element, int time, MyQueue queue, int prio) {
        this.element = element;
        this.time = time;
        this.queue = queue;
        this.prio = prio;
    }
    @Override
    public void run() {
        tråd.setPriority(prio);
        int interval = time*1000;
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(interval);
                queue.put(element);
                System.out.println("Lägger till " + element.string + "(prio: " + prio + ")");

            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        }
    }
}
