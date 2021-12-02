package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args) {

        try {
            if (args.length > 0 && "-interactive".equals(args[0])) {

                long nb_partiemax = Long.MAX_VALUE;

                HumanPlayer hum_player = new HumanPlayer();
                Simulation simulation = new Simulation(hum_player);
                SecureRandom random = new SecureRandom();
                int randomNumber = random.nextInt(100);
                simulation.initialize(randomNumber);
                simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);

            } else if (args.length > 1 && "-auto".equals(args[0])) {

                ComputerPlayer compu_player = new ComputerPlayer();
                Simulation simulation = new Simulation(compu_player);
                long nbr = Long.parseLong(args[1]);
                simulation.initialize((int) nbr);
                simulation.loopUntilPlayerSucceed(1000);

            } else {
                System.out.println("Mauvais paramétrages");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
