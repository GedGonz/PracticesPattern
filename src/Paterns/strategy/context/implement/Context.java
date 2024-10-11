package Paterns.strategy.context.implement;

import Paterns.strategy.context.interfaces.IContext;
import Paterns.strategy.strategies.interfaces.IStrategy;
import Paterns.strategy.strategies.types.TypeStrategy;

import java.util.List;
// El contexto define la interfaz de interés para los clientes.
public class Context implements IContext {

    private IStrategy strategy;

    private final List<IStrategy> strategies;
    public Context(List<IStrategy> strategies){
       this.strategies=strategies;
    }

    // Normalmente, el contexto acepta un tipo de estrategia a través
    // del constructor y también proporciona un setter
    // (modificador) para poder cambiar la estrategia durante el
    // tiempo de ejecución.
    @Override
    public void setStrategy(TypeStrategy type){

        this.strategy= strategies.stream().filter(x -> x.getType() == type)
                .findFirst()
                .orElse(null);
    }

    // El contexto delega parte del trabajo al objeto de
    // estrategia en lugar de implementar varias versiones del
    // algoritmo por su cuenta.
    @Override
    public String executeStrategy() {
        return strategy.execute();
    }
}
