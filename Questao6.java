public class Questao6 {
    public static void main(String[] args) {
        int numeroUm = 10;
        int numeroDois = 20;
        int numeroTres = 30;

        int resultadoFinal = somarArgumentos(numeroUm, numeroDois, numeroTres);
            System.out.println("O resultado da soma dos argumentos é de: " + resultadoFinal);
    }

    private static int somarArgumentos(int A, int B, int C) {
        int resultado = (A + B + C);
        return resultado;
    }
}
