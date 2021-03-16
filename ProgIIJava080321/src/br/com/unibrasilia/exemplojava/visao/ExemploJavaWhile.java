package br.com.unibrasilia.exemplojava.visao;

public class ExemploJavaWhile {

    public static void main(String[] args) {
        /*
            inteiro cont <- 0;
            enquanto (cont < 10) faça
                escreva "Contador: " + cont;
                cont <- cont + 1;
            fim enquanto
            inteiro x <- 0;
            repita
                escreva "x: " + x;
                x <- x + 1;
            até (x < 10);
         */
        int cont = 0;
        while (cont < 10) {
            System.out.println("Contador: " + cont);
            cont++;
        }
        System.out.println("Saiu do laço (While)");
        

        int x = 0;
        do {
            System.out.println("X: " + x);
            x++;
        } while (x < 10);
        System.out.println("Saiu do laço (Do/While)");
    }
}
