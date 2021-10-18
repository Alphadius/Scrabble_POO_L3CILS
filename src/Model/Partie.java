package Model;
import java.util.*;


/**
 * 
 */
public class Partie {

    /**
     * Default constructor
     */
    public Partie() {
    }

    private int idPartie;
    private static  Jeton[][] grille = new Jeton[15][15];
    private Joueur joueur1 = new Joueur();
    private Joueur joueur2 = new Joueur();
    private Joueur joueur3 = new Joueur();
    private Joueur joueur4 = new Joueur();
    private boolean partieCommence = false;
    private boolean partieFinie = false;

    private boolean lettreCompteDouble = false;
    private boolean lettreCompteTriple = false;
    private boolean motCompteDouble = false;
    private boolean isMotCompteTriple = false;

    private boolean j1Gagne = false;
    private boolean j2Gagne = false;
    private boolean j3Gagne = false;
    private boolean j4Gagne = false;



    //case bleu ciel
    public boolean isLettreCompteDouble() {
        return lettreCompteDouble;
    }
    //Case bleu foncé
    public boolean isLettreCompteTriple(){
        return lettreCompteTriple;
    }
    //Case rose
    public boolean isMotCompteDouble(){
        return motCompteDouble;
    }
    //Case rouge
    public boolean isMotCompteTriple(){
        return isMotCompteTriple;
    }



    public void setCaseDouble(boolean caseCompteDouble) {
        caseCompteDouble = caseCompteDouble;
    }

    /**
     * 
     */
    public void startPartie() {
        // TODO implement here
        this.partieCommence = true;
    }

    /**
     * 
     */
    public void endPartie() {
        // TODO implement here
    }

    /**
     * 
     */
    public void swapJoueur() {
        // TODO implement here
    }

    /**
     * 
     */
    public void interruptPartie() {
        // TODO implement here
    }

    /**
     * 
     */
    public boolean J1DoitJouer() {
        // TODO implement here
        return J1DoitJouer();
    }

    /**
     * 
     */
    public boolean J2DoitJouer() {
        // TODO implement here
        return J2DoitJouer();
    }

    /**
     * 
     */
    public boolean J3DoitJouer() {
        // TODO implement here
        return J3DoitJouer();
    }

    /**
     * 
     */
    public boolean J4DoitJouer() {
        // TODO implement here
        return J4DoitJouer();
    }


    public int getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(int idPartie) {
        this.idPartie = idPartie;
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    public Joueur getJoueur3() {
        return joueur3;
    }

    public void setJoueur3(Joueur joueur3) {
        this.joueur3 = joueur3;
    }

    public Joueur getJoueur4() {
        return joueur4;
    }

    public void setJoueur4(Joueur joueur4) {
        this.joueur4 = joueur4;
    }

    public static Jeton[][] getGrille() {
        return grille;
    }

    public static void setGrille(Jeton[][] grille) {
        Partie.grille = grille;
    }

    public boolean isPartieCommence() {
        return partieCommence;
    }

    public void setPartieCommence(boolean partieCommence) {
        this.partieCommence = partieCommence;
    }

    public boolean isJ1Gagne() {
        return j1Gagne;
    }

    public void setJ1Gagne(boolean j1Gagne) {
        this.j1Gagne = j1Gagne;
    }

    public boolean isJ2Gagne() {
        return j2Gagne;
    }

    public void setJ2Gagne(boolean j2Gagne) {
        this.j2Gagne = j2Gagne;
    }

    public boolean isJ3Gagne() {
        return j3Gagne;
    }

    public void setJ3Gagne(boolean j3Gagne) {
        this.j3Gagne = j3Gagne;
    }

    public boolean isJ4Gagne() {
        return j4Gagne;
    }

    public void setJ4Gagne(boolean j4Gagne) {
        this.j4Gagne = j4Gagne;
    }

    public boolean isPartieFinie() {
        return partieFinie;
    }

    public void setPartieFinie(boolean partieFinie) {
        this.partieFinie = partieFinie;
    }
}