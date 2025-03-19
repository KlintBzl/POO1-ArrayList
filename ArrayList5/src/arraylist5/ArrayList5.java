
package arraylist5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList5 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        
        ArrayList<String> listaCidades = new ArrayList<>();
        
        listaCidades.add("Sapucaia do Sul");
        listaCidades.add("Canoas");
        listaCidades.add("Rio de Janeiro");
        listaCidades.add("Campinas");
        listaCidades.add("Gramado");
        
        for (int i = 0; i < listaCidades.size(); i++) {
            System.out.println("Cidade #" + i + ": " + listaCidades.get(i));
        }
        System.out.println("Selecione a cidade a subtituir com base no número após a '#':");
        int cidade = scanner1.nextInt();
        
        System.out.println("Em seguida, o nome da cidade que vai substituir a antiga:");
        listaCidades.set(cidade, scanner2.nextLine());
        
        for (int i = 0; i < listaCidades.size(); i++) {
            System.out.println("Cidade #" + i + ": " + listaCidades.get(i));
        }
    }
    
}
