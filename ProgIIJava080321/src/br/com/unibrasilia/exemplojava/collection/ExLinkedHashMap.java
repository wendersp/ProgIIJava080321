
package br.com.unibrasilia.exemplojava.collection;

import java.util.LinkedHashMap;
import java.util.Map;


public class ExLinkedHashMap {
   
    public static void main(String[] args) {
        Map<Integer, String> lstNomes = new LinkedHashMap<>();
        lstNomes.put(2, "Maria");
        lstNomes.put(5, "Joao");
        lstNomes.put(7, "Antonio");
        lstNomes.put(6, "Pedro");
        lstNomes.put(9, "Douglas");
        
        for (String nome : lstNomes.values()) {
            System.out.println(nome);
        }
        
        
    }
    
}
