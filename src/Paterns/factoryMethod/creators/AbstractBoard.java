package Paterns.factoryMethod.creators;

import Paterns.factoryMethod.products.IGame;
import Paterns.factoryMethod.type.TypeGame;

public abstract class AbstractBoard {

    private IGame game;

    abstract TypeGame getType();
    abstract IGame createGame();

    public  TypeGame getTypeBoard(){
        return  getType();
    }
    public void initialize(){
        this.game = createGame();
        this.game.start();
    }
}
