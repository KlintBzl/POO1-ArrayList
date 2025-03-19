
package arraylist1;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite até 5 números...");
        
        ArrayList listaNumeros = new ArrayList<>();
        
        for(int i = 0; i < 5; i++){
        listaNumeros.add(scanner.nextInt());
            
        }
            System.out.println("Numeros: " + listaNumeros);
    }
    
}
