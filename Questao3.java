import java.util.Scanner;

public class Questao3 { 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de uma temperatura em Fahrenheit: ");
            double temperaturaFahrenheit = scanner.nextDouble(); 
            System.out.println("----------------------");

        double temperaturaCelsius = conveterParaCelsius(temperaturaFahrenheit);
            System.out.println("O valor da temperatura " + String.format("%.2f", temperaturaFahrenheit) + "°F convertida para celsius é de " + String.format("%.2f", temperaturaCelsius) + "°C");

        scanner.close();
    } 

    private static double conveterParaCelsius(double temperaturaFahrenheit) {
        double celsius = (temperaturaFahrenheit - 32)/ 1.8;
        return celsius;
    }
}
     
