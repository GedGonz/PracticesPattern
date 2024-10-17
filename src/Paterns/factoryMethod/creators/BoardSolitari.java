package Paterns.factoryMethod.creators;

import Paterns.factoryMethod.products.IGame;
import Paterns.factoryMethod.products.SolitariGame;
import Paterns.factoryMethod.type.TypeGame;

public class BoardSolitari extends  AbstractBoard{

    @Override
    TypeGame getType() {
        return TypeGame.SOLITARI;
    }
    @Override
    IGame createGame() {
        return new SolitariGame();
    }
}
