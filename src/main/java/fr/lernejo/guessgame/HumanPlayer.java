package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;


public class HumanPlayer implements Player{

        private final Logger logger = LoggerFactory.getLogger("player");

    @Override
    public int askNextGuess() {
        logger.log("Choisir un nombre : ");
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (NumberFormatException e) {
                logger.log("\nVeuillez rentrer un nombre !\n");
            }
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            logger.log("C'est plus grand \n");
        }
        else
        {
            logger.log("C'est plus petit \n");
        }
    }
}
