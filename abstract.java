abstract class LICAgents {
    String agentName;

    LICAgents(String name) {
        this.agentName = name;
    }

    abstract double calcPremium(double amount);
    abstract double calcReturns(double amount);
    abstract void display(double amount);
}

class LIC extends LICAgents {

    LIC(String name) {
        super(name);
    }

    double calcPremium(double amount) {
        return amount * 0.05;
    }

    double calcReturns(double amount) {
        return amount * 0.02;
    }

    void display(double amount) {
        System.out.println("Agent: " + agentName);
        System.out.println("Premium on ₹" + amount + ": ₹" + calcPremium(amount));
        System.out.println("Returns on ₹" + amount + ": ₹" + calcReturns(amount));
    }
}

public class Main {
    public static void main(String[] args) {
        LIC agent = new LIC("Santhosh");
        agent.display(100000);
    }
}
