
package br.com.unibrasilia.exemplojava.collection;

import java.util.LinkedHashSet;
import java.util.Set;


public class ExLinkedHashSet {

    
    public static void main(String[] args) {
       Set<String> lstNomes = new LinkedHashSet<>();
        lstNomes.add("Maria");
        lstNomes.add("Joao");
        lstNomes.add("Antonio");
        lstNomes.add("Pedro");
        lstNomes.add("Douglas");
        
        for (String nome : lstNomes) {
            System.out.println(nome);
        }
    }
    
}
