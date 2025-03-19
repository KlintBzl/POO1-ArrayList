
package arraylist3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList3 {

    public static void main(String[] args) {
        
        ArrayList listaNumeros = new ArrayList<>();
        
        listaNumeros.add(39);
        listaNumeros.add(67);
        listaNumeros.add(52);
        listaNumeros.add(5);
        listaNumeros.add(12);
        listaNumeros.add(8);
        listaNumeros.add(49);
        listaNumeros.add(71);
        listaNumeros.add(99);
        listaNumeros.add(24);
        
        System.out.println("Antes da ordenagem");
        for(int i = 0; i < listaNumeros.size(); i++){
            System.out.println("Numero #" + i + ": " + listaNumeros.get(i));
        }
        
        System.out.println("Após ordenagem");
        Collections.sort(listaNumeros);
        
        for(int i = 0; i < listaNumeros.size(); i++){
            System.out.println("Numero #" + i + ": " + listaNumeros.get(i));
        }
    }
    
}
