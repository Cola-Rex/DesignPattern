package visitor_pattern;

import visitor_pattern.impl.Computer;
import visitor_pattern.impl.Keyboard;
import visitor_pattern.impl.Monitor;
import visitor_pattern.impl.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
