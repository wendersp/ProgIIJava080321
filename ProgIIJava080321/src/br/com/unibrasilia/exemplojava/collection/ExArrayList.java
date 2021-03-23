
package br.com.unibrasilia.exemplojava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ExArrayList {
    
    public static void main(String[] args) {
        
        List<String>  lstNomes = new ArrayList<>();         
        
        lstNomes.add("Maria");
        lstNomes.add("Joao");
        lstNomes.add("Antonio");
        lstNomes.add("Pedro");
        lstNomes.add("Douglas");
        
        System.out.println("Tanho da lstNomes: " + lstNomes.size());
        for (String nome : lstNomes) {
            System.out.println(nome);
        }        
        lstNomes.remove("Pedro");
        lstNomes.add("Ana");
        System.out.println("------------------------------------");
        Collections.sort(lstNomes);
        for (String nome : lstNomes) {
            System.out.println(nome);
        }
        
        
    }
    
}
