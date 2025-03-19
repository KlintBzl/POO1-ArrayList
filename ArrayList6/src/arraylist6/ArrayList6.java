
package arraylist6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerProcurar = new Scanner(System.in);
        
        ArrayList<String> listaPalavras = new ArrayList<>();
        
        int quantidade = 0;
        
            System.out.println("Digite as palavras aleatorias ou não...");
            System.out.println("(Digite 'fim', para terminar de escrever)");
            
        for(int i = 0; i <= 10000; i++){
        listaPalavras.add(scanner.nextLine());
        
        if("fim".equals(listaPalavras.get(i))){
            System.out.println("Looping terminado");
            break;
        }
        }
        
        System.out.println("Digite a palavra a ser procurada...");
        String palavra = scannerProcurar.nextLine();
        
        for(int i = 0; i < listaPalavras.size(); i++){
            if(palavra.equals(listaPalavras.get(i))){
                quantidade += 1;
        System.out.println("Quantidade de aparições: " + quantidade);
        }
        }
    }
}
