import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double numeroUm, numeroDois, numeroTres; 

        System.out.print("Digite o primeiro número: ");
            numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
            numeroDois = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
            numeroTres = scanner.nextDouble();

        double resultadoMediaAritmetica = calcularMediaAritmetica(numeroUm, numeroDois, numeroTres);
            System.out.println("O resultado da média aritmética é de " + String.format("%.1f", resultadoMediaAritmetica));
            System.out.println("-----------------------");

        double resultadoMediaHarmonica = calcularMediaHarmonica(numeroUm, numeroDois, numeroTres);
            System.out.println("O resultado da média harmônica é de: " + String.format("%.1f", resultadoMediaHarmonica));
            System.out.println("-----------------------");

        double resultadoMediaGeometrica = calcularMediaGeometrica(numeroUm, numeroDois, numeroTres);
            System.out.println("O resultado da média geométrica é de: " +String.format("%.1f",resultadoMediaGeometrica));
            System.out.println("-----------------------");

        scanner.close();
    }

    private static double calcularMediaAritmetica(double numeroUm, double numeroDois, double numeroTres) {
        double resultadoMA = (numeroUm + numeroDois + numeroTres)/3;
        return resultadoMA;  
    }

    private static double calcularMediaHarmonica (double numeroUm, double numeroDois, double numeroTres) {
        double resultadoMH = 3/(1/numeroUm + 1/numeroDois + 1/numeroTres);
        return resultadoMH;
    }

    private static double calcularMediaGeometrica(double numeroUm, double numeroDois, double numeroTres) {
        double resultadoMG = Math.cbrt(numeroUm  * numeroDois *numeroTres);
        return resultadoMG;
    }
}



