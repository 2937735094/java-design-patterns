package mediator.baseMethdo;

import mediator.mediator.Mediator;

import java.time.LocalDate;

public class Calendar {
    // 是否有必要？
    private Mediator mediator;

    public Calendar(Mediator mediator) {
        this.mediator = mediator;
    }

    public int getDay() {
        return LocalDate.now().getDayOfWeek().getValue();
    }
}
