package View;

import java.util.Scanner;
import Controller.Vetor;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor (máximo 100): ");
        int n = sc.nextInt();

        if (n <= 0 || n > 100) {
            System.out.println("Tamanho inválido! Informe um valor entre 1 e 100.");
        } else {

            int[] vetor = new int[n];

            // Entrada dos valores
            for (int i = 0; i < n; i++) {
                System.out.print("Digite o valor da posição " + i + ": ");
                vetor[i] = sc.nextInt();
            }

            // Instanciando a classe de controle
            Vetor controller = new Vetor();

            // Chamando o método que usa for-each
            controller.analisarVetor(vetor);
        }

        sc.close();
    }
}
