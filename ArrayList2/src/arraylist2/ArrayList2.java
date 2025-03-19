
package arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<>();
        
        listaNomes.add("Ana");
        listaNomes.add("Carlos");
        listaNomes.add("Bruna");
        listaNomes.add("Daniel");
        listaNomes.add("Eduardo");
        
         for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("Nome #" + i + ": " + listaNomes.get(i));
        }
        
        System.out.println("Remova um nome da lista");
        listaNomes.remove(scanner.nextLine());
        
        System.out.println("Após remover o nome digitado:");
        System.out.println("(Se o nome ainda aparecer, algo foi digitado errado, ou o nome nao esta presente na lista)");
        for (String fruta : listaNomes) {
            System.out.println(fruta);
        }
    }
    
}
