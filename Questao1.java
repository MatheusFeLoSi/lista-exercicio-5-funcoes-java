import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double primeiroNumero, segundoNumero, resultado;

        System.out.print("Digite o primeiro número: ");
            primeiroNumero = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
            segundoNumero = scanner.nextDouble();

        resultado = mediaAritimetica(primeiroNumero, segundoNumero);
        System.out.println("A média aritmética é: " + String.format("%.1f", resultado));

       scanner.close(); 
    }

    private static double mediaAritimetica(double primeiroNumero, double segundoNumero) {
        double media = (primeiroNumero + segundoNumero)/2;
        return media;
    }
}