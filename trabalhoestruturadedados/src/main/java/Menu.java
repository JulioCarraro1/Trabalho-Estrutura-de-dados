/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoestruturadedados;
import java.util.Scanner;
/**
 *
 * @author julio
 */
public class Main {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();

        // Solicitar os elementos do vetor
        int[] array = new int[n];
        System.out.println("Digite os elementos do vetor:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Exibir o vetor original
        System.out.println("Vetor Original:");
        displayArray(array);

        // Menu de Opções
        System.out.println("\nEscolha o método de ordenação:");
        System.out.println("1 - Ordenação por Inserção");
        System.out.println("2 - Ordenação por Seleção");
        System.out.println("3 - Ordenação Bolha (Bubble Sort)");

        int choice = scanner.nextInt();

        // Chamar o método de ordenação apropriado
        switch (choice) {
            case 1:
                SortAlgorithms.insertionSort(array);
                break;
            case 2:
                SortAlgorithms.selectionSort(array);
                break;
            case 3:
                SortAlgorithms.bubbleSort(array);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        // Exibir o vetor ordenado
        System.out.println("\nVetor Ordenado:");
        displayArray(array);

        scanner.close();
    }

    // Método para exibir o vetor
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


