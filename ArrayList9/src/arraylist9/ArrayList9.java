
package arraylist9;

import java.util.ArrayList;

public class ArrayList9 {

    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        ArrayList<String> listaNomesCopiados = new ArrayList<>();
        
        listaNomes.add("Éder");
        listaNomes.add("Klint");
        listaNomes.add("Nicoly");
        listaNomes.add("Bernardo");
        listaNomes.add("Lill");
        
        System.out.println("Original");
        for(int i = 0; i < listaNomes.size(); i++){
            System.out.println("Nome #" + i + ": " + listaNomes.get(i));
        }
        
        for(int i = 0; i < listaNomes.size(); i++){
            listaNomesCopiados.add(listaNomes.get(i));
        }
        System.out.println("Cópia");
        
        for(int i = 0; i < listaNomesCopiados.size(); i++){
            System.out.println("Nome #" + i + ": " + listaNomesCopiados.get(i));
        }
    }
    
}
