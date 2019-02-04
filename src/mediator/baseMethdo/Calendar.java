package mediator.baseMethdo;

import mediator.mediator.Mediator;

import java.time.LocalDate;

public class Calendar {
    private Mediator mediator;

    public Calendar(Mediator mediator) {
        this.mediator = mediator;
    }

    public int getDay() {
        return LocalDate.now().getDayOfWeek().getValue();
    }
}
