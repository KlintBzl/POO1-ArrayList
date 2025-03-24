
package arraylist10;

import java.util.ArrayList;

public class ArrayList10 {

    public static void main(String[] args) {
        ArrayList listaNumeros = new ArrayList<>();
        
        listaNumeros.add(9);
        listaNumeros.add(10);
        listaNumeros.add(7);
        listaNumeros.add(65);
        listaNumeros.add(12);
        
        for(int i = 0; i < listaNumeros.size(); i++){
            System.out.println("Nome #" + i + ": " + listaNumeros.get(i));
        }
    }
    
}
