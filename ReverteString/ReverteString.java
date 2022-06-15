// Autor: Guilherme da Costa Silva
// Descrição do problema
// O programa deve: inverter os caracteres de uma string

package ReverteString;

import java.util.Scanner;

public class ReverteString {
    public static void main(String[] args) {
        // Variável necessária para receber dados do teclado
        Scanner entrada = new Scanner(System.in);

        // Mensagem que será mostrada no console para que o usuário informe um valor no teclado
        System.out.println("Digite uma String: ");

        // Recebe a String do teclado
        String str = entrada.next();

        // Inicializa uma String vazia que será transformada na String invertida
        String invertida = "";

        // Roda um loop partindo do último caracter até o primeiro adicionando na String invertida os caracteres
        for(int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        } 

        // Mostra no console a string invertida
        System.out.println(invertida);

        // Fechamento da variável usada para receber valores do teclado
        entrada.close();
    }
}