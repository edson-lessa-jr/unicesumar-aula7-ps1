package exemplo1;

import java.util.Scanner;

public class Modulacao {
    public static void main(String[] args) {

        String texto = coletarTextoConsole("Infome o seu nome");
        System.out.println(texto);
        texto = coletarTextoConsole("Infome seu sobrenome");
        System.out.println(texto);
    }
    public static String coletarTextoConsole(String textoExibicao){
        Scanner scanner = new Scanner(System.in);
        System.out.println(textoExibicao);
        String valor = scanner.nextLine();
        return valor;
    }
}
