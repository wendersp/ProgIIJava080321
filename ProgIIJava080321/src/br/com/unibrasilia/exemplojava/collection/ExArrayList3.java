
package br.com.unibrasilia.exemplojava.collection;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ExArrayList3 {

    public static void main(String[] args) {
       List<String> lstNomes = new ArrayList<>();
       
       String nome = JOptionPane.showInputDialog("Digite um nome: (Digite Sair para terminar) ");
       while (!nome.equalsIgnoreCase("sair")) {
           lstNomes.add(nome);
           nome = JOptionPane.showInputDialog("Digite um nome: (Digite Sair para terminar) ");
       }
       
       for (String n: lstNomes) {
           System.out.println(n);
       }
       
       
        
    }
    
}
