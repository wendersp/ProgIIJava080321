package br.com.unibrasilia.exemplojava.visao;

public class ExemploJavaSwtch {

    public static void main(String[] args) {

        int x = 3;

        switch (x) {
            case 0:
                System.out.println("case 0");
                break;
            case 1:
                System.out.println("case 1");
                break;
            case 2:
            case 3:
                System.out.println("case 2 e 3");
                break;
            default:
                System.out.println("default");                
        }
    }

}
