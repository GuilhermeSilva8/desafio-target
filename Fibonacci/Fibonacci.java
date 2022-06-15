// Autor: Guilherme da Costa Silva
// Descrição do problema
// O programa deve: informado um número inteiro, calcular a sequência de fibonacci
// Retornar uma mensagem avisando se o número informado pertence ou não a sequência

package Fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Cria um array que irá armazenar a sequência de fibonacci
        ArrayList<Integer> fibo = new ArrayList<Integer>();

        // Adiciona os elementos 0 e 1 nas primeiras posições
        fibo.add(0);
        fibo.add(1);

        // Variável necessária para receber dados do teclado
        Scanner entrada = new Scanner(System.in);

        // Mensagem que será mostrada no console para que o usuário informe um valor no teclado
        System.out.println("Digite um numero inteiro: ");

        // A lógica está cercada por um bloco try-catch pois o valor informado pode não ser um inteiro e isso gera uma exceção
        try{
            // Recebe o valor do teclado
            int num = entrada.nextInt();

            // Função que calcula a sequência de Fibonacci
            calculaSequencia(fibo, num);

            // Função que informa se o número pertence ou não a sequência
            pertenceSequencia(fibo, num);
        } catch(Exception e) {
            System.out.println("O valor inserido nao foi um inteiro");
        }

        // Fechamento da variável usada para receber valores do teclado
        entrada.close();
    }

    private static void calculaSequencia(ArrayList<Integer> fibo ,int num) {
        // Enquanto o número informado pelo usuário for maior ou igual ao próximo elemento a ser calculado na sequência
        // O elemento será calculado e inserido na sequência
        while(fibo.get(fibo.size() - 2) + fibo.get(fibo.size() - 1) <= num) {
            fibo.add(fibo.get(fibo.size() - 2) + fibo.get(fibo.size() - 1));
        }
    }

    private static void pertenceSequencia(ArrayList<Integer> fibo ,int num) {
        // Imprime no console se o número informado pelo usuário pertence ou não a sequência
        System.out.println(fibo.contains(num) ? "O numero " + num + " pertence a sequência" : "O numero " + num + " nao pertence a sequencia");
    }
}