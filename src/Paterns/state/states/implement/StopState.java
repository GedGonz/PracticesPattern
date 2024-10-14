package Paterns.state.states.implement;

import Paterns.state.context.PlayerContext;
import Paterns.state.states.interfaces.IState;
// Los estados concretos implementan varios comportamientos
// asociados a un estado del contexto.
public class StopState implements IState {


    @Override
    public void play(PlayerContext playerContext) {
        playerContext.changeState(new PlayState());
        System.out.println("Play!");
    }

    @Override
    public void stop(PlayerContext playerContext) {

    }

    @Override
    public void next(PlayerContext playerContext) {

    }

    @Override
    public void preview(PlayerContext playerContext) {

    }
}
