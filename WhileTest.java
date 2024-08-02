package poo.gilberto.sintaxebasica;

public class WhileTest {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10 ) {
            System.out.println(contador);
            contador++;
            // No while, é feita uma verificação de  condição antes de entrar no loop.
            // Enuanto a condição for verdareira, o bloco de código dentro do while
            // Será executado. Se a condição inicial for falsa, o código não é executado
        }
        contador = 0;
        do {
            System.out.println(contador);
            contador++;
        }  while (contador <= 10 );
        // No Do While, o bloco de código é executado antes da verificação da condição,
        // o que garante que o código será executado ao menos uma vez, mesmo que a condição seja
        // tida como falsa.
    }
}
