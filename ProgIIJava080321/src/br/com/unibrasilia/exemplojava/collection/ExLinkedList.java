package br.com.unibrasilia.exemplojava.collection;

import java.util.LinkedList;
import java.util.List;

public class ExLinkedList {

    public static void main(String[] args) {

        List<String> lstNomes = new LinkedList<>();
        lstNomes.add("Maria");
        lstNomes.add("Joao");
        lstNomes.add("Joao");
        lstNomes.add("Antonio");
        lstNomes.add("Pedro");
        lstNomes.add("Douglas");
        
        System.out.println("Tanho da lstNomes: " + lstNomes.size());
        
        for (String nome : lstNomes) {
            System.out.println(nome);
        }

    }

}
