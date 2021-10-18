package Model;
import java.util.*;

/**
 * 
 */
public interface InterfaceSac {


    int size() ;

    boolean isEmpty();

    boolean contains(Jeton j);

    boolean add( Jeton j) ;

    Jeton remove() ;

    boolean addAll(InterfaceSac si);

    boolean removeAll(InterfaceSac si);

     void clear();

}