package mediator.baseMethdo;

import mediator.mediator.Mediator;

public class CoffeePot {
    // 是否有必要？
    private Mediator mediator;

    public CoffeePot(Mediator mediator) {
        this.mediator = mediator;
    }

    public void makeCoffee() {
        System.out.println("开始准备咖啡");
    }
}
