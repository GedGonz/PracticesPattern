package Paterns.state.context;

import Paterns.state.states.implement.ReadyState;
import Paterns.state.states.interfaces.IState;


// La clase PlayerContext actúa como un contexto. También
// mantiene una referencia a una instancia de una de las clases
// estado que representa el estado actual del reproductor de
// audio.
public class PlayerContext {

    private IState state;

    public PlayerContext() {
        this.state= new ReadyState();
    }

    public IState getState() {
        return state;
    }


    public void play() {
        state.play(this);
    }


    public void stop() {
        state.stop(this);
    }


    public void next() {
        state.next(this);
    }


    public void preview() {
        state.preview(this);
    }

    public void changeState(IState state) {
        this.state=state;
    }
}
