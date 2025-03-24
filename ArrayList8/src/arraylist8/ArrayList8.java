
package arraylist8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList8 {

    public static void main(String[] args) {
        ArrayList listaNumeros = new ArrayList<>();
        
        listaNumeros.add(6);
        listaNumeros.add(5);
        listaNumeros.add(4);
        listaNumeros.add(3);
        listaNumeros.add(2);
        listaNumeros.add(1);
        
        System.out.println("Lista original");
        for(int i = 0; i < listaNumeros.size(); i++){
            System.out.println("Numero #" + i + ": " + listaNumeros.get(i));
        }
        
        System.out.println("Lista invertida");
        Collections.sort(listaNumeros);
        
        for(int i = 0; i < listaNumeros.size(); i++){
            System.out.println("Numero #" + i + ": " + listaNumeros.get(i));
        }
    }
    
}
