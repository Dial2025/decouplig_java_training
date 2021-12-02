package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

import java.util.Scanner;

public class HumanPlayer implements Player{

        private final Logger logger = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
