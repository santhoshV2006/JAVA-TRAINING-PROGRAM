class Parent {
    static void greet() {
        System.out.println("get up and study");
    }
}

class Child extends Parent {
    static void greet(String name) {
        System.out.println("chillax: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Parent.greet();

    
        Child.greet("Santhosh");
    }
}