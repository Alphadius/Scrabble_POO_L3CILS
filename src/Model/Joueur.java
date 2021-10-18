package Model;
import java.util.*;


/**
 * 
 */
public class Joueur {

    /**
     * Default constructor
     */
    public Joueur() {
    }



    /**
     * 
     */
    private int idJoueur;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private int points;





    public void poserMot(Mot m) {
        // TODO implement here

    }


    public void addPoint( int points) {
        // TODO implement here
    }


    public void piocher( Jeton j) {
        // TODO implement here
    }


    public void scrabble(int points) {
        // TODO implement here
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}