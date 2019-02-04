package mediator.mediator;

import mediator.baseMethdo.Alarm;
import mediator.baseMethdo.Calendar;
import mediator.baseMethdo.CoffeePot;

/**
 * 当闹钟响的时候 咖啡壶热咖啡  但是周末不供应咖啡
 *
 * 分析:
 * 如果在常规的类相互引用写法中
 * alarm需要有coffeePot的引用
 * coffeePot需要有calendar的引用
 *
 * 在使用中介后 如上2个相互引用将会去除,全部交由中介管理
 */
public class Mediator {
    private Alarm alarm;
    private Calendar calendar;
    private CoffeePot coffeePot;

    // 闹钟
    public void rang() {
        // 通知咖啡壶开始煮咖啡, 周末不要供应咖啡
        coffeePot.makeCoffee();
    }

    // 咖啡壶
    public void makeCoffee() {
        int day = calendar.getDay();
        coffeePot.doMake(day);
    }

    public void registerAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void registerCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public void registerCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }
}
