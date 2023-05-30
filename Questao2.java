import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
          double valorProduto = scanner.nextDouble();

        double resultadoFinal = porcentagem(valorProduto); 

        System.out.println("----------------------------");
        System.out.println("O valor do produto é de R$ " + String.format("%.2f",valorProduto));
        System.out.print("O novo valor do produto com o acréscimo é de R$ " + String.format("%.2f",resultadoFinal));

        scanner.close();
    }


    private static double porcentagem(double valorProduto) { 
        double calculoPorcentagem = valorProduto * (0.1);
        double resultado = calculoPorcentagem + valorProduto;
        return resultado;
    }
}
