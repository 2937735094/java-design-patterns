package mediator.baseMethdo;

import mediator.mediator.Mediator;

public class Alarm {
    // 是否有必要？
    private Mediator mediator;

    public Alarm(Mediator mediator) {
        this.mediator = mediator;
    }

    public void rang() {
        System.out.println("闹钟响了");
    }
}