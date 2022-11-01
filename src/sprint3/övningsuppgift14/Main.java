package sprint3.övningsuppgift14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyQueue queue = new MyQueue();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hur många producenter?");
        int p = sc.nextInt();
        Producer[] producers = new Producer[p];
        for (int i = 0; i < producers.length; i++) {
            System.out.println("Producent " + (i+1));
            System.out.println("Vilket intervall?");
            int time = sc.nextInt();
            System.out.println("Vilket ord?");
            String text = sc.next();
            System.out.println("Vilken prio?");
            int prio = sc.nextInt();
            QueueElement e = new QueueElement(text, prio);
            producers[i] = new Producer(e, time, queue, prio);
        }
        System.out.println("Hur många konsumenter?");
        int c = sc.nextInt();
        Consumer[] consumers = new Consumer[c];
        for (int i = 0; i < consumers.length; i++) {
            System.out.println("Konsument " + (i+1));
            System.out.println("Vilket intervall?");
            int time = sc.nextInt();
            consumers[i] = new Consumer(time,queue);
        }

        for (int i = 0; i < producers.length; i++) {
            producers[i].tråd.start();
        }
        for (int i = 0; i < consumers.length; i++) {
            consumers[i].tråd.start();
        }
        Thread.sleep(10000);
        System.out.println("Antal ord kvar: " + queue.list.size());
        System.exit(0);




    }
}
