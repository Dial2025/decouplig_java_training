package fr.lernejo.guessgame;

public interface Player {

    int askNextGuess();
    void respond(boolean lowerOrGreater);

}
