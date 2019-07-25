package visitor_pattern.impl;

import visitor_pattern.ComputerPart;
import visitor_pattern.ComputerPartVisitor;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
