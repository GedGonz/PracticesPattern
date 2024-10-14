package Paterns.state.states.implement;

import Paterns.state.context.PlayerContext;
import Paterns.state.states.interfaces.IState;
// Los estados concretos implementan varios comportamientos
// asociados a un estado del contexto.
public class PlayState implements IState {


    @Override
    public void play(PlayerContext playerContext) {

    }

    @Override
    public void stop(PlayerContext playerContext) {
        playerContext.changeState(new StopState());
        System.out.println("Stop!");
    }

    @Override
    public void next(PlayerContext playerContext) {
        playerContext.changeState(new NextState());
        System.out.println("Next!");
    }

    @Override
    public void preview(PlayerContext playerContext) {
        playerContext.changeState(new PreviewState());
        System.out.println("Preview!");
    }
}
