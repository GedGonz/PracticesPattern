package Paterns.state.states.interfaces;

import Paterns.state.context.PlayerContext;

public interface IState {

    // La interfaz estado base declara métodos que todos los estados
    // concretos deben implementar, y también proporciona una
    // referencia inversa al objeto de contexto asociado con el
    // estado. Los estados pueden utilizar la referencia inversa
    // para dirigir el contexto a otro estado.
    void play(PlayerContext playerContext);
    void stop(PlayerContext playerContext);
    void next(PlayerContext playerContext);
    void preview(PlayerContext playerContext);

}
