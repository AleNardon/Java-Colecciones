
package coleccionesEj1;

import java.util.ArrayList;
import java.util.Scanner;


public class ServicioEj1Colecc {    
    private Scanner input = new Scanner(System.in);
    
    public ArrayList<String> creaLista(){
        ArrayList<String> lista = new ArrayList();
        return lista;
    }
    
    public void rellenaList(ArrayList<String> lista){
        System.out.println("introduzaca una raza o SALIR para terminar.");
        String nom ;
        nom =input.next();
        while(!nom.toLowerCase().equals("salir")) {    
            lista.add(nom);
            System.out.println("introduzaca una raza o SALIR para terminar.");
            nom = input.next();
        }
    }
    public void imprime (ArrayList<String> lista){
        int i ;
        for(i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
}
