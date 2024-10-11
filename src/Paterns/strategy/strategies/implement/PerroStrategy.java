
package Paterns.strategy.strategies.implement;
import Paterns.strategy.strategies.interfaces.IStrategy;
import Paterns.strategy.strategies.types.TypeStrategy;

public class PerroStrategy implements IStrategy {

    @Override
    public TypeStrategy getType() {
        return TypeStrategy.DOG;
    }
    @Override
    public String execute() {
        return "Guao Guao...";
    }
}