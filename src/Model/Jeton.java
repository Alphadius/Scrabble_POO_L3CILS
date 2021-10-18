package Model;
import java.util.*;

/**
 * 
 */
public class Jeton {


    /**
     * Default constructor
     */
    public Jeton() {
    }

    /**
     * 
     */
    private int idLettre;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private int valeur;


    public int getIdLettre() {
        return idLettre;
    }

    public void setIdLettre(int idLettre) {
        this.idLettre = idLettre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

}