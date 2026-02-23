package Controller;

public class Vetor {

    // Construtor
    public Vetor() {
        // Utilizado para instanciar a classe
    }

    // Metodo que percorre o vetor usando for-each
    public void analisarVetor(int[] vetor) {

        for (int numero : vetor) {

            // Se for ímpar
            if (numero % 2 != 0) {
                System.out.println(numero + " é ímpar");
            }
            // Se for par e múltiplo de 10
            else if (numero % 10 == 0) {
                System.out.println(numero + " é par e múltiplo de 10");
            }

        }
    }
}