package br.com.unibrasilia.exemplojava.visao;

import javax.swing.JOptionPane;

public class ExemploJavaIf {

    public static void main(String[] args) {

        /*
            real nota;
            nota <- 9;
            se (nota >= 7)
                então
                    escreva "Aprovado";                     
                senão se (nota >= 4)
                        então
                            escreva "N3";
                        senão
                            escreva "Reprovado";
                      fimse
            fimse
         */
        double nota;
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Digite a Nota do aluno: ");        
        // nota = entrada.nextDouble();
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno (-1 para terminar):"));        
        while (nota != -1) {
            if (nota >= 7) {
                System.out.println("Aprovado!...");
                JOptionPane.showMessageDialog(null, "O Aluno esta Aprovado!");
            } else if (nota >= 4) {
                System.out.println("N3");
                JOptionPane.showMessageDialog(null, "O Aluno esta de N3!");
            } else {
                System.out.println("Reprovado!...");
                JOptionPane.showMessageDialog(null, "O Aluno esta Reprovado!");
            }
            System.out.println("......................................");            
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno (-1 para terminar):"));
        }

    }
}
