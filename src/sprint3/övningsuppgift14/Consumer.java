package sprint3.övningsuppgift14;

public class Consumer implements Runnable{
    Thread tråd = new Thread(this);
    int time;
    MyQueue queue;

    public Consumer(int time, MyQueue queue) {
        this.time = time;
        this.queue = queue;
    }

    @Override
    public void run() {
        int interval = time*1000;
        while(!Thread.interrupted()){
            try {
                Thread.sleep(interval);
                QueueElement element = queue.take();
                System.out.println("Tar ut " + element.string);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        }
    }
}
