
package arraylist12;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList12 {

    public static void main(String[] args) {
        ArrayList listaNumeros = new ArrayList<>();
        
        listaNumeros.add(6);
        listaNumeros.add(4);
        listaNumeros.add(8);
        listaNumeros.add(1);
        listaNumeros.add(10);
        listaNumeros.add(7);
        
        System.out.println("Lista original");
        for(int i = 0; i < listaNumeros.size(); i++){
            System.out.println("Número #" + i + ": " + listaNumeros.get(i));
        }
        Collections.sort(listaNumeros);
        
        System.out.println("Menor número");
        System.out.println(listaNumeros.get(0));
        System.out.println("Maior número");
        System.out.println(listaNumeros.get(listaNumeros.size()-1));
    }
    
}
