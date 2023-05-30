public class Questao7 {
    public static void main(String[] args) {
        
        int numeroEscolhido = 48;
        char caractere = PositivoOuNegativo(numeroEscolhido);
            System.out.println("O número é: " + caractere );;
    }

    private static char PositivoOuNegativo(int A) {
        if (A > 0) {
            return 'P';
        }
        else {
            return 'N';
        }
    }
}      