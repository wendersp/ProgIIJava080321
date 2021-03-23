/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unibrasilia.exemplojava.collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wender
 */
public class ExHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> lstNomes = new HashMap<>();
        lstNomes.put(2, "Maria");
        lstNomes.put(5, "Joao");
        lstNomes.put(7, "Antonio");
        lstNomes.put(6, "Pedro");
        lstNomes.put(9, "Douglas");
        
        for (String nome : lstNomes.values()) {
            System.out.println(nome);
        }
        
        System.out.println("Nome: " + lstNomes.get(7));
    }
    
}
