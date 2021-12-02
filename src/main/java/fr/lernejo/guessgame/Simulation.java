package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private int numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public boolean initialize(int numberToGuess) {
        this.numberToGuess = numberToGuess;
        return true;
    }
    
    private boolean nextRound() {

        int nombre= (int) player.askNextGuess();

        if(nombre == numberToGuess) {
            logger.log("\nBravoo !! Vous avez la bonne réponse\n");
            return true;
        }

        if(nombre < numberToGuess){
            player.respond(true);
            logger.log("\nLe nombre est plus grand\n");
        }
        else{
            player.respond(false);
            logger.log("\nLe nombre est plus petit\n");
        }

        return false;

    }

    public void loopUntilPlayerSucceed(long nb_partiemax) {

        boolean vie = false;
        int nb_tours = 0;
        long temps = System.currentTimeMillis();

        while(!vie && nb_tours < nb_partiemax)
        {
            vie = nextRound();
            nb_tours++;
        }

        if(nb_tours < nb_partiemax){
            logger.log("\n Le nombre à deviner était le " + numberToGuess);
            temps = System.currentTimeMillis() - temps;
            logger.log("\n Temps pour trouver : "+temps);
        }
        else{
            logger.log("\nMaximum de tours atteint. Le nombre etait le : " + numberToGuess);
            logger.log("\nRéessayer une prochaine fois :)");
        }
    }
}
