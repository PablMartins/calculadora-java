import java.util.Scanner;

public class Calculadora {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("""
                -----------------------------------
                       Calculadora JAVA 2k25
                          Seja Bem-Vindo!!!
                -----------------------------------
                Escolha o que deseja fazer:
                1 - Fazer alguma operação
                2 - Sair da calculadora
                """);
        byte opcaoEscolhida = leitura.nextByte();
        int tamanhoLista = 1;
        double listaResultados[] = new double[tamanhoLista];
        while (opcaoEscolhida == 1) {
            System.out.print("Digite o 1º número: ");
            double numero1 = leitura.nextDouble();
            System.out.print("Digite o 2º número: ");
            double numero2 = leitura.nextDouble();
            System.out.print("Escolha a operação desejada (+, -, *, /): ");
            char operacaoEscolhida = leitura.next().charAt(0);
            double resultadoOperacao = 0;



            switch (operacaoEscolhida) {
                case '+':
                    resultadoOperacao = numero1 + numero2;
                    listaResultados = new double[]{resultadoOperacao};
                    tamanhoLista++;
                    break;
                case '-':
                    resultadoOperacao = numero1 - numero2;
                    listaResultados = new double[]{resultadoOperacao};
                    tamanhoLista++;
                    break;
                case '*':
                    resultadoOperacao = numero1 * numero2;
                    listaResultados = new double[]{resultadoOperacao};
                    tamanhoLista++;
                    break;
                case '/':
                    resultadoOperacao = numero1 / numero2;
                    listaResultados = new double[]{resultadoOperacao};
                    tamanhoLista++;
                    break;
                default:
                    System.out.printf("Operação Invalida!!");
                    return;
            }
            System.out.println("O resultado de " + numero1 + " " + operacaoEscolhida + " " + numero2 + " e igual a " + resultadoOperacao);

            System.out.println("""
                    -----------------------------------------------
                    
                        Deseja realizar outra operação? DIGITE 1
                        Deseja verificar o historico de resultados anteriores? DIGITE 2
                        Deseja encerrar a calculadora? DIGITE 3
                    
                    -----------------------------------------------
                    """);
            opcaoEscolhida = leitura.nextByte();

        }
        System.out.println(listaResultados);
        System.out.println("Você saiu da calculadora! Muito obrigado por usa-la!");
    }
}
