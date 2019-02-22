package pattern.state.step2;

public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("you haven't insert a quarter");
    }

    public void turnCrank() {
        System.out.println("you haven't insert a quarter");
    }

    public void dispense() {
        System.out.println("you haven't insert a quarter");
    }
}
