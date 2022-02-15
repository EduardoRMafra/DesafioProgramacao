import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escreva a altura da escada: ");
        int tamanho = entrada.nextInt();
        entrada.close();

        String degrau = "";

        for(int i = 1; i <= tamanho; i++){
            for(int j = 1; j <= tamanho; j++){
                if(j <= tamanho - i){
                    degrau += " ";
                }
                else{
                    degrau += "*";
                }
            }
            System.out.println(degrau);
            degrau = "";
        }
    }
}
