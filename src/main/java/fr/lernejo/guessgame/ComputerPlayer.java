package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerPlayer implements Player {

    private long min = Long.MIN_VALUE;
    private long max = Long.MAX_VALUE;

        @Override
        public long askNextGuess() {

            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus)
            return randomNumber;
        }

        private long middle() {
            return (min + max)/2;
        }

        @Override
        public void respond(boolean lowerOrGreater) {
            if(lowerOrGreater){
                max = middle();
            }
            else
            {
                min = middle();
            }
        }
}
