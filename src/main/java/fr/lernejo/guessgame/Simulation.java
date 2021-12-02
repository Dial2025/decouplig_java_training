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

        int nombre;

        //On récupère la valeur au clavier
        Scanner clavier = new Scanner(System.in);
        System.out.print("Saisissez un nombre : ");
        nombre = clavier.nextInt();
        // On ferme les ressources
        clavier.close();

        if(nombre == numberToGuess) {
            logger.log("Dommage, Le nombre est plus grand");
            return true;
        }

        if(nombre < numberToGuess){
            player.respond(true);
            logger.log("Dommage, Le nombre est plus grand");
        }
        else{
            player.respond(false);
            logger.log("Dommage, Le nombre est plus petit");
        }

        return false;

    }

    public void loopUntilPlayerSucceed(long nb_partiemax) {

        boolean vie = false;
        int nb_tours = 0;

        while(!vie && nb_tours < nb_partiemax)
        {
            vie = nextRound();
            nb_tours++;
        }

        if(nb_tours < nb_partiemax){
            logger.log("Bravo !!\n Le nombre à deviner était le " + numberToGuess);
        }
        else{
            logger.log("Maximum de tours atteint. Le nombre etait le : " + numberToGuess);
            logger.log("Réessayer une prochaine fois :)");
        }
    }
}
