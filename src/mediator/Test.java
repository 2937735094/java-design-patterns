package mediator;

import mediator.baseMethdo.Alarm;
import mediator.baseMethdo.Calendar;
import mediator.baseMethdo.CoffeePot;
import mediator.mediator.Mediator;

/**
 * 我也不清楚这算不算是中介模式(代码极大可能是错误的, 在README.md中我写出了自己的疑问)
 *
 * 1.每个对象都会在自己的状态改变时,告诉中介者
 * 2.每个对象都会对中介者所发出的请求作出回应   [我满足了这个]
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Alarm alarm new Alarm(mediator);
        mediator.registerAlarm(alarm);
        mediator.registerCalendar(new Calendar(mediator));
        mediator.registerCoffeePot(new CoffeePot(mediator));

        alarm.rang()
    }
}
