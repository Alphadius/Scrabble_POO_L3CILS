package Model;
import java.util.*;

/**
 * 
 */
public class Chevalet {

    /**
     * Default constructor
     */
    public Chevalet() {
    }


    private int idChevalet;
    private int numChevalet;
    private static int nbChevalet;
    private int nbJeton;


    private Jeton[] J1mesJeton;



    public void initChevalet(int nbJeton) {
        // TODO implement here
    }

    public int getIdChevalet() {
        return idChevalet;
    }

    public void setIdChevalet(int idChevalet) {
        this.idChevalet = idChevalet;
    }

    public int getNumChevalet() {
        return numChevalet;
    }

    public void setNumChevalet(int numChevalet) {
        this.numChevalet = numChevalet;
    }

    public static int getNbChevalet() {
        return nbChevalet;
    }

    public static void setNbChevalet(int nbChevalet) {
        Chevalet.nbChevalet = nbChevalet;
    }

    public int getNbJeton() {
        return nbJeton;
    }

    public void setNbJeton(int nbJeton) {
        this.nbJeton = nbJeton;
    }
}