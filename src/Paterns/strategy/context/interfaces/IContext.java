
package Paterns.strategy.context.interfaces;

import Paterns.strategy.strategies.interfaces.IStrategy;
import Paterns.strategy.strategies.types.TypeStrategy;

public interface IContext {

    void setStrategy(TypeStrategy type);
    String executeStrategy();
}