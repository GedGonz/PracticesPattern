package Paterns.factoryMethod.creators;

import Paterns.factoryMethod.products.ChessGame;
import Paterns.factoryMethod.products.IGame;
import Paterns.factoryMethod.type.TypeGame;

public class BoardChess extends AbstractBoard{
    @Override
    TypeGame getType() {
        return TypeGame.CHESS;
    }

    @Override
    IGame createGame() {
        return new ChessGame();
    }
}
