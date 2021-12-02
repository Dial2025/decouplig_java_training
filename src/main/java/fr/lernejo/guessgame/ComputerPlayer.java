package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class ComputerPlayer implements Player {

    private long min = Long.MIN_VALUE;
    private long max = Long.MAX_VALUE;

        @Override
        public int askNextGuess() {

            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus)
            return (int) randomNumber;
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
