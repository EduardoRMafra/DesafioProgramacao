import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palavra = entrada.nextLine().trim();
        entrada.close();
        int anagramas = 0;
        
        // A palavra ovo possuí apenas 2 pares, [o, o] e [ov, vo].
        for(int i = 1; i <= palavra.length(); i++){
            for (int j = 0; j <= palavra.length(); j++) {
                for(int k = j + 1; k <= palavra.length(); k++){
                    if(j + i <= palavra.length() && k + i <= palavra.length()){
                        String[] primeira = palavra.substring(j, j + i).split("");
                        String[] segunda = palavra.substring(k, k + i).split("");
                        if(saoPares(primeira, segunda)){
                            anagramas++;
                        }
                    }
                }
            }
        }
        System.out.println(anagramas);
    }
    static boolean saoPares(String[] p, String[] s){
        Arrays.sort(p);
        Arrays.sort(s);

        return Arrays.equals(p, s);
    }
}
