
package arraylist4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaNomesProdutos = new ArrayList<>();
        
        listaNomesProdutos.add("Garrafa");
        listaNomesProdutos.add("Barbante");
        listaNomesProdutos.add("Salgadinho");
        listaNomesProdutos.add("Perfume");
        listaNomesProdutos.add("Vinho");
        listaNomesProdutos.add("Pão");
        
        for (int i = 0; i < listaNomesProdutos.size(); i++) {
            System.out.println("Nome #" + i + ": " + listaNomesProdutos.get(i));
        }
        
        System.out.println("Digite o nome do produto que voce quer verificar...");
        if(listaNomesProdutos.contains(scanner.nextLine()) == true){
            System.out.println("A lista contém este produto!");
        }else{
            System.out.println("A lista não contém esse produto! Verifique se está escrito certo...");
            
        }
        
    }
    
}
