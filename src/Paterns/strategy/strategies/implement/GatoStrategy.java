
package Paterns.strategy.strategies.implement;
import Paterns.strategy.strategies.interfaces.IStrategy;
import Paterns.strategy.strategies.types.TypeStrategy;

public class GatoStrategy implements IStrategy {

    @Override
    public TypeStrategy getType() {
        return TypeStrategy.CAT;
    }

    @Override
    public String execute() {
        return "Miua Miua...";
    }
}