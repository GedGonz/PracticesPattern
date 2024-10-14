package Paterns.state;


import Paterns.state.context.PlayerContext;

public class Main {
    public static void main(String[] args) {



        PlayerContext playerContext = new PlayerContext();
        System.out.println(playerContext.getState());
        playerContext.play();
        System.out.println(playerContext.getState());
        playerContext.preview();
        System.out.println(playerContext.getState());
        playerContext.stop();
        System.out.println(playerContext.getState());

    }
}