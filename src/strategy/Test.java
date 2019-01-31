package strategy;

import strategy.animal.Animal;
import strategy.animal.Cat;
import strategy.animal.Dog;
import strategy.behavior.run.NormalRun;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.show();

        animal = new Cat();
        animal.show();

        animal.setRun(new NormalRun()); // 行为变更
        animal.show();
    }
}
