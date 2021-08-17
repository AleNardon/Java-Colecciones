
package coleccionesEj1;

import java.util.Comparator;

public class Comparadores {
    public static Comparator<String> OrdenarPorNombreAsc = new Comparator<String>() {
        @Override
        public int compare(String t, String t1) {
            return t.compareTo(t1);
            
        }
    };
    public static Comparator<String> OrdenarPorNombreDesc = new Comparator<String>() {
        @Override
        public int compare(String t, String t1) {
            return t1.compareTo(t);
            
        }
    };
}
