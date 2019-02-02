package visitor.visitor;

import visitor.part.Computer;
import visitor.part.Keyboard;
import visitor.part.Monitor;
import visitor.part.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
