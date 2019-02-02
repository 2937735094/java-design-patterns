package visitor;

import visitor.part.Computer;
import visitor.part.ComputerPart;
import visitor.visitor.ComputerPartDisplayVisitor;

public class Test {
    public static void main(String[] args) {
        // Computer是一个对象的组合
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
