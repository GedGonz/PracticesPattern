package Paterns.factoryMethod;

import Paterns.factoryMethod.creators.AbstractBoard;
import Paterns.factoryMethod.creators.BoardChess;
import Paterns.factoryMethod.creators.BoardSolitari;
import Paterns.factoryMethod.type.TypeGame;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<AbstractBoard> listBoard = new ArrayList<>();
        listBoard.add(new BoardChess());
        listBoard.add(new BoardSolitari());

        AbstractBoard boardGame=listBoard.stream().filter(board-> board.getTypeBoard()== TypeGame.SOLITARI).findFirst().orElse(null);
        boardGame.initialize();
    }
}
