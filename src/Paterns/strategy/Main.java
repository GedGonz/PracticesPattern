package Paterns.strategy;

import Paterns.strategy.context.implement.Context;
import Paterns.strategy.context.interfaces.IContext;
import Paterns.strategy.strategies.implement.GatoStrategy;
import Paterns.strategy.strategies.implement.PatoStrategy;
import Paterns.strategy.strategies.implement.PerroStrategy;
import Paterns.strategy.strategies.interfaces.IStrategy;
import Paterns.strategy.strategies.types.TypeStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<IStrategy> strategies= new ArrayList<>();

        strategies.add(new GatoStrategy());
        strategies.add(new PerroStrategy());
        strategies.add(new PatoStrategy());

        IContext context = new Context(strategies);
        context.setStrategy(TypeStrategy.DUCK);
        System.out.println(context.executeStrategy());
    }
}