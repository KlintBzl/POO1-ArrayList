
package arraylist13;

import java.util.ArrayList;

public class ArrayList13 {

    public static void main(String[] args) {
        ArrayList listaNumeros1 = new ArrayList<>();
        ArrayList listaNumeros2 = new ArrayList<>();
        ArrayList listaNumeros = new ArrayList<>();
        
        listaNumeros1.add(10);
        listaNumeros1.add(9);
        listaNumeros1.add(8);
        listaNumeros1.add(7);
        listaNumeros1.add(6);
        
        System.out.println("");
        System.out.println("Primeira lista");
        for(int i = 0; i < listaNumeros1.size(); i++){
            System.out.println("Número #" + i + ": " + listaNumeros1.get(i));
        }
        
        listaNumeros2.add(5);
        listaNumeros2.add(4);
        listaNumeros2.add(3);
        listaNumeros2.add(2);
        listaNumeros2.add(1);
        
        System.out.println("");
        System.out.println("Segunda lista");
        for(int i = 0; i < listaNumeros2.size(); i++){
            System.out.println("Número #" + i + ": " + listaNumeros2.get(i));
        }
        
        for(int i = 0; i < listaNumeros1.size(); i++){
            listaNumeros.add(listaNumeros1.get(i));
        }
        for(int i = 0; i < listaNumeros2.size(); i++){
            listaNumeros.add(listaNumeros2.get(i));
        }
        
        System.out.println("");
        System.out.println("Listas juntas");
        for(int i = 0; i < listaNumeros.size(); i++){
            System.out.println("Número #" + i + ": " + listaNumeros.get(i));
        }
    }
    
}
