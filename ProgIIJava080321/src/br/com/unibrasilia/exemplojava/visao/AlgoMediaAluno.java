package br.com.unibrasilia.exemplojava.visao;

import javax.swing.JOptionPane;

public class AlgoMediaAluno {

    public static void main(String[] args) {
        int qtdeNotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas"));
        double[] nota = new double[qtdeNotas];

        for (int i = 0; i < nota.length; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (i + 1) + " do aluno:"));
        }
        // calcular a media;
        double soma = 0;
        double media = 0;
        for (int i = 0; i < nota.length; i++) {
            soma += nota[i];
        }     
        
        media = soma / (nota.length);
        if (media >= 7) {            
            JOptionPane.showMessageDialog(null, "O Aluno esta Aprovado com a meida "  + media + "!");
        } else if (media >= 4) {            
            JOptionPane.showMessageDialog(null, "O Aluno esta de N3 com a meida "  + media + "!");
        } else {            
            JOptionPane.showMessageDialog(null, "O Aluno esta Reprovado com a meida "  + media + "!");
        }  
        double y = 0; 
    }

}
