package mediator.baseMethdo;

import mediator.mediator.Mediator;

public class Alarm {
    private Mediator mediator;

    public Alarm(Mediator mediator) {
        this.mediator = mediator;
    }

    public void rang() {
    	// 这里可以做一些其他工作
    	System.out.println("响铃");
        mediator.rang();
    }
}