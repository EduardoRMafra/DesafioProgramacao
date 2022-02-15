import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {
    static int caracteresFaltando = 0;
    public static void main(String[] args) {
        System.out.print("Digite uma senha: ");
        Scanner entrada = new Scanner(System.in);
        String senha = entrada.nextLine().trim();
        entrada.close();
        
        if(senhaValida(senha)){
            System.out.println("Senha foi definida com sucesso.");
        }
        else{
            System.out.println(caracteresFaltando);
        }

    }

    static boolean senhaValida(String senha){
        Pattern digito = Pattern.compile("[0-9]");
        Pattern letrasMin = Pattern.compile("[a-z]");
        Pattern letrasMai = Pattern.compile("[A-Z]");
        Pattern caracEspeciais = Pattern.compile("[!@#$%^&*()-+]");

        //verificando se possui todos os critérios
        Matcher possuiDigito = digito.matcher(senha);
        Matcher possuiLetraMin = letrasMin.matcher(senha);
        Matcher possuiLetraMai = letrasMai.matcher(senha);
        Matcher possuiCaracEspeciais = caracEspeciais.matcher(senha);

        if(!possuiDigito.find()){
            caracteresFaltando += 1;
        }
        if(!possuiLetraMin.find()){
            caracteresFaltando += 1;
        }
        if(!possuiLetraMai.find()){
            caracteresFaltando += 1;
        }
        if(!possuiCaracEspeciais.find()){
            caracteresFaltando += 1;
        }
        if(senha.length() + caracteresFaltando < 6){
            caracteresFaltando = 6 - senha.length();
        }
        if(caracteresFaltando > 0){
            return false;
        }

        return true;
    }
}
