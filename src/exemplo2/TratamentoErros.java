package exemplo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoErros {
    public static void main(String[] args) {
        try {
            int valor1=coletarDadosInteiro("Informe o primeiro valor");
            int valor2=coletarDadosInteiro("Informe o segundo valor");
            int resultado = calculoDivisao(valor1,valor2);
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("Erro, divisão por zero");
        } catch (InputMismatchException e){
            System.out.println("Informe apenas valores numéricos inteiros (sem o zero)");
//            System.out.println("O seguinte valor não é aceito: "+e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static int coletarDadosInteiro(String texto) throws InputMismatchException, IllegalArgumentException{
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        int valor= scanner.nextInt();
        if (valor==0){
            throw new IllegalArgumentException("Não é permitido o valor zero");
        }
        return valor;
    }
    private static int calculoDivisao(int valor1, int valor2) throws ArithmeticException{
        return valor1/valor2;
    }
}
