
import Model.Jeton;

import java.util.*;


/**
 * 
 */
public class Sac {

    //création de la liste de jeton présent dans le sac avec leurs caractéristiquesé
    public HashMap<String, StatPiece> listJetonSac = new HashMap<String, StatPiece>();

    //Initialise les stats des pièces du sac
    static class StatPiece{
        public int valeur;
        public int nbPiece;

        public StatPiece(int valeur, int nbPiece){
            this.valeur = valeur;
            this.nbPiece = nbPiece;
        }



    }


    /**
     * Default constructor
     */
    public Sac() {
        // Add keys and values (Country, City)
        listJetonSac.put("A", new StatPiece(1,9));
        listJetonSac.put("B", new StatPiece(3,2));
        listJetonSac.put("C", new StatPiece(3,2));
        listJetonSac.put("D", new StatPiece(2,3));
        listJetonSac.put("E", new StatPiece(1,15));
        listJetonSac.put("F", new StatPiece(4,2));
        listJetonSac.put("G", new StatPiece(2,2));
        listJetonSac.put("H", new StatPiece(4,2));
        listJetonSac.put("I", new StatPiece(1,8));
        listJetonSac.put("J", new StatPiece(8,1));
        listJetonSac.put("K", new StatPiece(10,1));
        listJetonSac.put("L", new StatPiece(1,5));
        listJetonSac.put("M", new StatPiece(2,3));
        listJetonSac.put("N", new StatPiece(1,6));
        listJetonSac.put("O", new StatPiece(1,6));
        listJetonSac.put("P", new StatPiece(3,2));
        listJetonSac.put("Q", new StatPiece(8,1));
        listJetonSac.put("R", new StatPiece(1,6));
        listJetonSac.put("S", new StatPiece(1,6));
        listJetonSac.put("T", new StatPiece(1,6));
        listJetonSac.put("U", new StatPiece(1,6));
        listJetonSac.put("V", new StatPiece(4,2));
        listJetonSac.put("W", new StatPiece(10,1));
        listJetonSac.put("X", new StatPiece(10,1));
        listJetonSac.put("Y", new StatPiece(10,1));
        listJetonSac.put("Z", new StatPiece(10,1));
        listJetonSac.put("Joker", new StatPiece(0,2));
    }


    private int idSac;
    private int nbLettreRestante = 102;
    private Jeton jeton;





    public int getIdSac() {
        return idSac;
    }

    public void setIdSac(int idSac) {
        this.idSac = idSac;
    }

    public int getNbLettreRestante() {
        return nbLettreRestante;
    }

    public void setNbLettreRestante(int nbLettreRestante) {
        this.nbLettreRestante = nbLettreRestante;
    }

    public Jeton getJeton() {
        return jeton;
    }

    public void setJeton(Jeton jeton) {
        this.jeton = jeton;
    }
}