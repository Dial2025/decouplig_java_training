package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;


public class HumanPlayer implements Player{

        private final Logger logger = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {
        logger.log("Choisir un nombre : ");
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (NumberFormatException e) {
                logger.log("Veuillez rentrer un nombre !");
            }
        } while(true);
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            logger.log("C'est plus \n");
        }
        else
        {
            logger.log("C'est moins\n");
        }
    }
}
