package visitor.part;

import visitor.visitor.ComputerPartVisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}