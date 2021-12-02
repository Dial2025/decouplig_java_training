package fr.lernejo.guessgame;
import java.util.Scanner;

public interface Player {

    long askNextGuess();
    void respond(boolean lowerOrGreater);

}
