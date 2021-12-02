package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        try {
            if (args[0].equals("-interactive")) {
                HumanPlayer humanPlayer = new HumanPlayer();
                Simulation simulation = new Simulation(humanPlayer);
                SecureRandom random = new SecureRandom();
                long randomNumber = random.nextInt(100);
                simulation.initialize((int) randomNumber);
                simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
