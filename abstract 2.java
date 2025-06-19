public class AbstractQuiz {
    public static void main(String[] args) {
        SayBye sb = new SayBye();  
        Flyer f = new Eagle();     
        f.fly();
    }
}

abstract class Vehicle {
    abstract void run(); 
}

abstract class Xyz {
    abstract void show();
}

abstract class SayHello {
    SayHello() {
        System.out.println("SayHello constructor called");
    }
}


class SayBye extends SayHello {
    SayBye() {
        System.out.println("SayBye constructor called");
    }
}


interface Flyer {
    void fly();
}

abstract class Bird implements Flyer {
}

class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
