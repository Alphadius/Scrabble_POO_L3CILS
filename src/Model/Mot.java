package Model;
import java.util.*;

/**
 * 
 */
public class Mot {

    /**
     * Default constructor
     */
    public Mot() {
    }

    /**
     * 
     */
    private int idMot;

    /**
     * 
     */
    private Jeton mot;

    /**
     * 
     */
    private int taille ;

    private int pointsDuMot ;



    /**
     * 
     */
    public void isValid() {
        // TODO implement here
    }

    public int getIdMot() {
        return idMot;
    }

    public void setIdMot(int idMot) {
        this.idMot = idMot;
    }

    public Jeton getMot() {
        return mot;
    }

    public void setMot(Jeton mot) {
        this.mot = mot;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPointsDuMot() {
        return pointsDuMot;
    }

    public void setPointsDuMot(int pointsDuMot) {
        this.pointsDuMot = pointsDuMot;
    }
}