interface xyz {
    void run();
    void start();
    void stop();
}

abstract class Test implements xyz {
    public void run() {
        System.out.println("Running only");
    }
    
}


class Runner extends Test {
    public void start() {}  
    public void stop() {}   
}

public class Main {
    public static void main(String[] args) {
        Runner obj = new Runner();
        obj.run();  
    }
}
