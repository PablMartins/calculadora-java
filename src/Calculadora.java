import java.util.Scanner;

public class Calculadora {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("""
                -----------------------------------
                       Calculadora JAVA 2k25
                          Seja Bem-Vindo!!!
                -----------------------------------
                """);
        System.out.print("Digite o 1º número: ");
        double numero1 = leitura.nextDouble();
        System.out.print("Digite o 2º número: ");
        double numero2 = leitura.nextDouble();
        System.out.print("Escolha a operação desejada (+, -, *, /): ");
        char operacaoEscolhida = leitura.next().charAt(0);
        leitura.close();
        double resultadoOperacao = 0;


        switch (operacaoEscolhida){
            case '+':
                resultadoOperacao = numero1 + numero2;
                break;
            case '-':
                resultadoOperacao = numero1 - numero2;
                break;
            case '*':
                resultadoOperacao = numero1 * numero2;
                break;
            case '/':
                resultadoOperacao = numero1 / numero2;
                break;
            default:
                System.out.printf("Operação Invalida!!");
                return;
        }
        System.out.println("O resultado de " +numero1+ " " +operacaoEscolhida+ " " +numero2+ " e igual a " +resultadoOperacao);
    }
}
