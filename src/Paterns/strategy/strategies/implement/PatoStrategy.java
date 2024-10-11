
package Paterns.strategy.strategies.implement;
import Paterns.strategy.strategies.interfaces.IStrategy;
import Paterns.strategy.strategies.types.TypeStrategy;

public class PatoStrategy implements IStrategy {

    @Override
    public TypeStrategy getType() {
        return TypeStrategy.DUCK;
    }
    @Override
    public String execute() {
        return "Cuac Cuac..";
    }
}