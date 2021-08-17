package coleccionesEj1;

import java.util.ArrayList;
import coleccionesEj1.ServicioEj1Colecc;
import coleccionesEj1.Comparadores;
import java.util.Collections;

public class ColeccionesEj1 {
    

    public static void main(String[] args) {
        ServicioEj1Colecc serv =new ServicioEj1Colecc();
        ArrayList<String> lista = serv.creaLista();
        serv.rellenaList(lista);
        serv.imprime(lista);
        
        System.out.println("\nComparadorrrr.\n");
        Collections.sort(lista, Comparadores.OrdenarPorNombreDesc);
        serv.imprime(lista);
        
        System.out.println("\nComparadorrrr.\n");
        Collections.sort(lista, Comparadores.OrdenarPorNombreAsc);
        serv.imprime(lista);
    }    
}
