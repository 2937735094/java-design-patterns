package mediator.baseMethdo;

import mediator.mediator.Mediator;

public class CoffeePot {
    private Mediator mediator;

    public CoffeePot(Mediator mediator) {
        this.mediator = mediator;
    }

    public void makeCoffee() {
        mediator.makeCoffee();
    }

    public void doMake(int day) {
    	if (day != 6 && day!= 7) {
            System.out.println("开始准备咖啡");
        } else {
            System.out.println("今天是周" + day + " [周末不提供咖啡]");
        }
    }
}
