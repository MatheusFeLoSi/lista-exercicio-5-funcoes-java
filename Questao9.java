import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
            numero = scanner.nextInt();

        int numeroInvertido = inverterNumero(numero);
            System.out.println("O número invertido é: " + numeroInvertido);
    
        scanner.close();
    }

    private static int inverterNumero(int A) {
        String numeroTransformadoEmString = String.valueOf(A);
        StringBuilder reversoBuilder = new StringBuilder(numeroTransformadoEmString);
        reversoBuilder.reverse();
        String reversoString = reversoBuilder.toString();
        int reverso = Integer.parseInt(reversoString);
        return reverso;
    }
}
