package com.example.aulapilha20;

import com.example.aulapilha20.pilha.PilhaArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulaPilha20Application {

    public static void main(String[] args) {
        SpringApplication.run(AulaPilha20Application.class, args);
        Scanner teclado = new Scanner(System.in);

        PilhaArrayList pilha = new PilhaArrayList();

        while (true) {
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Quantidade de pratos");
            System.out.println("4 - Lista de pratos");
            System.out.println("5 - Remover prato em posição específica");
            System.out.println("6 - Sair");
            int opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o prato: ");
                String prato = teclado.next();
                pilha.empilhar(prato);
                System.out.println("Prato empilhado: " + prato);
            } else if (opcao == 2) {
                Object prato = pilha.desempilhar();
                if (prato != null) {
                    System.out.println("Prato desempilhado: " + prato);
                }
            } else if (opcao == 3) {
                System.out.println("Quantidade de pratos: " + pilha.quantidadeDePratos());
            } else if (opcao == 4) {
                pilha.lista();
            } else if (opcao == 5) {
                System.out.println("Digite a posição do prato a ser removido: ");
                int posicao = teclado.nextInt();
                pilha.remover(posicao);
            } else if (opcao == 6) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        teclado.close();
    }
}
