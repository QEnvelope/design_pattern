package pattern.state.step2;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you can't insert twice");
    }

    public void ejectQuarter() {
        System.out.println("you already turn the crank");
    }

    public void turnCrank() {
        System.out.println("you can't turn twice");
    }

    public void dispense() {

    }
}
