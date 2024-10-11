package Paterns.strategy.strategies.interfaces;

import Paterns.strategy.strategies.types.TypeStrategy;
// La interfaz estrategia declara operaciones comunes a todas
// las versiones soportadas de algún algoritmo. El contexto
// utiliza esta interfaz para invocar el algoritmo definido por
// las estrategias concretas.
public interface IStrategy {
    TypeStrategy getType();
    String execute();
}