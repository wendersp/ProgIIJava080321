
package br.com.unibrasilia.exemplojava.collection;

import java.util.Set;
import java.util.TreeSet;


public class ExTreeSet {

    public static void main(String[] args) {
       Set<String> lstNomes = new TreeSet<>();
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
