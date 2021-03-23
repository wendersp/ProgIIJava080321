
package br.com.unibrasilia.exemplojava.collection;

import java.util.HashSet;
import java.util.Set;


public class ExHashSet {

    public static void main(String[] args) {
        
        Set<String> lstNomes = new HashSet<>();
        lstNomes.add("Maria");
        lstNomes.add("Joao");
        lstNomes.add("Joao");
        lstNomes.add("Antonio");
        lstNomes.add("Pedro");
        lstNomes.add("Douglas");
        
        for (String nome : lstNomes) {
            System.out.println(nome);
        }
        
        
    }
    
}
