package Model;
//import java.util.*;

/**
 * 
 */
public abstract class SacAbstrait implements InterfaceSac {


    public int size() {
        Jeton j = remove();
        if(j == null){
            return 0;
        }
        int cpt = 1+ size();
        this.add(j);
        return cpt;
    }


    public boolean isEmpty() {
        if(size() == 0) return true;
        return false;
    }

    public boolean contains( Jeton j) {
        Jeton jeton = remove();
        boolean rep;
        if(jeton == null) return false;

        if(jeton.equals(j)){
            rep= true;
        }else{
            rep=contains(j);
        }
        this.add(jeton);
        return rep;
    }

    public boolean remove(Jeton j){
        boolean rep = false;
        if(!this.isEmpty()){
            Jeton j2 = this.remove();
            if(j2.equals(j)){
                rep=true;
            }else{
                rep=this.remove(j);
                this.add(j2);
            }
        }
        return rep;
    }


    public boolean addAll(InterfaceSac si) {
        Jeton jeton = si.remove();
        if( jeton == null){
            return false;
        }
        boolean rep = add(jeton) || addAll(si);
        si.add(jeton);
        return rep;
    }


    public boolean removeAll(InterfaceSac si) {
        boolean rep = false;
        if(!si.isEmpty()){
            Jeton j = si.remove();
            rep=this.remove(j);
            rep = rep || this.removeAll(si);
            si.add(j);
        }
        return rep;
    }


    public void clear() {
        while (!this.isEmpty()) {
            this.remove();
        }
    }


}