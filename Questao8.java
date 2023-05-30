public class Questao8 {
    public static void main(String[] args) {
        
    double taxaImposto = 0.10;
    double custo = 35.50;

        double resultadoFinal = somaImposto(taxaImposto, custo); 
            System.out.println("O resultado final é R$ " + resultadoFinal);
    }

    private static double somaImposto(double A, double B) {
        double resultadoImposto = (A * B);
        double somaTotal = (resultadoImposto + B);
        return somaTotal;
    }
}


