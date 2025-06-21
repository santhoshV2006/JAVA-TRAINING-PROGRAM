class PingPong {
    synchronized void ping() {
        System.out.println("Ping");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Ping interrupted");
        }
    }

    synchronized void pong() {
        System.out.println("Pong");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Pong interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PingPong obj = new PingPong();

        Thread t1 = new Thread(() -> {
            obj.ping();
        });

        Thread t2 = new Thread(() -> {
            obj.pong();
        });

        t1.start();
        try { t1.join(); } catch (InterruptedException e) {}
        
        t2.start();
        try { t2.join(); } catch (InterruptedException e) {}
    }
}
